package com.cts.training.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;

public class EmployeeDAOImpl {
	static ArrayList<Employee> employees = null;

	Scanner sc = new Scanner(System.in);

	static {
		employees = new ArrayList<>();
		Employee emp1 = new Employee(4234, "Vijay", "Bangalore", "Developer", 20, 41241.89, 79879798L);
		Employee emp2 = new Employee(2324, "Neeraj", "Mumbai", "Software Engineer", 21, 23434.89, 121313L);
		Employee emp3 = new Employee(9987, "Sakshi", "Indore", "Test Engineer", 19, 19889.80, 979879798L);
		Employee emp4 = new Employee(1234, "Neha", "Pune", "DevOps Engineer", 23, 68908.12, 43432222L);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
		System.out.println("\nNew employee details added succesfully...");
	}

	public void deleteEmployee(int id) {
		Iterator<Employee> itr = employees.iterator();

		while (itr.hasNext()) {
			Employee employees = itr.next();

			if (employees.id == id) {
				itr.remove();
				System.out.println("\nEmployee details deleted Succesfully...");
			}
		}
	}

	public Employee updateEmployee(int id) {

		for (Employee emp : employees) {
			if (emp.id == id) {
				System.out.println("\nDo you want to update name ? press 1 for yes/ press 2 for no : ");
				int choice1 = sc.nextInt();
				sc.nextLine();
				if (choice1 == 1) {
					System.out.println("\nEnter new name : ");
					String new_name = sc.nextLine();
					emp.setName(new_name);
					System.out.println("\nName updated succesfully...");
				}

				System.out.println("\nDo you want to update city ? press 1 for yes/ press 2 for no : ");
				int choice2 = sc.nextInt();
				sc.nextLine();
				if (choice2 == 1) {
					System.out.println("\nEnter new city : ");
					String new_city = sc.next();
					emp.setAddress(new_city);
					System.out.println("\nCity updated succesfully...");
				}

				System.out.println("\nDo you want to update age ? press 1 for yes/ press 2 for no : ");
				int choice3 = sc.nextInt();
				sc.nextLine();
				if (choice3 == 1) {
					System.out.println("\nEnter new city : ");
					int new_age = sc.nextInt();
					emp.setAge(new_age);
					System.out.println("\nAge updated succesfully...");
				}

				System.out.println("\nDo you want to update mobile number ? press 1 for yes/ press 2 for no : ");
				int choice4 = sc.nextInt();
				sc.nextLine();
				if (choice4 == 1) {
					System.out.println("\nEnter new city : ");
					long new_number = sc.nextLong();
					emp.setPhone(new_number);
					System.out.println("\nMobile number updated succesfully...");
				}
				break;
			}
		}
		return null;
	}

	public Employee getEmployeeById(int id) {
		int employee_id = id;
		for (Employee emp : employees) {

			if (emp.id == id) {
				employee_id = emp.getId();
				String employee_name = emp.getName();
				String employee_city = emp.getAddress();
				String employee_designation = emp.getDesignation();
				int employee_age = emp.getAge();
				double employee_salary = emp.getSalary();
				long phone_number = emp.getPhone();

				System.out.println("Employee id : " + employee_id);
				System.out.println("Employee name  : " + employee_name);
				System.out.println("City : " + employee_city);
				System.out.println("Designation : " + employee_designation);
				System.out.println("Age : " + employee_age);
				System.out.println("Salary : " + employee_salary);
				System.out.println("Phone number : " + phone_number);
			}
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		return employees;
	}

}
