package com.training.testProject.service;

import java.util.Set;

import com.training.testProject.entity.Student;

public interface StudentService {
	
	boolean authenticate(String username, String password);
	
	Student savingUser(String username, String password);
	
	
	Set<Student> getAllStudents();
	
	Student findStudentOnId(Long id);
	
	String deleteStudentOnId(Long id);
	
	Student updateStudentOnId(Long id, String username, String password);
	
	

}
