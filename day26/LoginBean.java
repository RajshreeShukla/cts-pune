package com.cts.bean;

//POJO MODEL JavaBean
public class LoginBean {
	private String userName, password;

	public LoginBean() {
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		System.out.println("from getUserName");
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("from setUserName()");
	}

	public String getPassword() {
		System.out.println("from getPassword");
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("from setPassword()");
	}
}
