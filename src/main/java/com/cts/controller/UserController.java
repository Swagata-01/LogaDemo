package com.cts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.entity.User;

@RestController
public class UserController {
	@RequestMapping(value="/home")
	public ModelAndView about(User user) {
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("obj",user);
		return mv;
	}
}
