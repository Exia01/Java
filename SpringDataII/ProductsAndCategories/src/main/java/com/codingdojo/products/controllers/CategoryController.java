package com.codingdojo.products.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.products.models.Category;
import com.codingdojo.products.services.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("")
	public String Categories(Model model) {
		model.addAttribute("category", new Category());

		List<Category> categories = categoryService.all();
		model.addAttribute("categories", categories);
		return "categories";
	}

	@PostMapping("")
	public String create(@Valid @ModelAttribute("category") Category category, BindingResult res, Model model) {
		if (res.hasErrors()) {
			ArrayList<Category> categories = categoryService.all();
			model.addAttribute("categories", categories);
			return "categories";
		}
		categoryService.create(category);
		return "redirect:/categories";
	}
}
