package com.codingdojo.statelicense.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

//import com.codingdojo.statelicense.models.License;
import com.codingdojo.statelicense.models.Person;
import com.codingdojo.statelicense.repositories.PersonRepo;

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

	
public Person findById(Long id) {
		
		Optional<Person> p = personRepo.findById(id);
		if(p.isPresent()) {
			return p.get();
		}
		else {
			return null;
		}
	}
	
}