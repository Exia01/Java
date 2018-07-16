package com.codingdojo.dojoOverflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojoOverflow.models.Question;

@Controller
@RequestMapping("") // May or may not be needed, it just appends it automatically, still needs to be  typed....
public class TagController {

	// @Autowired
	// private CategoryService categoryService;

	@GetMapping("")
	public String root() {
		// model.addAttribute("category", new Category());

		// ArrayList<Category> categories = categoryService.all();
		// model.addAttribute("categories",categories);
		return "redirect:/questions";
	}

	@GetMapping("/questions")
	public String Categories(Model model) {
		// model.addAttribute("category", new Category());

		// ArrayList<Category> categories = categoryService.all();
		// model.addAttribute("categories",categories);
		return "index";
	}

	@GetMapping("/questions/new")
	public String newQ(Model model) {
		model.addAttribute("question", new Question());

		// ArrayList<Category> categories = categoryService.all();
		// model.addAttribute("categories",categories);
		return "newQ";
	}

// 	@PostMapping("/process")
// 	public String create( @Valid @ModelAttribute("question") Question question,
// 	BindingResult res ){
// 	if(res.hasErrors()) {
// 	return "categories";
// 	}
// 	questionService.create(question);
// 	return "redirect:/categories";
// 	}
}
