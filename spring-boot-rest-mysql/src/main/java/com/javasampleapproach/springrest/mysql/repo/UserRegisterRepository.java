package com.javasampleapproach.springrest.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.springrest.mysql.model.UserRegister;

public interface UserRegisterRepository  extends CrudRepository<UserRegister, Integer>{

	
}
