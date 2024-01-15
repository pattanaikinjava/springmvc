package com.deb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class UserController {
	//@RequestMapping(value = "/home", method = RequestMethod.GET)
	@GetMapping("/home")
	public String showHomePage(ModelMap modelData) {
		 modelData.put("FName", "Debasnana");
		 modelData.put("MName", "");
		 modelData.put("LName", "Pattanaik");
		 modelData.put("Desgination", "Senior Software Developer");
		return "UserHome";
	}
} 

