package cts.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletExamlpe extends HttpServlet {
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
System.out.println("FROM INIT******");
}
@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("FRON SERVICE *********");
	}

@Override
		public void destroy() {
			// TODO Auto-generated method stub
System.out.println("FROM DESTROY **********");
		}
}

