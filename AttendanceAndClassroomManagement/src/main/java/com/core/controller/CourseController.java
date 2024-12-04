package com.core.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.Course;
import com.core.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseservice;
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses(){
		return courseservice.getAllCourses();
	}
	
	@GetMapping("/getCourseById/{cid}")
	public Course getCourseById(@PathVariable Long cid) {
		return courseservice.getCourseById(cid);
	}
	
	@PostMapping("/insertNewCourse")
	public String insertNewCourse(@RequestBody Course c) {
		return courseservice.insertNewCourse(c);
	}
	
	@PutMapping("/updateCourseById/{cid}")
	public String updateCourseById(@RequestBody Course c, @PathVariable Long cid) {
		return courseservice.updateCourseById(cid,c);
	}
	
	@DeleteMapping("/deleteCourseById/{cid}")
	public String deleteCourseById(@PathVariable Long cid) {
		return courseservice.deleteCourseById(cid);
	}
	

}
