package com.core.service;

import java.util.List;

import com.core.entity.Classroom;

public interface ClassroomService {

	List<Classroom> getAllClassrooms();

	Classroom getClassroomByID(Long cid);

	String insertClassroom(Classroom c);

	String updateClassroom(Long cid, Classroom c);

	String deleteClassroomById(Long cid);

}
