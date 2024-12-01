package com.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.Classroom;
import com.core.service.ClassroomService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class ClassroomController {
	
	@Autowired
	ClassroomService classroomservice;
	
	@GetMapping("/getAllClassrooms")
	public List<Classroom> getAllClassrooms(){	
		return classroomservice.getAllClassrooms();	
	}
	@GetMapping("/getClassroomByID/{cid}")
	public Classroom getClassroomById(@PathVariable Long cid) {
		return classroomservice.getClassroomByID(cid);
	}
	
	@PostMapping("/insertClassroom")
	public String  insertClassroom(@RequestBody Classroom c) {
		return classroomservice.insertClassroom(c);
	}
	
	@PutMapping("/updateClassroom/{cid}")
	public String updateClassroom(@PathVariable Long cid, @RequestBody Classroom c) {
		return classroomservice.updateClassroom(cid,c);
	}
	
	@DeleteMapping("/deleteClassroomById/{cid}")
	public String deleteClassroomById(@PathVariable Long cid) {
		return classroomservice.deleteClassroomById(cid);
	}
	

}
