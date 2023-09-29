package com.cl.cs1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.cl.cs1.model.Pet;
import com.cl.cs1.model.User;

public interface PetDAO extends JpaRepository<Pet, Long> {

	




}
