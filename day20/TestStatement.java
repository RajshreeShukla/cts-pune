package com.cts.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestStatement {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id - ");
		int id = Integer.parseInt(br.readLine());
		//System.out.println("Enter name - ");
		//String name = br.readLine();
		//System.out.println("Enter address - ");
		//String address = br.readLine();
		//System.out.println("Enter age - ");
		//int age = Integer.parseInt(br.readLine());

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		//String query = "insert into employee values(?,?,?,?)";
		String query="select * from employee where id=? ";
		
		PreparedStatement ps = conn.prepareStatement(query);
ps.setInt(1,id);
//.ps.setString(2, name);
//ps.setString(3,address);
//ps.setInt(4,age);
		ResultSet rs = ps.executeQuery();
		int count = 1;
		while (rs.next()) {
			System.out.println("\n------------Employee " + count + " record is------------");
			int user_id = rs.getInt("id");
			String user_name = rs.getString("name");
			String user_address = rs.getString("address");
			int user_age = rs.getInt("age");
			System.out.println("Id : " + id);
			System.out.println("Name : " +user_name);
			System.out.println("Address : " +user_address);
			System.out.println("Age : " + user_age);
			count++;
		
		//ps.setString(2, name);
        //ps.setString(3,address);
        //ps.setInt(4,age);
        /*int result=ps.executeUpdate();
        if(result>0) {
        	System.out.println("Data Inserted/deleted Successfully");
        }else {
        	System.out.println("TRy Again");
        }*/
	}
}
}
