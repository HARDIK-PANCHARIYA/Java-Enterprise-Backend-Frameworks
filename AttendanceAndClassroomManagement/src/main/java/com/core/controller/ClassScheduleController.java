package com.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.ClassSchedule;
import com.core.service.ClassScheduleService;
import com.core.service.ClassroomService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class ClassScheduleController {
	
	@Autowired
	ClassScheduleService classscheduleservice;
	
	@GetMapping("/getAllClassSchedules")
	public List<ClassSchedule> getAllClassSchedules(){
		return classscheduleservice.getAllClassSchedules();
	}
	
	@GetMapping("/getClassScheduleById/{csid}")
	public ClassSchedule  getClassScheduleById(@PathVariable Long csid) {
		return classscheduleservice.getClassScheduleById(csid);
	}
	
	@PostMapping("/createClassSchedule")
	public String createClassSchedule(@RequestBody ClassSchedule cs) {		
		return classscheduleservice.createClassSchedule(cs);
	}
	
	@PutMapping("/updateClassScheduleById/{csid}")
	public String updateClassScheduleById(@PathVariable Long csid, @RequestBody ClassSchedule cs) {
		return classscheduleservice.updateClassScheduleById(csid,cs);	
	}
	
	@DeleteMapping("/deleteClassScheduleById/{csid}")
	public String deleteClassScheduleById(@PathVariable Long csid) {
		return classscheduleservice.deleteClassScheduleById(csid);
	}
	
	

}
