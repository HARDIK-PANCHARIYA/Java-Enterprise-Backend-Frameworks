package com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.ClassScheduleDAO;
import com.core.entity.ClassSchedule;

@Service
public class ClassScheduleServiceImpl implements ClassScheduleService {
	
	@Autowired
	ClassScheduleDAO classscheduleDAO;
	
	@Override
	public List<ClassSchedule> getAllClassSchedules() {
		return classscheduleDAO.getAllClassSchedules();
	}

	@Override
	public ClassSchedule getClassScheduleById(Long csid) {
		return classscheduleDAO.getClassScheduleById(csid);
	}

	@Override
	public String createClassSchedule(ClassSchedule cs) {
		return classscheduleDAO.createClassSchedule(cs);
	}

	@Override
	public String updateClassScheduleById(Long csid, ClassSchedule cs) {
		return classscheduleDAO.updateClassScheduleById(csid,cs);
	}

	@Override
	public String deleteClassScheduleById(Long csid) {
		return classscheduleDAO.deleteClassScheduleById(csid);
	}

}
