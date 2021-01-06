package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.EmployeeService;

import model.EmployeeDTO;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/login")
	String showLoginPage() {
		return "login";
	}

	@PostMapping("/authenticate")
	void authenticate(@RequestParam String emailId, @RequestParam String password) {
		EmployeeDTO employeeDTO = employeeService.authenticate(emailId, password);
	}
}
