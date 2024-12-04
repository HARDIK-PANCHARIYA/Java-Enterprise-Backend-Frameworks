package com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.core.dao.CourseDAO;
import com.core.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDAO coursedao;
	
	@Override
	public List<Course> getAllCourses() {
		return coursedao.getAllCourses();
	}

	@Override
	public Course getCourseById(Long cid) {
		return coursedao.getCourseById(cid);
	}

	@Override
	public String insertNewCourse(Course c) {
		return coursedao.insertNewCourse(c);
	}

	@Override
	public String updateCourseById(Long cid, Course c) {
		return coursedao.updateCourseById(cid,c);
	}

	@Override
	public String deleteCourseById(Long cid) {
		return coursedao.deleteCourseById(cid);
	}

}
