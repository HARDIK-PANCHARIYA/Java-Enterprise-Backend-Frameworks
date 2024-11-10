package com.core.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.Employee;

@RestController
public class ControllerDemo {
	
	@RequestMapping
	public String getmap1(){
		return "This is first api";
	}
	
	@GetMapping("/second")
	public String getmap2(){
		return "This is second api";
	}
	
	@GetMapping("/third")
	public String getmap3(){
		return "This is third api";
	}
	
	@RequestMapping("/sname")
	public ArrayList<String> getName(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hardik");
		al.add("Vedant");
		al.add("Sanket");
		al.add("Ritesh");
	
		return al;
	}
	
	
	@RequestMapping("/emp")
	public ArrayList<Employee> getemp(){
		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee(101,"Hardik",1));
		elist.add(new Employee(102,"Sanket",2));
		elist.add(new Employee(103,"Ritesh",3));
		elist.add(new Employee(104,"Vedant",4));
		
		return elist;
	}

}
