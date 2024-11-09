package com.core.criteriaassigment.entity;

import javax.persistence.*;

@Entity

public class Employee {
	@Id
	int empid;
	String empname;
	Integer salary;
	int deptno;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, int salary, int deptno) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.deptno = deptno;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", deptno=" + deptno + "]";
	}



}
