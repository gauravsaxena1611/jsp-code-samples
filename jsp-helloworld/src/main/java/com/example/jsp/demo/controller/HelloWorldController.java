package com.example.jsp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping({"/", "/hello"})
	public String hello(Model model) {
		model.addAttribute("message", "Hello World From WelcomeController !!");
		return "page-1-simple-welcome" ;
	}

}
