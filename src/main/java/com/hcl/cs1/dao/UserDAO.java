package com.hcl.cs1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.cs1.model.User;

public interface UserDAO extends JpaRepository<User, Long> {
	 User findByUsername(String username);
	
}
