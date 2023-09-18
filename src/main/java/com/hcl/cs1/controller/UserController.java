package com.hcl.cs1.controller;

import java.util.HashMap;    
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.cs1.model.personalpets;
import com.hcl.cs1.dao.UserDAO;
import com.hcl.cs1.service.UserServiceImpl;
import com.hcl.cs1.model.Pet;
import com.hcl.cs1.model.Role;
import com.hcl.cs1.model.User;
import com.hcl.cs1.service.PetService;
import com.hcl.cs1.service.UserService;
import com.hcl.cs1.validator.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserValidator userValidator;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PetService petService;
	

	
	 @GetMapping(value = "/registration")
	    public String registration(Model model) {
	        model.addAttribute("userForm", new User());
	        return "registrationPage";
	    }

	    @PostMapping(value = "/registration")
	    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
	    	userValidator.validate(userForm, bindingResult);
	        if (bindingResult.hasErrors()) {
	            return "registrationPage";
	        }
	        Set<Role> role=userForm.getRoles();
	        userForm.setRoles(role);	       
	        userService.save(userForm);
	        return "redirect:/login";
	    }

	    @GetMapping(value = "/login")
	    public String login(Model model, String error, String logout) {
	        if (error != null)
	            model.addAttribute("error", "Your username or password is invalid.");

	        if (logout != null)
	            model.addAttribute("message", "You have been logged out successfully.");
	        

	        return "/loginPage";
	    }


	    
	    

	    
	    @GetMapping(value="/home")
		public String home(ModelMap model) {
			List<Pet> list = petService.fetchAllPets();
			model.addAttribute("plist", list);
			return "homePage";
		}
		@GetMapping(value="/personal")
		public String personal(ModelMap model) {
			List<personalpets> list = petService.fetchpersonalpets();
			model.addAttribute("plist", list);
			return "petkennel";
		}
		
		@GetMapping(value = "/ad")
		public String addPet(ModelMap model) {
			model.addAttribute("petForm", new Pet() );
			return "addPetPage";
		}
		@PostMapping(value = "/save")
		public String savePet(@ModelAttribute("petForm") Pet pet) {
			petService.savePet(pet);
			return "redirect:/home";
		}
		@PostMapping(value="/BuyPet/{pid}")
		public String BuyPet(@PathVariable("pid") long petId) {
		Pet pet = petService.getPetById(petId);
		String ans=pet.getStatus();
		String newans="";
		if(ans.equals("BUY")){
			newans="Sold Out";
		}
		pet.setStatus(newans);
		personalpets p=new personalpets();
		p.setPetName(pet.getPetName()); 
	    p.setPetAge(pet.getPetAge()); 
	    p.setPetPlace(pet.getPetPlace()); 
	    
		      petService.savepersonalpet(p);
			return "redirect:/home";
		}
		 @GetMapping(value = "/403")
		    public String accessDenied() {
		        return "403";
		    }
		
		

	
	 
        
	
}
