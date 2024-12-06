package com.core.service;

import java.util.List;

import com.core.entity.Department;

public interface DepartmentService {

	List<Department> getAllDepartments();

	Department getDepartmentById(Long did);

	String insertNewDepartment(Department d);

	String updateDepartmentById(Long did, Department d);

	String deleteDepartmentById(Long did);

}
