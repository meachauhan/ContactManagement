package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.UserRepository;
import com.entity.User;

@Controller
public class HomeController implements ErrorController{
	private static final String PATH = "/error";
	public String getErrorPath() {
		return PATH;
	}
	
	@RequestMapping("/")
	public String home(Model m) {
		m.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}
	@GetMapping("/signup")
	public String signup(Model m) {
		m.addAttribute("title", "SignUp - Smart Contact Manager");
		return "signup";
	}
//	@PostMapping(value="/do_register")
//	public String registerUser(@ModelAttribute("user") User user) {
//		return "signup";
//	}
	@RequestMapping("/error")
	public String errorPage(Model m) {
		m.addAttribute("title", "Error-Page");
		return "error";
		
	}

}
