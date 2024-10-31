package com.core.entityes;

import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "test_info")
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="uname",nullable=false)
	String name;
	
	@Temporal (TemporalType.DATE)
	Date date;
	
	@Transient
	double x;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(String name, Date date, double x) {
		super();
		this.name = name;
		this.date = date;
		this.x = x;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", date=" + date + ", x=" + x + "]";
	}
	
	

}
