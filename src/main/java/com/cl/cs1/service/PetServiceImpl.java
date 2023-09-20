package com.hcl.cs1.service;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cs1.dao.PetDAO;
import com.hcl.cs1.dao.personalpetDAO;
import com.hcl.cs1.model.Pet;
import com.hcl.cs1.model.personalpets;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetDAO petDAO;
	@Autowired
	private personalpetDAO personal;

	@Override
	public List<Pet> fetchAllPets() {
		List<Pet> list = petDAO.findAll();
		return list;
	}

	@Override
	public void savePet(Pet pet) {
		petDAO.save(pet);
		
	}

	@Override
	public Pet getPetById(long id) {
		Optional<Pet> op = petDAO.findById(id);
		return op.get();
	}

	@Override
	public void updatePet(Pet pet) {
		petDAO.save(pet);
		
	}

	@Override
	public void deletePet(long id) {
		petDAO.deleteById(id);
		
	}

	@Override
	public void savepersonalpet(personalpets pet) {
	
	personal.save(pet);
	}

	@Override
	public List<personalpets> fetchpersonalpets() {
		 List<personalpets>list= personal.findAll();
			
			return list;
		
	}

	
	
}
