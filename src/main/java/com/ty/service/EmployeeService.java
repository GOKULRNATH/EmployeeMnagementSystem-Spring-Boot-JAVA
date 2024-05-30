package com.ty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ty.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	void deleteById(int id);
	Optional<Employee> getEmpById(int id);
	void updateEmp(int id,Employee employee);
	
}
