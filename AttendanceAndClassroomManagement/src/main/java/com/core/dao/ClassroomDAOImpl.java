package com.core.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.core.entity.Classroom;

@Repository
public class ClassroomDAOImpl implements ClassroomDAO {

	@Autowired
	SessionFactory factory;

	@Override
	public List<Classroom> getAllClassrooms() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Classroom.class);
		List<Classroom> clist = c.list();
		return clist;

	}

	@Override
	public Classroom getClassroomByID(Long cid) {
		Session session = factory.openSession();
		try {
			Classroom c = session.get(Classroom.class, cid);
			if (c == null) {
				System.out.println("Classroom with ID " + cid + " not found");
				return null;
			}
			return c;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public String insertClassroom(Classroom c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		return "Data Insert Successfully";
	}

	@Override
	public String updateClassroom(Long cid, Classroom c) {
		Session session = factory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			Classroom c1 = session.get(Classroom.class, cid);
			if (c1 == null) {
				throw new Exception("Classroom with ID " + cid + " not found.");
			}
			c1.setName(c.getName());
			session.update(c1);
			tx.commit();
			return "Data updated successfully";

		} catch (Exception e) {
			return "Data update failed: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	@Override
	public String deleteClassroomById(Long cid) {
		Session session = factory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			Classroom c1 = session.get(Classroom.class, cid);
			if(c1 == null) {
				throw new Exception("Classroom with ID not found");
			}
				session.delete(c1);
				tx.commit();
				return "Delete Successfully";
		}catch (Exception e) {
			return "Data delete failed: " + e.getMessage(); 
		}finally {
			session.close();
		}
	}

}
