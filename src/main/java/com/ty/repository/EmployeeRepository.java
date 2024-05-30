package com.ty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
