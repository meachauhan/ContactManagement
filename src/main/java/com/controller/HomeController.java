package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.UserRepository;
import com.entity.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		
		User u=new User();
		u.setName("Akash");
		u.setEmail("akash@akash.com");
		userRepo.save(u);
		return "Test Successfull";
		
	}

}
