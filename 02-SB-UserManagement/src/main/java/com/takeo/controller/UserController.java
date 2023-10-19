package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.takeo.impl.UserServiceImpl;
import com.takeo.model.User;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
private final UserServiceImpl userServiceImpl;
	@RequestMapping("/")
	public String loadForm( Model model) {
		//Model : transfer the data to view component
		
		User user = new User();
		model.addAttribute("user" , user);
		return"index";
	}
//	@RequestMapping("/insert")
//	public String handleForm(@ModelAttribute User user) {
//		
//		return "view";
	
	@PostMapping("/insert")
	public String handleForm(Model model, User user) {
		
     userServiceImpl.createUser(user);
     model.addAttribute(user);
		return "view";
	}
	}

