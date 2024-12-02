package com.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.core.entity.Subject;

@Repository
public class SubjectDAOImpl implements SubjectDAO{
	
	@Autowired
	SessionFactory factory;
	
	@Override
	public List<Subject> getAllSubjects() {
		Session session = factory.openSession();
		Query q = session.createQuery("from Subject");
		return q.list();
	}

	@Override
	public Subject getSubjectById(Long sid) {
		Session session = factory.openSession();
		Query q = session.createQuery("from Subject where id=:i");
		q.setParameter("i", sid);
		List<Subject> s = q.list();
		return s.get(0);
	}

	@Override
	public String insertSubject(Subject s) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		return "Subject insert successfully";
	}

	@Override
	public String updateSubjectById(Subject s, Long sid) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Subject s1 = session.load(Subject.class, sid);
//		s1.setCourseId(s.getCourseId());
		s1.setName(s.getName());
		session.update(s1);
		tx.commit();
		return "Subject update Successfully";
	}

	@Override
	public String deleteSubjectById(Long sid) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Subject s = session.load(Subject.class, sid);
		session.delete(s);
		tx.commit();
		return "Subject delete Successfully";
	}
	

}
