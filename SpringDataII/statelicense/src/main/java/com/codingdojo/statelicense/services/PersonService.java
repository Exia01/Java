package com.codingdojo.statelicense.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	private PersonRepo personRepo;
	
	public PersonService(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}
	
	public void create(Person person) {
		System.out.println("message for you");
		personRepo.save(person);
	}
	
	public ArrayList<Person> all() {
		return (ArrayList<Person>) personRepo.findAll();
	}

	public Person findById( Long id) {
		return personRepo.findOne(id);
	}
	
}