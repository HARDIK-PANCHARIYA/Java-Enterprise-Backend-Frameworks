package com.core.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.core.entity.Course;

public interface CourseService {

	List<Course> getAllCourses();

	Course getCourseById(Long cid);

	String insertNewCourse(Course c);

	String updateCourseById(Long cid, Course c);

	String deleteCourseById(Long cid);


}
