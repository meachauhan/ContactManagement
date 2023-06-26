package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.UserRepository;
import com.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model m) {
		m.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}
	@RequestMapping("/signup")
	public String signup(Model m) {
		m.addAttribute("title", "SignUp - Smart Contact Manager");
		return "signup";
	}
	

	@RequestMapping("/about")
	public String home(Model m) {
		m.addAttribute("title", "About - Smart Contact Manager");
		return "about";
	}

}
