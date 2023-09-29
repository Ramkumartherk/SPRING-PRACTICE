package com.cl.cs1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cl.cs1.model.User;

public interface UserDAO extends JpaRepository<User, Long> {
	 User findByUsername(String username);
	
}
