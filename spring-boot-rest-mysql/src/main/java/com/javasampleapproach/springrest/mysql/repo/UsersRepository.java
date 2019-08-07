package com.javasampleapproach.springrest.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasampleapproach.springrest.mysql.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
