package com.example.empList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	public EmployeeDTO save(Employee employee)	{
		EmployeeDTO dto = new EmployeeDTO();
		repo.save(employee);
		dto.setMessage("saved");
		return dto;
	}
//	public Employee save(Employee employee)	{
//		repo.save(employee);
//		return employee;
//	}
}
