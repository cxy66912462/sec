package com.cxy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cxy.entity.User;
import com.cxy.service.UserService;

@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;

	@RequestMapping("user")
	public String getUser(Model model){
		
		User userById = userService.getUserById(1);
		model.addAttribute("user", userById);
		
		return "user";
	}
}
