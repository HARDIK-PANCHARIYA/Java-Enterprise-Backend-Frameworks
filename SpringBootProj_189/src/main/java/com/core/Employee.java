package com.core;

import org.springframework.stereotype.Component;

//@Component
public class Employee {
	
	int eid;
	String ename;
	int dptno;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, int dptno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dptno = dptno;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDptno() {
		return dptno;
	}

	public void setDptno(int dptno) {
		this.dptno = dptno;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dptno=" + dptno + "]";
	}
	
	
	

	
	
	

}
