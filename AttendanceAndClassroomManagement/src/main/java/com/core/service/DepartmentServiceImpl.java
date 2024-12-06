package com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.DepartmentDAO;
import com.core.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentDAO departmentdao;
	
	@Override
	public List<Department> getAllDepartments() {
		return departmentdao.getAllDepartments();
	}

	@Override
	public Department getDepartmentById(Long did) {
		return departmentdao.getDepartmentById(did);
	}

	@Override
	public String insertNewDepartment(Department d) {
		return departmentdao.insertNewDepartment(d);
	}

	@Override
	public String updateDepartmentById(Long did, Department d) {
		return departmentdao.updateDepartmentById(did,d);
	}

	@Override
	public String deleteDepartmentById(Long did) {
		return departmentdao.deleteDepartmentById(did);
	}

}
