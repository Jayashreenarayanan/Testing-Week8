package com.training.testProject.controller;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.training.testProject.dto.LoginRequest;
import com.training.testProject.entity.Student;
import com.training.testProject.service.StudentService;

@RestController
public class ControllingClass {
	
	
	@Autowired
	StudentService  studentServiceobj;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		String name = "Jayashree";
		return "Hello " +name;
	}
	//http://localhost:8080/hello
	
	@GetMapping("/hello/{name}/{place}")
	public String helloNamePlace(@PathVariable("name") String name, @PathVariable("place") String place)
	{
		return "Hola "+name+" is in "+place;
	}
	//http://localhost:8080/hello/Rumesh/San_Jose
	
	@GetMapping("/tellabtyou")
	public String tellabtyourself(@RequestParam("name") String name, @RequestParam("place") String place)
	{
		return "Hola "+name+" is in "+place;
	}
	//http://localhost:8080/tellabtyou?name=Rumesh&place=San_Jose
	
	@PostMapping("/authenticate")
	public boolean authenticateUser(@RequestBody LoginRequest loginRequest)
	{
//		loginRequest.setUsername(loginRequest.getUsername());
//		loginRequest.setPassword(loginRequest.getPassword());
		System.out.println(loginRequest.getUsername()+" has Password: "+loginRequest.getPassword());
		
		boolean validity = studentServiceobj.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
		
		return validity;
		
		
	}
	
	@PostMapping("/saving")
	public Student savingUser(@RequestBody LoginRequest loginRequestinfo)
	{
//		loginRequest.setUsername(loginRequest.getUsername());
//		loginRequest.setPassword(loginRequest.getPassword());
		System.out.println(loginRequestinfo.getUsername()+" has Password: "+loginRequestinfo.getPassword());
		
		
		Student SavingValue = studentServiceobj.savingUser(loginRequestinfo.getUsername(), loginRequestinfo.getPassword());
		
		return SavingValue;
		
		
	}
	
	@GetMapping("/printallStudents")
	public Set<Student> getAllStudentsClass()
	{	
		Set<Student> setStud = studentServiceobj.getAllStudents();
		
		System.out.println("Priniting values");
		
		return setStud;
		
	}

	
	@GetMapping("/printoneStudent/{id}")
	public Student getOneStudentClass(@PathVariable("id") Long id)
	{	
		Student setStud = studentServiceobj.findStudentOnId(id);
		
		System.out.println("Priniting values");
		
		return setStud;
		
	}
	
	
	@PostMapping("/deleteoneStudent/{id}")
	public String deleteOneStudentClass(@PathVariable("id") Long id)
	{	
		String delStud = studentServiceobj.deleteStudentOnId(id);
		
		System.out.println("Priniting values");
		
		return delStud;
		
	}
	
	@PostMapping("/updating")
	public Student updatingUser(@RequestBody LoginRequest loginRequestinfo)
	{
//		loginRequest.setUsername(loginRequest.getUsername());
//		loginRequest.setPassword(loginRequest.getPassword());
		System.out.println(loginRequestinfo.getId()+" "+loginRequestinfo.getUsername()+" has Password: "+loginRequestinfo.getPassword());
		
		
		Student SavingValue = studentServiceobj.updateStudentOnId(loginRequestinfo.getId(),loginRequestinfo.getUsername(), loginRequestinfo.getPassword());
		
		return SavingValue;
		
		
	}
	
}
