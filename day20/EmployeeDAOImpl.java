package com.cts.training.dao.impl;

import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.training.DAO.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection conn = getConnection();
	PreparedStatement ps = null;

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "root");
			return conn;

		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public boolean saveEmployee(Employee employee) {

		/*
		 * String sql = "insert into employee values(?,?,?,?,?,?,?)"; try { ps =
		 * conn.prepareStatement(sql); ps.setInt(1, employee.getId()); ps.setString(2,
		 * employee.getName()); ps.setString(3, employee.getAddress()); ps.setString(4,
		 * employee.getDesignation()); ps.setInt(5, employee.getAge()); ps.setInt(6,
		 * employee.getSalary()); ps.setInt(7, employee.getPhone()); ps.executeUpdate();
		 * 
		 * return true; } catch (SQLException e) { e.printStackTrace();
		 */return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update Employee set address = 'thane' where id=? )";

		try {

			ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getId());
//			ps.setString(2,employee.getAddress());
			ps.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String sql = "select *from employee where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Employee emp = null;
			while (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getInt("phone"));
				emp.setDesignation(rs.getString("designation"));
				emp.setSalary(rs.getInt("salary"));
				emp.setPhone(rs.getInt("phone"));

			}
			return emp;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "select * from Employee";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getInt("phone"));
				emp.setDesignation(rs.getString("designation"));
				emp.setSalary(rs.getInt("salary"));
				emp.setPhone(rs.getInt("phone"));
				employees.add(emp);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
