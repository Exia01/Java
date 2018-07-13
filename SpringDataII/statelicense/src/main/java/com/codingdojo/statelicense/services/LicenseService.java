package com.codingdojo.statelicense.services;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.statelicense.models.License;
import com.codingdojo.statelicense.repositories.LicenseRepo;

@Service
public class LicenseService {
	
	private LicenseRepo licenseRepo;
	
	public LicenseService(LicenseRepo licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	
	public License create(License license) {
		return licenseRepo.save(license);
	}
	
	public ArrayList<License> all() {
		return (ArrayList<License>) licenseRepo.findAll();
	}

	public License findById(Long id) {
		
		Optional<License> l = licenseRepo.findById(id);
		if(l.isPresent()) {
			return l.get();
		}
		else {
			return null;
		}
	}
	
}