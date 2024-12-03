package com.core.service;

import java.util.List;

import com.core.entity.ClassSchedule;

public interface ClassScheduleService {

	List<ClassSchedule> getAllClassSchedules();

	ClassSchedule getClassScheduleById(Long csid);

	String createClassSchedule(ClassSchedule cs);

	String updateClassScheduleById(Long csid, ClassSchedule cs);

	String deleteClassScheduleById(Long csid);
	

}
