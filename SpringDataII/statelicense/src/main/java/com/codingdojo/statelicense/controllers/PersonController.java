package com.codingdojo.statelicense.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.statelicense.models.Person;
import com.codingdojo.statelicense.services.PersonService;

@Controller
// @RequestMapping("")
public class PersonController {

    @Autowired
    private PersonService personService;
    @GetMapping("")
    public String index() {
    	// System.out.println("testing");
        return "index";
    }

    @RequestMapping("person/new")
    public String newperson(@ModelAttribute("new") Person person) {
        return "newPerson";
    }

    @PostMapping("addperson")
    public String addperson(@Valid @ModelAttribute("new") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "newPerson";
        }
        System.out.println(person.getfName());
        personService.create(person);
        return "redirect:/";
    }
}
