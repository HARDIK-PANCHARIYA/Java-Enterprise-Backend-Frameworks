package com.core.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FacultySubject {
	
	@Id
	int sid;
	String subname;
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FacultySubject(int sid, String subname) {
		super();
		this.sid = sid;
		this.subname = subname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "FacultySubject [sid=" + sid + ", subname=" + subname + "]";
	}
	
	

}
