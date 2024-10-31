package com.core.entityes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int userid;
	private String username;
	private  String email;
	private String password;
	
	
	// ------------------------- constructor ------------------------
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public User(int userid, String username, String email, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	// ------------------- Getter Setter -------------------------------
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	// ----------------------------- to string method --------------------------------
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
	

}
