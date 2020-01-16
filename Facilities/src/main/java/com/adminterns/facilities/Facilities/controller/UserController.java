package com.adminterns.facilities.Facilities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminterns.facilities.Facilities.model.User;
import com.adminterns.facilities.Facilities.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> get(){
		return userService.get();
	}
	
	@GetMapping("/verify")
	public Boolean verify(String user_email) {
		return userService.verify(user_email);
	}
	
	
}
