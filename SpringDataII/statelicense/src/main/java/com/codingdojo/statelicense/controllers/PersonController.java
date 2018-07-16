package com.codingdojo.statelicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingdojo.statelicense.models.Person;
import com.codingdojo.statelicense.services.PersonService;

@Controller
// @RequestMapping("/persons")
public class PersonController {



    @Autowired
    private PersonService personService;

    @GetMapping("")
    public String index(Model model) {
        List<Person> holders = personService.all(); // we are querying for all the license holders
        model.addAttribute("holders", holders); // we add it as the attribute to use in the 
        return "index";
    }

    @RequestMapping("persons/new")
    public String newperson(@ModelAttribute("new") Person person) {
        return "newPerson";
    }
    @RequestMapping("delete/{id}")
    public String deletePerson(@PathVariable("id") Long id) {
        personService.destroy(id);
        return "redirect:/";
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
