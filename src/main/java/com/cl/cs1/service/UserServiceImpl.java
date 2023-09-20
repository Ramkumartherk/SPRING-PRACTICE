package com.cl.cs1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hcl.cs1.dao.RoleDAO;
import com.hcl.cs1.dao.UserDAO;
import com.hcl.cs1.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	PasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private RoleDAO roleDAO;

	
	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(user.getRoles());
		userDAO.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userDAO.findByUsername(username);
	}


	@Override
	public void saveRole(Iterable i) {
		userDAO.saveAll(i);
	}
	public List<User> fetchallusers(){
		return userDAO.findAll();
	}
}

	
