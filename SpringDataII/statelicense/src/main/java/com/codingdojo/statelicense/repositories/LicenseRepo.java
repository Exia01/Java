package com.codingdojo.statelicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codingdojo.statelicense.models.License;


@Repository
    public interface LicenseRepo extends CrudRepository<License, Long> {

//	License findbyId(Long id);
    }

