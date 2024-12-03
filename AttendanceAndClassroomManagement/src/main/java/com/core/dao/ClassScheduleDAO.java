package com.core.dao;

import java.util.List;

import com.core.entity.ClassSchedule;
import com.core.service.ClassScheduleService;

public interface ClassScheduleDAO {

	List<ClassSchedule> getAllClassSchedules();

	ClassSchedule getClassScheduleById(Long csid);

	String createClassSchedule(ClassSchedule cs);

	String updateClassScheduleById(Long csid, ClassSchedule cs);

	String deleteClassScheduleById(Long csid);

}
