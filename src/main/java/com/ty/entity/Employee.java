package com.ty.entity;





import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDate  dob;
	private double salary;
	private String address;
	private String role;
	private LocalDate joindate;
	private double yearlybonus;
    private String department;
    private String reportingmanager;
	
	public Employee() {}

	public Employee(int id, String name, LocalDate dob, double salary, String address, String role, LocalDate joindate,
			double yearlybonus, String department, String reportingmanager) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.role = role;
		this.joindate = joindate;
		this.yearlybonus = yearlybonus;
		this.department = department;
		this.reportingmanager = reportingmanager;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
				+ ", role=" + role + ", joindate=" + joindate + ", yearlybonus=" + yearlybonus + ", department="
				+ department + ", reportingmanager=" + reportingmanager + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDate getJoindate() {
		return joindate;
	}

	public void setJoindate(LocalDate joindate) {
		this.joindate = joindate;
	}

	public double getYearlybonus() {
		return yearlybonus;
	}

	public void setYearlybonus(double yearlybonus) {
		this.yearlybonus = yearlybonus;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getReportingmanager() {
		return reportingmanager;
	}

	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}

	
}
