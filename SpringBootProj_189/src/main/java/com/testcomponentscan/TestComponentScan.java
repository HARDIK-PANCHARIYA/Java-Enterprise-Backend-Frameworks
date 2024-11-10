package com.testcomponentscan;

import org.springframework.stereotype.Component;

@Component
public class TestComponentScan {
	
	int sid;
	String sname;
	
	public TestComponentScan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestComponentScan(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "TestComponentScan [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	

}
