package com.codingdojo.assigments;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable; //path variables are for {{parameter}}
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; //queries are being implemented 
//import org.springframework.web.bind.annotation.RestController; // not needed since we are doing templates.

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (int) session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter() {
		return "count.jsp";
	}

	@RequestMapping("/counter2")
	public String counter2(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (int) session.getAttribute("count") + 2);
		}
		return "count2.jsp";
	}

	@RequestMapping("/counter3")
	public String counter3(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (int) session.getAttribute("count") + 3);
		}
		return "count3.jsp";
	}

	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/counter";
	}

	@RequestMapping("/date")
	public String hello(Model model) {
		Date date = new java.util.Date(); // this creates a new instance

		SimpleDateFormat newformat = new SimpleDateFormat("MMMM d, yyyy"); // built in function

		String newdate = newformat.format(date); // creating a string format of it.

		model.addAttribute("date", newdate); // adding the new date string to the model.
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String world(Model model) {
		Date date = new java.util.Date(); // same as date this is creating an instance.

		SimpleDateFormat newformat = new SimpleDateFormat("h:mm aa"); // formatting

		String newdate = newformat.format(date); // creating the variable
		model.addAttribute("date", newdate);
		return "time.jsp";
	}

	@RequestMapping("/hello/") // index.jsp //?name=testing this is the key to doing it.
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		return "Hello.jsp";
	}

	@RequestMapping("/goodbye/{name}") // this passes the variable parameter onto the doc.
	public String bye(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		return "goodBye.jsp";
	}
}
