package com.hcl.model;

import java.util.List;

public class Department {

	private int deptId;
	private String deptName;
	private List<Employee> employee;

	public Department() {
	}

	public Department(int deptId, String deptName, List<Employee> employee) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.employee = employee;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String findDeptName(String name) {

		String nameFinal = null;
		for (Employee employee2 : employee) {
			if (name.equals(employee2.getEmpName()))
				nameFinal = getDeptName();
		}
		return nameFinal;

	}

	public Employee findEmployeeDetails(String name) {

		for (Employee employee2 : employee) {
			if (name.equals(employee2.getEmpName()))
				return employee2;

		}
		return null;

	}
	
	
}