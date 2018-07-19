package com.codingdojo.dojoOverflow.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("") // May or may not be needed, it just appends it automatically, still needs to be // typed....
public class OverflowController {
	// All the logic is being executed on the on the other controllers.
	@RequestMapping("")
	public String redir() {
		return "redirect:/questions";
	}
}
