package com.cts;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/SecondFilter")
public class SecondFilter implements Filter {

@Override
public void destroy() {
	// TODO Auto-generated method stub
	
}

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
System.out.println("from doFilter of SecondFilter");
	
}
@Override
public void init(FilterConfig filterConfig) throws ServletException {
System.out.println("From init of SecondFIlter");
	
}

}
