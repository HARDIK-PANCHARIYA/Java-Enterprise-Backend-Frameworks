package com.core.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	
	@Id
	int empid;
	String ename;
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employe(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "empid=" + empid + ", ename=" + ename +"\n";
	}
	
	
	
	
	
	

}
