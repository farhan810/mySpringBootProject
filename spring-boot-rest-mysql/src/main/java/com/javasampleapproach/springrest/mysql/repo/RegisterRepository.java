package com.javasampleapproach.springrest.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.springrest.mysql.model.Register;

public interface RegisterRepository extends CrudRepository<Register, Integer>  {

	
}
