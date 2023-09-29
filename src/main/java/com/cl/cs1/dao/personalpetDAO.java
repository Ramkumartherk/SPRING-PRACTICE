package com.cl.cs1.dao;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.cl.cs1.model.personalpets;

public interface personalpetDAO extends JpaRepository<personalpets, Long> {

}
