package com.hcl.cs1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.cs1.model.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {

}
