package com.hcl.cs1.dao;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.hcl.cs1.model.personalpets;

public interface personalpetDAO extends JpaRepository<personalpets, Long> {

}