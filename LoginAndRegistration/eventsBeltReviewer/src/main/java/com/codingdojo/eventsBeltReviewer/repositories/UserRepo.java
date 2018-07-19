package com.codingdojo.eventsBeltReviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.eventsBeltReviewer.models.User;

public interface UserRepo extends CrudRepository<User, Long>{
	List<User> findAll();
}