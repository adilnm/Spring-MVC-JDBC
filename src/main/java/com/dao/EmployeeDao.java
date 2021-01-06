package com.dao;

import model.EmployeeEntity;

public interface EmployeeDao {
	EmployeeEntity authenticate(String emailId, String password);
}
