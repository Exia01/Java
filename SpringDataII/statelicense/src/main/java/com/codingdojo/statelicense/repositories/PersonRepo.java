package com.codingdojo.statelicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.statelicense.models.Person;

@Repository 
    public interface PersonRepo extends CrudRepository<Person, Long> {

    }

