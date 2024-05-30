package com.ty.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.entity.Employee;
import com.ty.repository.EmployeeRepository;
import com.ty.service.EmployeeService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Optional<Employee> getEmpById(int id) {
		return employeeRepository.findById(id);
		
	}

	@Override
	public void updateEmp(int id,Employee updateemployee) {
		Optional<Employee> employeOptional=employeeRepository.findById(id);
		if(employeOptional.isPresent()) {
			Employee employee1=employeOptional.get();
			
			employee1.setName(updateemployee.getName());
			employee1.setReportingmanager(updateemployee.getReportingmanager());
			
			employeeRepository.save(employee1);
			System.out.println("updated");
			
		}
		else
			// Handle the case where the employee with the given id is not found
	        throw new EntityNotFoundException("Employee not found with id " + id);
		
		
	}

}
