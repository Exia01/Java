package com.codingdojo.Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//these are the imports needed for functionality. Kind of like modules in mean.

@SpringBootApplication
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}

	@RestController // similar to appRoute in flask; these controll the routing flow in Java
	public class HomeController {
		@RequestMapping("/") //rot route
		public String hello() {
			return "Hello client! How are you doing?";
		}

		@RequestMapping("/random") //random route. 
		public String random() {
			return "Spring Boot is great! ";
		}
	}
}
