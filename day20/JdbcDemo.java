package com.cts.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		Statement stmt = conn.createStatement();
	//	String query = "insert into Employee values(1,'radha','c65street',46)";
	//	String query = "insert into Employee values(2,'shyam','c66street',38)";	
		//String query = "insert into Employee values(3,'madhu','c67street',39)";
	String query="update Employee set adderss='Thane' where id=3";
		//String query="delete from Employee where id=1";
		//stmt.executeUpdate(query);
		//String query="select * from employee";
		int result = stmt.executeUpdate(query);
		if (result > 0) {
			System.out.println("Records are inserted");
		} else {
			System.out.println("Something went wrong");
		}

//	System.out.println("connection success");
	}
}
