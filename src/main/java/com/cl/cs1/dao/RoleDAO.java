package com.cl.cs1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cl.cs1.model.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {

}
