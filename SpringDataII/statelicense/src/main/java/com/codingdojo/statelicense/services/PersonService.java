package com.codingdojo.statelicense.services;

import java.util.List;
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
		personRepo.save(person);
	}


	public List<Person> all() {
		return personRepo.findAll();
	}
	
	public void destroy(Long id){
		personRepo.deleteById(id);
	}


	public Person findById(Long id) {
		Optional<Person> p = personRepo.findById(id);
		if (p.isPresent()) {
			return p.get();
		} else {
			return null;
		}
	}

}