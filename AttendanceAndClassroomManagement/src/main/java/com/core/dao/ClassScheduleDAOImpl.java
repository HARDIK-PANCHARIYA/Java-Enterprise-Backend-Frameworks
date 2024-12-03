package com.core.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.core.entity.ClassSchedule;
import com.core.service.ClassScheduleService;

@Repository
public class ClassScheduleDAOImpl implements ClassScheduleDAO {
	
	@Autowired
	SessionFactory factory;
	
	@Override
	public List<ClassSchedule> getAllClassSchedules() {
		Session session = factory.openSession();
		Query q = session.createQuery("from ClassSchedule");
		
		List<ClassSchedule> cs = q.list();
		
		return cs;
	}

	@Override
	public ClassSchedule getClassScheduleById(Long csid) {
		Session session = factory.openSession();
		ClassSchedule cs = session.get(ClassSchedule.class, csid);
		return cs;
	}

	@Override
	public String createClassSchedule(ClassSchedule cs) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(cs);
		tx.commit();
		return "Data Insert Successfully";
	}

	@Override
	public String updateClassScheduleById(Long csid, ClassSchedule cs) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		ClassSchedule c = session.load(ClassSchedule.class, csid);
		c.setSubjectId(cs.getSubjectId());
		c.setClassroomId(cs.getClassroomId());
		c.setDayOfWeek(cs.getDayOfWeek());
		c.setEndTime(cs.getEndTime());
		c.setStartTime(cs.getStartTime());
		session.update(c);
		tx.commit();
		
		return "Data updated successfully";
	}

	@Override
	public String deleteClassScheduleById(Long csid) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		ClassSchedule cs = session.load(ClassSchedule.class, csid);
		session.delete(cs);
		tx.commit();
		
		return "Data Delete Successfully";
	}

}
