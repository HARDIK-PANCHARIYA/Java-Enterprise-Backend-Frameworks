package com.core.dao;

import java.util.List;

import com.core.entity.Subject;

public interface SubjectDAO {

	List<Subject> getAllSubjects();

	Subject getSubjectById(Long sid);

	String insertSubject(Subject s);

	String updateSubjectById(Subject s, Long sid);

	String deleteSubjectById(Long sid);

}
