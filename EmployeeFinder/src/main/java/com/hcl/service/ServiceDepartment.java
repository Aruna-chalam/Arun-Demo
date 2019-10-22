package com.hcl.service;

import java.util.List;

import com.hcl.model.Department;
import com.hcl.model.Employee;

public class ServiceDepartment {

	private List<Department> department;

	public ServiceDepartment() {
	}

	public ServiceDepartment(List<Department> department) {
		super();
		this.department = department;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public String findDeptName(String name) {

		String nameFinal = null;
		
		for (Department department2 : department) {
			
			List<Employee> employee = department2.getEmployee();
			
			for (Employee employee2 : employee) {
				if (name.equals(employee2.getEmpName()))
					nameFinal = department2.getDeptName();
			}

		}
		return nameFinal;

	}

}
