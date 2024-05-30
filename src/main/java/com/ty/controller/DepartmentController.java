package com.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.entity.Department;
import com.ty.entity.Employee;
import com.ty.service.DepartmentService;
import com.ty.service.EmployeeService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	public DepartmentController() {
		super();
	}

	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	@PostMapping("/deptsave")
	public Department saveDepartment(@RequestBody Department department) {
		departmentService.saveDepartment(department);
		System.out.println("Intered");
		return department;
		
	}

}
