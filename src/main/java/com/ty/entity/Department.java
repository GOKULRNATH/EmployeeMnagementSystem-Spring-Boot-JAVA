package com.ty.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String deptname;
    private String departmenthead;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String deptname, String departmenthead) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.departmenthead = departmenthead;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDepartmenthead() {
		return departmenthead;
	}
	public void setDepartmenthead(String departmenthead) {
		this.departmenthead = departmenthead;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptname=" + deptname + ", departmenthead=" + departmenthead + "]";
	}
	

	

    
}
