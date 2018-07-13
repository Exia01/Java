package com.codingdojo.dojosandninjas.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	// RENDERS NEW NINJA PAGE // 
	@GetMapping("/new")
	public String home(Model model) {
		model.addAttribute("ninja", new Ninja()); //this is creating a ninja object
		
		ArrayList<Dojo> dojos = dojoService.all(); //this is an array of dojos to populate. 
		model.addAttribute("dojos", dojos);//this is creating 
		return "newNinja";
	}
	
	//SHOWS NINJA BY ID // 
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("ninja", ninjaService.findOne(id));
		return "index";
	}
	
	// RENDERS DASHBOARD PAGE // 
	@GetMapping("")
	public String dojoNinjas() {
		return "index";
	}
	
	@RequestMapping(value="/process", method = RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja,BindingResult res, @ModelAttribute("dojo")Dojo dojo, Model model) {
		ArrayList<Dojo> dojos = dojoService.all(); //this is an array of dojos to populate. 
		model.addAttribute("dojos", dojos);//this is creating 
		if(res.hasErrors()) {
			return "newNinja";
		}
		else {
		ninjaService.create(ninja);
		return "redirect:/dojos/" +dojo.getId();
		}
	}
	// the mode attribute prepares the data ninja for us
	//the model 
	
	
	
}
