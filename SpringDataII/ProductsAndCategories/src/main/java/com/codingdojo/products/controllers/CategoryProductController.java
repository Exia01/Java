package com.codingdojo.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.products.models.Category;
import com.codingdojo.products.models.Product;
import com.codingdojo.products.services.CategoryService;
import com.codingdojo.products.services.ProductService;

@Controller
@RequestMapping("/join")
public class CategoryProductController {

	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;

	@PostMapping("")
	public String join( @RequestParam("productId") Long productId, @RequestParam("categoryId") Long categoryId ){

		Category category = categoryService.findOne(categoryId);
		
		Product product = productService.findOne(productId);
		product.setId(productId);

		// All categories that belong to THIS ONE product.
		List<Category> categories =  product.getCategories();
		categories.add(category); // add the category to the lisk
		product.setCategories(categories); // set the category in the product as well.
		productService.update(product);

		return "redirect:/join";
	}

	@GetMapping("")
	public String show(Model model){
		model.addAttribute("categories",categoryService.all()); // getting all the categories and setting them as models in our forms. 
		model.addAttribute("products",productService.all()); // getting all the products and setting them as models in our form
		return "join";
	}
}
