package com.cts.training.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImp1;

public class EmployeeeUnitTest {
	private static EmployeeDAOImp1 employedao;
	private static Employee employee;

	@BeforeClass
	public  static void init() {
	employee= new Employee();
	employedao =new EmployeeDAOImp1();
	}
	@Ignore
	@Test
	public void test_add_empoyee_success() {
		Employee emp=new Employee(133,"bharat", "123street", "developer", 45, 239876, 453434);
		assertEquals(true, employedao.addEmployee(emp));
		
		
	}@Ignore
	@Test
	public void test_update_employee() {
		boolean emp=employedao.updateEmployee(1);
		assertEquals("true",employedao.updateEmployee(1));
	}@Ignore
	@Test
	public void test_get_elementById() {
		Employee emp=employedao.getEmployeeById(1);
		assertEquals("harshita",emp.getName());
	}
	@Test
public void test_delete_element() {
	//Employee emp=employedao.getEmployeeById(1);
	assertEquals(true,employedao.deleteEmployee(1));
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
