package com.sample.userMangement.web.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	
	 private static final String TEMPLATE_INDEX = "site/index";

	    @RequestMapping(value = {"/", "dashboard"}, method = RequestMethod.GET)
	    public String view() {
	        return TEMPLATE_INDEX;
	    }

	@RequestMapping("/foo")
	public String foo() {
		throw new RuntimeException("Expected exception in controller");
	}

	

	
	
}
