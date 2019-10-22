package com.hcl.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.model.Department;
import com.hcl.model.Employee;
import com.hcl.service.ServiceDepartment;

public class EmployeeFinder {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-core-config.xml");

		Scanner input = new Scanner(System.in);
		String name = input.next();

		/*
		 * Department department = (Department)
		 * applicationContext.getBean("department"); String deptName =
		 * department.findDeptName(name);
		 * 
		 * if (deptName != null) { System.out.println("Department name of " +
		 * name + " is " + (deptName).toLowerCase()); } else System.out.println(
		 * "Employee not found");
		 * 
		 * Employee employee=department.findEmployeeDetails(name);
		 * System.out.println(employee);
		 */

		ServiceDepartment serviceDepartment = (ServiceDepartment) applicationContext.getBean("serviceDepartment");
		String deptName = serviceDepartment.findDeptName(name);

		if (deptName != null) {
			System.out.println("Department name of " + name + " is " + (deptName).toLowerCase());
		} else
			System.out.println("Employee not found");

		input.close();

	}
}
