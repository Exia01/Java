package com.codingdojo.NinjaGold;


import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.tools.DocumentationTool.Location;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class NinjaController {
	@GetMapping("/")
	public String home(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if (session.getAttribute("activities") == null) {
			ArrayList<Location> Activity = new ArrayList<Location>();
		}
		return "index";
	}

	@PostMapping("/process")
	public String process(@RequestBody() String body, HttpSession session){
		int equals = body.indexOf("=");
		String word = body.substring(0,equals);
		int gold = (int)session.getAttribute("gold");
		Random random = new Random();
		
		return "redirect:/";
	}
}