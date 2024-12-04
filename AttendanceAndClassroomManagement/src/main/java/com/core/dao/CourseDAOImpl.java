package com.core.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.core.entity.Course;

@Repository
public class CourseDAOImpl implements CourseDAO {
	
	@Autowired
	SessionFactory factory;

	@Override
	public List<Course> getAllCourses() {
		Session session = factory.openSession();
		Query q = session.createQuery("from Course");
		return q.list();
	}

	@Override
	public Course getCourseById(Long cid) {
		Session session = factory.openSession();
		Course c = session.get(Course.class, cid);
		return c;
	}

	@Override
	public String insertNewCourse(Course c) {
		Session session  = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		return "New Course added Successfully";
	}

	@Override
	public String updateCourseById(Long cid, Course c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Course c1 = session.get(Course.class, cid);
		c1.setName(c.getName());
		session.update(c1);
		tx.commit();
		
		return "Course Data Update Successfully";
	}

	@Override
	public String deleteCourseById(Long cid) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Course c = session.load(Course.class, cid);
		session.delete(c);
		tx.commit();
		return "Course Delete Successfully";
	}


	
	
	
}
