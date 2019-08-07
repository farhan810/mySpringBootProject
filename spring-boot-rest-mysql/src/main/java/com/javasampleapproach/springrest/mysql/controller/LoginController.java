package com.javasampleapproach.springrest.mysql.controller;

  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.autoconfigure.domain.EntityScan; import
  org.springframework.http.HttpStatus; import
  org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import
  org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RequestMethod; import
  org.springframework.web.bind.annotation.RestController;
  
  import com.javasampleapproach.springrest.mysql.model.Customer; import
  com.javasampleapproach.springrest.mysql.model.Login;
import com.javasampleapproach.springrest.mysql.model.UserRegister;
import com.javasampleapproach.springrest.mysql.repo.CustomerRepository;
import com.javasampleapproach.springrest.mysql.repo.UserRegisterRepository;
import
  com.javasampleapproach.springrest.mysql.repo.loginRepository;
  
  @CrossOrigin(origins = "http://localhost:4200")
  @RestController
  
  //@EntityScan(basePackages ="com.javasampleapproach.springrest.mysql")
  
  @RequestMapping("/api") 
  public class LoginController {
  
  @Autowired 
  loginRepository loginRepository2;
  
  @Autowired
  UserRegisterRepository userRepository;
  /*
  @RequestMapping(value="/register" , method=RequestMethod.POST)
  public String userRegisteration(@RequestBody UserRegister userRegister) {
	  
	  System.out.println("welcome in the reister");
	  UserRegister user = userRepository.save(new UserRegister(userRegister.getUserName(),userRegister.getGender(),userRegister.getCity(),userRegister.getCountry(),userRegister.getPassword(),userRegister.getKnownUs(),userRegister.getDate()));
	  
	  return "success";
  }
  */
  
  
  
  
  @RequestMapping(value="/userlogin", method=RequestMethod.POST) 
  //@Transactional(readOnly = true)
  public Login loadUserByUsername(@RequestBody Login loginUser) {
      String name = loginUser.getName();
	  String pass = loginUser.getPassword();
	  System.out.println("userNameSpring"+loginUser.getName());
	  Login user = loginRepository2.findByName(loginUser.getName());
      if (user != null)
    	  { 
    	  
    	  System.out.println("user is not null "+user.getName());
    	   
    	    return user;
    	   // return new  ResponseEntity<String>(user.getName(), HttpStatus.OK);
    	   
    	  }
      else {
    	  System.out.println("user is not null");
    	  return null;
    	//  return new  ResponseEntity<String>("login faild try again !!!", HttpStatus.OK);
      }
	
  }
  @RequestMapping(value="/userlogin2", method=RequestMethod.POST) 
  public String postLoginUser() {
  
  System.out.println("request is here");
  boolean loginUser = true;
		  //loginRepository2.findAll().equals(login.getName());
 
  
  if(loginUser==true) { 
	  System.out.println("we are in login"); //return
  }
  
  return"Success";
  
  //return loginUser; }
  }
	@PostMapping(value = "/register810")
	public Login addUser(@RequestBody Login login) {
        System.out.println("we are in the login ");
		//System.out.println("im here in register"+login.getName().toString()+login.getPassword().toString());
		Login login2 = loginRepository2.save(new Login(0, login.getName(), login.getPassword()));
		System.out.println("its the name here"+login2.getName());
		//System.out.println(login.setName(login.getName()));
		return login2;
	}
  
  }
 
