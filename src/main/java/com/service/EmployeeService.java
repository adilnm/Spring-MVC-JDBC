package com.service;

import model.EmployeeDTO;

public interface EmployeeService {
	EmployeeDTO authenticate(String emailId, String password);
}
