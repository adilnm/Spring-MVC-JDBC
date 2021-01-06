package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.EmployeeEntity;

@Repository
public class EmployeeDaoimpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeEntity authenticate(String emailId, String password) {
		System.out.println("i m from dao" + emailId + "" + password);

		Object[] data = { emailId, password };
		String sql = "Select * from employee where emailId = ? and password = ? ";
		List<EmployeeEntity> employeeEntityList = jdbcTemplate.query(sql, data,
				new BeanPropertyRowMapper<>(EmployeeEntity.class));
		System.out.println(employeeEntityList);
		return null;
	}

}
