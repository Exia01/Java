package com.codingdojo.dojosandninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	
	// SHOW ALL DOJO LOCATIONS // 
	public ArrayList<Dojo> all() {
		return (ArrayList<Dojo>) dojoRepository.findAll();
	}
	
	
	// GET A DOJO LOCATION BY IT'S ID // 
	public Dojo findOne(Long id) {
		return dojoRepository.findById(id).get();
	}
	
	
	// CREATE A NEW DOJO LOCATION // 
	public void create(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	
	// DELETE A DOJO LOCATION // 
	public void delete(Long id) {
		dojoRepository.deleteById(id);
	}
	
	
	//UPDATE A DOJO LOCATION // 
	public void update(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
}
