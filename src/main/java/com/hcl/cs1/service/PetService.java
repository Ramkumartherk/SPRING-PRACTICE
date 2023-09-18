package com.hcl.cs1.service;

import java.util.List; 

import com.hcl.cs1.model.Pet;
import com.hcl.cs1.model.personalpets;

public interface PetService {

	List<Pet> fetchAllPets();
	List<personalpets> fetchpersonalpets();
	void savePet(Pet pet);
	Pet getPetById(long id);
	void updatePet(Pet pet);
	void deletePet(long id);
	void savepersonalpet(personalpets pet);
}
