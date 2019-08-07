package com.javasampleapproach.springrest.mysql.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javasampleapproach.springrest.mysql.repo.PhotoRepository;

import com.javasampleapproach.springrest.mysql.model.Photo;

@Controller
@RequestMapping("/api")
public class PhotoController {
	
    @Autowired 
	PhotoRepository photoRepository;
    
    @PostMapping(value = "/photo")
	public Photo postPhoto(@RequestBody Photo photo1) {
       
    	System.out.println("its here ");
		Photo photovalue = photoRepository.save(new Photo("farhan","ali"));
		//System.out.println("its the name here"+customer.getName());
		return photovalue;
	}
    

	
}
