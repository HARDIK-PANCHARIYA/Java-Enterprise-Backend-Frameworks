package com.core.mapping;

import java.util.List;

import javax.persistence.*;

@Entity
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int fid;
	String fname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fid")
	List<FacultySubject> fsubList;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(String fname) {
		super();
		this.fname = fname;
	}

	public Faculty(String fname, List<FacultySubject> fsubList) {
		super();
		this.fname = fname;
		this.fsubList = fsubList;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public List<FacultySubject> getFsubList() {
		return fsubList;
	}

	public void setFsubList(List<FacultySubject> fsubList) {
		this.fsubList = fsubList;
	}

	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", fsubList=" + fsubList + "]";
	}

	
}
