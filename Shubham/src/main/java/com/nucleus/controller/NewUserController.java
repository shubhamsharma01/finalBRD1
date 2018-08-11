package com.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.model.User;

@Controller
public class NewUserController 
{

	@RequestMapping("/adduser")
	public ModelAndView requestHandler1(User user)
	{
		return new ModelAndView("addNewUser");
	}
	

	@RequestMapping("/submit")
	public String requestHandler2()
	{
		return "addNewUser";
	}
	
	
	@RequestMapping("/viewuser")
	public String requestHandler3()
	{
		return "ViewAllUserRecords";
	}
}
