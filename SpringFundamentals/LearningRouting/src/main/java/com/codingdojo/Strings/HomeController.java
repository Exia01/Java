package com.codingdojo.Strings;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // similar to appRoute in flask; these control the routing flow in Java
// we can also do prepending of routes by adding the mapping
@RequestMapping("/hello") // this is an example of class annotation
public class HomeController {
    @RequestMapping("") // root route
    // a class annotation would do this:
    // you still have to specify it on your browser though.....
    // meaning ("/hello") not just blank when inputting it.
    public String hello() {
        return "Hello client! How are you doing?";
    }

    @RequestMapping("/query") // route for "query"
    public String index(@RequestParam(value = "q", required = false) String searchQuery) {
        if (searchQuery == null) {
            return "You have not initiated a search query: " + searchQuery;
        } else {
            return "You searched for: " + searchQuery;
        }
    }

    // you would preface this as /hello/query"?q=" ** q is the value key
    @RequestMapping("/world")
    public String world() {
        return "Class annotations?";
    }

    @RequestMapping("/m/{track}/{module}/{lesson}") //Very self explanatory I think..
    public String show(@PathVariable("track") String track, @PathVariable("module") String module,
            @PathVariable("lesson") String lesson) {
        return "Track: " + track + " --> Module: " + module + " --> Lesson: " + lesson;
    }
}
