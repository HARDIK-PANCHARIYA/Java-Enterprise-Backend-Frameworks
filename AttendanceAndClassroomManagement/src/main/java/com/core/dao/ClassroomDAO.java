package com.core.dao;

import java.util.List;

import com.core.entity.Classroom;

public interface ClassroomDAO {

	List<Classroom> getAllClassrooms();

	Classroom getClassroomByID(Long cid);

	String insertClassroom(Classroom c);

	String updateClassroom(Long cid, Classroom c);

	String deleteClassroomById(Long cid);
	
	

}
