package com.codingdojo.statelicense.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.statelicense.models.License;
import com.codingdojo.statelicense.models.Person;
import com.codingdojo.statelicense.services.LicenseService;
import com.codingdojo.statelicense.services.PersonService;

@Controller
public class LicenseController {
	
	@Autowired
	private LicenseService licenseService;
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("license/new")
	public String newlicense(@ModelAttribute("generate") License license, Model model) {
		model.addAttribute("people", personService.all());
		return "newLicense";
	}
	
	@PostMapping("newlicense")
	public String generateLicense(@Valid @ModelAttribute("generate") License license, BindingResult result) {
		
		if (result.hasErrors()) {
			return "redirect:/newLicense";
		}
		licenseService.create(license);
		return "redirect:/";
	}
	
	@RequestMapping("show/{id}")
	public String show(Model model, @PathVariable(value="id") Long id) {
		model.addAttribute("license", licenseService.findById(id)); //searching for the license
		// System.out.println(licenseService.findById(id)); //printing it 
		Person recipient = licenseService.findById(id).getPerson();  //get the person by the id?
		// System.out.println(recipient.getId()); //getting the id of the person that we are adding the license too
		model.addAttribute("person", personService.findById(recipient.getId())); //find the person on the person table and show it. 
		return "show";
	}
	
	
}