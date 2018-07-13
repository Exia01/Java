package com.codingdojo.dojosandninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;


@Service
public class NinjaService {
private NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	
	// SHOW ALL NINJA LOCATIONS // 
	public ArrayList<Ninja> all() {
		return (ArrayList<Ninja>) ninjaRepository.findAll();
	}
	
	
	// GET A NINJA LOCATION BY IT'S ID // 
	public Ninja findOne(Long id) {
		return ninjaRepository.findById(id).get();
	}
	
	
	// CREATE A NEW NINJA LOCATION // 
	public void create(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	
	// DELETE A NINJA LOCATION // 
	public void delete(Long id) {
		ninjaRepository.deleteById(id);
	}
	
	
	//UPDATE A NINJA LOCATION // 
	public void update(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
}
