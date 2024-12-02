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

import com.core.dao.SubjectDAO;
import com.core.entity.Subject;
import com.core.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	SubjectService subjectservice;
	
	@GetMapping("/getAllSubjects")
	public List<Subject> getAllSubjects(){
		return subjectservice.getAllSubjects();
	}
	
	@GetMapping("/getSubjectById/{id}")
	public Subject getSubjectById(@PathVariable Long id){
		return subjectservice.getSubjectById(id);
	}
	
	@PostMapping("/insertSubject")
	public String insertSubject(@RequestBody Subject s) {
		return subjectservice.insertSubject(s);
	}
	
	@PutMapping("/updateSubjectById/{sid}")
	public String updateSubjectById(@RequestBody Subject s,@PathVariable Long sid) {
		return subjectservice.updateSubjectById(s,sid);
	}
	
	@DeleteMapping("/deleteSubjectById/{sid}")
	public String deleteSubjectById(@PathVariable Long sid) {
		return subjectservice.deleteSubjectById(sid);
	}

}
