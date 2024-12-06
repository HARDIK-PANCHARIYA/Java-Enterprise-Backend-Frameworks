package com.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.Department;
import com.core.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentservice;
	
	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments(){
		return departmentservice.getAllDepartments();
	}
	
	@GetMapping("/getDepartmentById/{did}")
	public Department getDepartmentById(@PathVariable Long did) {
		return departmentservice.getDepartmentById(did);
	}
	
	@PostMapping("/insertNewDepartment")
	public String insertNewDepartment(@RequestBody Department d) {
		return departmentservice.insertNewDepartment(d);
	}
	
	@PutMapping("/updateDepartmentById/{did}")
	public String updateDepartmentById(@PathVariable Long did, @RequestBody Department d) {
		return departmentservice.updateDepartmentById(did,d);
	}
	
	@DeleteMapping("/deleteDepartmentById/{did}")
	public String deleteDepartmentById(@PathVariable Long did) {
		return departmentservice.deleteDepartmentById(did);
	}
}
