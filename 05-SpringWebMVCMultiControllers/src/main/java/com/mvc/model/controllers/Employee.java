package com.mvc.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class Employee {

	@GetMapping("/empA")
	public String showEPage() {
		return "Emp";
	}
}