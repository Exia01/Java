package com.codingdojo.Routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
    @RequestMapping("")
    public String hello() {
        return "Hello client! How are you doing?";
    }

    @RequestMapping("/query")
    public String index(@RequestParam(value = "q", required = false) String searchQuery) {
        if (searchQuery == null) {
            return "You have not initiated a search query: " + searchQuery;
        } else {
            return "You searched for: " + searchQuery;
        }
    }

    @RequestMapping("/world")
    public String world() {
        return "Class annotations?";
    }

    @RequestMapping("/m/{track}/{module}/{lesson}") // Very self explanatory I think..
    public String show(@PathVariable("track") String track, @PathVariable("module") String module,
            @PathVariable("lesson") String lesson) {
        return "Track: " + track + " --> Module: " + module + " --> Lesson: " + lesson;
    }
    // assigment

    @RequestMapping("/coding")
    public String coding() {
        return "Hello Coding Dojo";
    }

    @RequestMapping("/python")
    public String python() {
    	 String s = "This is a dinasour language to put it midly.";
		return "Python/Django is way better. " + s;
    }

    @RequestMapping("/java")
    public String java() {
        return "Are we done yet?. ";
    }

    @RequestMapping("/display/{dojo}")
    public String dojo(@PathVariable("dojo") String dojo) {
        return "The: " + dojo + " is pretty cool";
    }

    @RequestMapping("/{burbank-dojo}/")
    public String burbank(@PathVariable("burbank-dojo") String Burbank) {
        return Burbank +  " is located in Socal";
    }
}
