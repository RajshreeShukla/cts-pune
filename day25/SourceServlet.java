package com.cts.training.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SourceServlet extends HttpServlet {
	String user, password, url, driver;
	Connection con;

	@Override
	public void init(ServletConfig config) throws ServletException {
		user = config.getInitParameter("userName");
		password = config.getInitParameter("password");
		url = config.getInitParameter("url");
		driver = config.getInitParameter("driver");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getMethod().equals("GET")) {
			doGet(req, resp);
		} else {
			doPost(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id, name, designation, salary;
		PrintWriter pw = resp.getWriter();
		id = req.getParameter("empId");
		name = req.getParameter("empName");
		designation = req.getParameter("empDesignation");
		salary = req.getParameter("empSalary");

		pw.write(name);
		
		String qry = "insert into test2 values(?,?,?,?)";
		try {
			PreparedStatement ps;
			ps = con.prepareStatement(qry);
			ps.setString(1, "id");
			ps.setString(2, "name");
			ps.setString(3, "designation");
			ps.setString(4, "salary");
			int result = ps.executeUpdate();
			if (result > 0) {
				pw.write("<h1>Employee Details</h1>");
			} else {
				pw.write("<h1>Something went Wrong</h1>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
