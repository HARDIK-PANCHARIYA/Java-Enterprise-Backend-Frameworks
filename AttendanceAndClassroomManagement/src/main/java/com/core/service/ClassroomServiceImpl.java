package com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.ClassroomDAO;
import com.core.entity.Classroom;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	
	@Autowired
	ClassroomDAO classroomdao;
	
	@Override
	public List<Classroom> getAllClassrooms() {
		return classroomdao.getAllClassrooms();
	}

	@Override
	public Classroom getClassroomByID(Long cid) {
		return classroomdao.getClassroomByID(cid);
	}

	@Override
	public String insertClassroom(Classroom c) {
		return classroomdao.insertClassroom(c);
	}

	@Override
	public String updateClassroom(Long cid, Classroom c) {
		return classroomdao.updateClassroom(cid,c);
	}

	@Override
	public String deleteClassroomById(Long cid) {
		return classroomdao.deleteClassroomById(cid);
	}

}
