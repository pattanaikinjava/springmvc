package com.deb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/v1/controller")
public class UserController {
	//@RequestMapping(value = "/home", method = RequestMethod.GET)
	@GetMapping("/home")
	public String showHomePage(Model modelData) {
		modelData.addAttribute("Agenda","Spring WEB Application");
		modelData.addAttribute("BuildTool", "Gradle");
		modelData.addAttribute("ToolVersion", "8.5.0");
		return "UserHome";
	}
}

