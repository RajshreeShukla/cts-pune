package com.cts.training.servlet;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionServlet1 extends HttpServlet {
	String user, password, url, driver;
	Connection con;

	ServletContext context;

	@Override
	public void init(ServletConfig config) throws ServletException {

		context = config.getServletContext();
		user = context.getInitParameter("userName");
		password = context.getInitParameter("password");
		url = context.getInitParameter("url");
		driver = context.getInitParameter("driver");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			System.out.println(config+ "from cs2");
			System.out.println(context+ "from cs2");
		} catch (Exception e) {

			e.printStackTrace();
		}

		;
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("hello from service");
	}
}
