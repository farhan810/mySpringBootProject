package com.javasampleapproach.springrest.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.javasampleapproach.springrest.mysql.model.Register;
import com.javasampleapproach.springrest.mysql.model.Users;
import com.javasampleapproach.springrest.mysql.repo.RegisterRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RegisterController {

	@Autowired
	RegisterRepository registerReposotory;
	
	 // this is working for the registration of the user .. 
	@PostMapping(value = "/register")
	public Register Register(@RequestBody Register register ) {
       
		//System.out.println("name of the user"+register.getUsername());
		//System.out.println("Register is here"+register.getPassword()+register.getDateOfBirth()+"here");
		
		Register reg = registerReposotory.save(new Register(register.getId(),register.getGender(),register.getUsername(),register.getKnownAs(),register.getDateOfBirth(),register.getCity(),register.getCountry(),register.getPassword()));
		
		return reg;
	}
	
	@PostMapping("/userbyid/{id}")
	public Register getUserById(@PathVariable("id") int id) {
		
		System.out.println("im heree Registeerr to  "+id+"<>>>>><>");
		Register _register = registerReposotory.findById(id).get();
	
	   if(_register!=null) {
		 //  System.out.println("value is found /userbyid.........."+_register.getUserName());
	   }
	   return _register;
	}
	// Get All Records mahi
		@GetMapping("/userslist")
		public List<Register> getAllUsersList() {
			//System.out.println("Get all  Users... Register Bean");
              
			List<Register> usersList = new ArrayList<>();
			registerReposotory.findAll().forEach(usersList::add);
			
			
			for(Register i : usersList) {
				  // System.out.println("An element in the list: " + i.getUsername());
				  // System.out.println("another element in lisst"+ i.getDateOfBirth());
				}
			
			return usersList;
		}
		@DeleteMapping("delete/{id}")
		public ResponseEntity<String> deleteCustomer(@PathVariable("id") int id) {
			//System.out.println("Delete Customer with ID = " + id + "...");

			registerReposotory.deleteById(id);
			return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
		}
		// updating Record
		@PutMapping("/userupdate/{id}")
		public ResponseEntity<Register> updateCustomer(@PathVariable("id") int id, @RequestBody Register register) {
			
			
			
			System.out.println("Update MemberMAHI..  with ID = " + id + "...");
                
			Optional<Register> registerData = registerReposotory.findById(id);

			if (registerData.isPresent()) {
				Register _register = registerData.get();
				_register.setUsername(register.getUsername());
				_register.setPassword(register.getPassword());
				_register.setKnownAs(register.getKnownAs());
				_register.setGender(register.getGender());
				_register.setDateOfBirth(register.getDateOfBirth());
				_register.setCountry(register.getCountry());
				_register.setCity(register.getCountry());
				
				
				return new ResponseEntity<>(registerReposotory.save(_register), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		@GetMapping("/user888")
		public Register getUserById8(@PathVariable("id") int id) {
			
		//	System.out.println("im heree Registeerr to get id ");
			Register _register = registerReposotory.findById(id).get();
		
		   if(_register!=null) {
			  // System.out.println("value is found"+_register.getUsername());
		   }
		   return _register;
		}
}
