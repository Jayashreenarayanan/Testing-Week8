package com.training.testProject.jpa;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.testProject.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	
	Student findByUsernameAndPassword(String username,String password);
	
//@Query("insert into student values username = (;)")
//	@SuppressWarnings("unchecked")
//	Student save(Student obj);
	
	
	

}
