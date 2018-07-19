package com.codingdojo.dojoOverflow.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.dojoOverflow.models.Question;
import com.codingdojo.dojoOverflow.models.Tag;
import com.codingdojo.dojoOverflow.services.AnswerService;
import com.codingdojo.dojoOverflow.services.QuestionService;
import com.codingdojo.dojoOverflow.services.TagService;

@Controller
@RequestMapping("/questions") // May or may not be needed, it just appends it automatically, still needs to be typed....
public class QuestionController {
	@SuppressWarnings("unused")
	@Autowired
	private AnswerService answerService;
	@Autowired
	private TagService tagService;
	@Autowired
	private QuestionService questionService;
	
	public QuestionController(TagService tagService, AnswerService answerService, QuestionService questionService) {
		this.tagService = tagService;
		this.questionService= questionService;
		this.answerService = answerService;
	}


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
		tags=tags.toLowerCase();
		String[] newTags = tags.split(","); //split the string where it meets a comma
		for(String tag: newTags){
			if (tag.length()< 1) { // if the tag is empty. Flash errors
				redAttr.addFlashAttribute("tError", "Tag(s) Cannot be blank.");
				return "redirect:/questions/new";
			}
		}
		
		if (newTags.length > 3) {
			redAttr.addFlashAttribute("tError", "Only 3  at one time are allowed.");
			return "redirect:/questions/new"; //this will redirect to new question if errors
		}
		List<Tag> addTags = new ArrayList<Tag>();
		for (String x : newTags) { // special forloop
			if (tagService.findTag(x) != null) {
				addTags.add(tagService.findTag(x));
			}
			else {
				Tag t = new Tag(x); //new tag
				tagService.create(t); // we create the tag
				addTags.add(t); // we add the tag but it still needs to be added along with the question 
			}
		}
		Question newQuestion = new Question(question, addTags); //This is creating the question along with the Tag "Id" linked to it
		questionService.create(newQuestion); // creating the tag question and adding it 
		redAttr.addFlashAttribute("questionsuccess", "Successfully asked a question");
		return "redirect:/questions";
	}
	@GetMapping("/{id}")
		public String about(Model model, @PathVariable(value="id") Long id){
			model.addAttribute("question", questionService.findOne(id));
			System.out.println(questionService.findOne(id));
			return "about";

		}
}
