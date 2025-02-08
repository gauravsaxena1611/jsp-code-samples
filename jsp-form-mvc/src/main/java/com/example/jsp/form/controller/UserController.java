package com.example.jsp.form.controller;

import com.example.jsp.form.model.User;
import com.example.jsp.form.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Display "Hello World" page
    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World from Spring Boot!");
        return "hello";
    }

    // Display form page
    @GetMapping("/userForm")
    public String showForm() {
        return "userForm";
    }

    // Handle form submission
    @PostMapping("/submitUser")
    public String submitUser(User user) {
        userRepository.save(user); // Save to in-memory database
        return "userSuccess";
    }
}
