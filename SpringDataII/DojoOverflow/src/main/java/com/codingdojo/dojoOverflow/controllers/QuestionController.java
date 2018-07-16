package com.codingdojo.dojoOverflow.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.codingdojo.dojoOverflow.models.Question;
import com.codingdojo.dojoOverflow.models.Tag;
import com.codingdojo.dojoOverflow.services.AnswerService;
import com.codingdojo.dojoOverflow.services.QuestionService;
import com.codingdojo.dojoOverflow.services.TagService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/questions") // May or may not be needed, it just appends it automatically, still needs to be typed....
public class QuestionController {

	@Autowired
	private AnswerService answerService;
	@Autowired
	private TagService tagService;
	@Autowired
	private QuestionService questionService;

	@GetMapping("")
	public String Categories(Model model) {
		ArrayList<Question> questions = questionService.all(); // we are querying for all the Questions
		model.addAttribute("questions", questions); // we add it as the attribute to use in the model
		return "index";
	}

	@GetMapping("/new")
	public String newQ(Model model) {
		model.addAttribute("question", new Question());
		return "newQ";
	}

	@RequestMapping(value="/new", method=RequestMethod.POST)
	//the request param is used to distinguished between question and tags attribute in the incoming form
	public String createQuestion(@RequestParam("question") String question, @RequestParam("tags") String tags, RedirectAttributes redAttr) {
		tags = tags.replaceAll(" ", ""); // Replaces all spaces with no spaces, then gets checked below
		String pat1 = "([a-z]+, ?)+[a-z]+"; // looking for commas to separate text example : science,tech
		String pat2 = "[a-z]+"; // all lowercase context 
		if (question.equals("")) { // if the question is empty
			redAttr.addFlashAttribute("qError", "Question cannot be blank");
			return "redirect:/questions/new";
		}
		if (!tags.matches(pat1) && !tags.matches(pat2)) { // if the tags does not match the first and or second pattern
			redAttr.addFlashAttribute("tError", "Tags must be lowercase and separated by commas");
			return "redirect:/questions/new";
		}
		String[] newTags = tags.split(","); //split the string where it meets a comma
		if (newTags.length > 3) {
			redAttr.addFlashAttribute("tError", "Only 3  at one time are allowed");
			return "redirect:/questions/new";
		}
		List<Tag> addTags = new ArrayList<Tag>();
		for (String x : newTags) {
			if (tagService.findTag(x) != null) addTags.add(tagService.findTag(x));
			else {
				Tag t = new Tag(x);
				tagService.createTag(t);
				addTags.add(t);
			}
		}
		Question newQuestion = new Question(question, addTags);
		qServ.createQuestion(newQuestion);
		redAttr.addFlashAttribute("questionsuccess", "Successfully asked a question");
		return "redirect:/questions";
	}
}
