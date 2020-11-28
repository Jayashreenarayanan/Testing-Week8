package com.training.testProject.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.testProject.entity.Student;
import com.training.testProject.jpa.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepositoryObj;
	
	
	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		
		Student record = studentRepositoryObj.findByUsernameAndPassword(username,password);
		if (record!=null)
		{
			System.out.println("Got the username and Password");
			return true;
		}
		
		System.out.println("Didn't get the username and Password");
		
		return false;
		
		
	}


	@Override
	public Student savingUser(String username, String password) {
		
		Student stud = new Student();
		
		stud.setUsername(username);
		
		stud.setPassword(password);
		
		stud = studentRepositoryObj.save(stud);
		
		return stud;
	
		
	}


	@Override
	public Set<Student> getAllStudents(){
		
		List<Student> stuList = studentRepositoryObj.findAll();
		int count = (int) studentRepositoryObj.count();
		System.out.println(count);
		
		Set<Student> stuSet = new HashSet<Student>(stuList);
		
		return stuSet;
		
	}


	@Override
	public Student findStudentOnId(Long id) {
		// TODO Auto-generated method stub
		
		Optional<Student> stuvalue = studentRepositoryObj.findById(id);
		return stuvalue.get();
		
	}
	
	
	@Override
	public String deleteStudentOnId(Long id) {
		// TODO Auto-generated method stub
		
		int count = (int) studentRepositoryObj.count();
	    studentRepositoryObj.deleteById(id);
	    int count1 = (int) studentRepositoryObj.count();    
	    
	    if (count == count1)
	    {
		return "not deleted - previous no of rows: "+count+" TotalRows: "+count1;
	    }
	    
	    else
	    {
	    	return "deleted - previous no of rows: "+count+" TotalRows: "+count1;
	    }
		

	}
	
	
	@Override
	public Student updateStudentOnId(Long id, String username, String password) {
		// TODO Auto-generated method stub
	

		Student stud = new Student();
		
		stud.setId(id);
		
		stud.setUsername(username);
		
		stud.setPassword(password);
		
		stud = studentRepositoryObj.save(stud);
		
		return stud;
	
//		
//		List<Student> stuvalue1 = studentRepositoryObj.findById(id);
//		
//		stuvalue1.set(1, username);
//		stuvalue1.set(2, password);
//		
//		
//		
//		stuvalue1 = studentRepositoryObj.save(stuvalue1);
//		
//		return stuvalue1;
		

	}
	
	
	
	

}
