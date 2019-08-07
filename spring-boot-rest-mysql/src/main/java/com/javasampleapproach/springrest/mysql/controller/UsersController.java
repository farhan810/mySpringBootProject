package com.javasampleapproach.springrest.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.javasampleapproach.springrest.mysql.model.Users;
import com.javasampleapproach.springrest.mysql.repo.UsersRepository;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	UsersRepository usersRepo;
	
	
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		System.out.println("Get all Users...");
       
		List<Users> usersList = new ArrayList<>();
		usersRepo.findAll().forEach(usersList::add);
        if(usersList !=null) {
        	System.out.println("values are here"+ usersList.size());
        }else {
        	System.out.println("its Nulll");
        }
		
		return usersList;
	}
	
	


	
}
