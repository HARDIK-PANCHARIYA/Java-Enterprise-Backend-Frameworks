package com.core.springmvc.model;

public class User {
	
	String uname;
	String password;
	String email;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uname, String password, String email) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
