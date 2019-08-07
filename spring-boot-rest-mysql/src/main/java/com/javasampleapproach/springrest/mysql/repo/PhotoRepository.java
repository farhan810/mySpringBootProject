package com.javasampleapproach.springrest.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasampleapproach.springrest.mysql.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {

}
