package com.bluesoft.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("greeting", "Welcome to Application");
		model.addAttribute("tagline", "Please choose your action");
		return "index";
	}
	
	@RequestMapping("/panel")
	public String panel(Model model) {
		model.addAttribute("greeting", "Welcome to Application!");
		model.addAttribute("tagline", "Please choose your action");
		return "actionPanel";
	}
}
