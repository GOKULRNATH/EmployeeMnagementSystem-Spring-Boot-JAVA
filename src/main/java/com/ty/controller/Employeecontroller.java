package com.ty.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ty.entity.Employee;
import com.ty.repository.EmployeeRepository;
import com.ty.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class Employeecontroller {
	@Autowired
	EmployeeService employeeService;
	

	
	public Employeecontroller() {
		super();
	}

	public Employeecontroller(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//Save Employeee
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		System.out.println("Inserted");
		return employee;
	}
	
//	Getemployee
	@GetMapping("/get")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();	
	}
	
//	Get employee by id
	@GetMapping("/getempbyid/{id}")
	public Optional<Employee> getEmpByid(@PathVariable Integer id) {
		return employeeService.getEmpById(id);
	}
	
//	Delete employee by id
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable Integer id) {
		employeeService.deleteById(id);
		return "Deleted";	
	}
	
//	Update employee by id
	@PutMapping("/updatebyid/{id}")
	public void UpdateEmpById(@PathVariable Integer id,@RequestBody Employee employee) {
		
		employeeService.updateEmp(id, employee);
		
	}

}
