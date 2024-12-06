package com.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.core.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	SessionFactory factory;

	@Override
	public List<Department> getAllDepartments() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Department.class);
		List<Department> d = c.list();
		return d;
	}

	@Override
	public Department getDepartmentById(Long did) {
		Session session = factory.openSession();
		Department d = session.get(Department.class, did);
		return d;
	}

	@Override
	public String insertNewDepartment(Department d) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(d);
		tx.commit();
		return "Department insert successfully";
	}

	@Override
	public String updateDepartmentById(Long did, Department d) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department d1 = session.load(Department.class, did);
		d1.setName(d.getName());
		session.save(d1);
		tx.commit();
		return "Department update successfully";
	}

	@Override
	public String deleteDepartmentById(Long did) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department d = session.load(Department.class, did);
		session.delete(d);
		tx.commit();
		return "Department delete successfully";
	}

}
