package com.sample.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class AdminHomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String list(Model model) {
		return "admin/common/adminDashboard";
	}
	@RequestMapping(path="/list" , method=RequestMethod.GET)
	public String listfff(Model model) {
		return "admin/common/adminDashboard";
	}
	
	@RequestMapping(path="/edit" , method=RequestMethod.GET)
	public String edit(Model model) {
		return "admin/common/adminDashboard";
	}
	
}
