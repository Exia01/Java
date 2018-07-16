package com.codingdojo.dojoOverflow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojoOverflow.services.AnswerService;
import com.codingdojo.dojoOverflow.services.QuestionService;
import com.codingdojo.dojoOverflow.services.TagService;

@Controller
@RequestMapping("") // May or may not be needed, it just appends it automatically, still needs to be  typed....
public class OverfllowController {

	@Autowired
	private AnswerService answerService;
	@Autowired
	private TagService tagService;
	@Autowired
	private QuestionService questionService;
	@Controller //leaving these services here in case I may need them for some reason. 
	
	//All the logic is being executed on the on the other controllers. 
	public class OverflowController {
		@RequestMapping("")
		public String redir() {
			return "redirect:/questions";
		}
	}
}
