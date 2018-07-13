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
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	
	@Autowired
	private DojoService dojoService;
	
	
	// RENDERS NEW DOJO PAGE // 
	@GetMapping("/new")
	public String home(Model model) {
		model.addAttribute("dojo", new Dojo());
		
		ArrayList<Dojo> dojos = dojoService.all(); //calls it from service 
		model.addAttribute("dojos", dojos); //creates it for use on the page
		return "newDojo";
	}
	
	//SHOWS DOJO BY ID // 
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dojo", dojoService.findOne(id));
		return "index";
	}
	
	// RENDERS DASHBOARD PAGE // 
	@GetMapping("")
	public String dojoNinjas() {
		return "index";
	}
	
	@RequestMapping(value="/processdojo", method = RequestMethod.POST)
	public String verifyName(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult res) {
		System.out.println(dojo.getId()); 
		if (res.hasErrors()){
			return "redirect:/dojos";
		}
		else {
			dojoService.create(dojo);
		return "redirect:/dojos/" +dojo.getId();
		}
	}
}

