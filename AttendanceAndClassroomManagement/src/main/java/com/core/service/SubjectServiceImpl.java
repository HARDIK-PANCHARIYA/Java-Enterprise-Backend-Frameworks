package com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.SubjectDAO;
import com.core.entity.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	SubjectDAO subjectdao;
	
	@Override
	public List<Subject> getAllSubjects() {
		return subjectdao.getAllSubjects();
	}

	@Override
	public Subject getSubjectById(Long sid) {
		return subjectdao.getSubjectById(sid);
	}

	@Override
	public String insertSubject(Subject s) {
		return subjectdao.insertSubject(s);
	}

	@Override
	public String updateSubjectById(Subject s, Long sid) {
		return subjectdao.updateSubjectById(s,sid);
	}

	@Override
	public String deleteSubjectById(Long sid) {
		return subjectdao.deleteSubjectById(sid);
	}

}
