package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.training.DAO.EmployeeDAO;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeDAO empObj = new EmployeeDAOImpl();
		// Employee employee = new Employee(45, "Disha", "thane", "Digital Engineer", 22, 46, 46);
		 //empObj.updateEmployee(employee);
		//List<Employee> list = empObj.getAllEmployees();
	//	list.forEach(System.out::println);
	Employee emp=empObj.getEmployeeById(3);
	System.out.println(emp);
	}
}
