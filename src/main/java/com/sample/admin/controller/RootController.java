package com.sample.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The only purpose of this root controller is to redirect the user on root context 
 * access to the right home page
 * 
 * @author Biju Kunjummen
 *
 */
@Controller
public class RootController {
	@RequestMapping("/admin")
	public String onRootAccess() {
		return "redirect:/adminDashboard";
	}
}
