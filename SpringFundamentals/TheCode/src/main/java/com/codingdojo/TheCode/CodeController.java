package com.codingdojo.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "index";		
	}
	@RequestMapping("/word")
	public String process(@RequestParam(value ="code")String code,RedirectAttributes attr) {
		String secret = "bushido";
		if(code.equals(secret)) {
			return "redirect:/code";
		}else {
			attr.addFlashAttribute("error", "Nah That's not it Bruh!");
			return "redirect:/";
		}
	}
	@RequestMapping("/code")
	public String code() {
		return "code";
	}
		
	
}
