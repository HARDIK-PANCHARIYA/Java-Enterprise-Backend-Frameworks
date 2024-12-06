package com.core.dao;

import java.util.List;

import com.core.entity.Department;

public interface DepartmentDAO {

	List<Department> getAllDepartments();

	Department getDepartmentById(Long did);

	String insertNewDepartment(Department d);

	String updateDepartmentById(Long did, Department d);

	String deleteDepartmentById(Long did);

}
