package com.Controller;

import java.util.List;

import com.Service.StudentService;
import com.entity.Student;

public class StudentController {
	
	
	
	StudentService service=new StudentService();
	
	
	
	public String insert(Student student) {
		
		return service.insert(student);
	}
	
	
	
	public Student get(int id) {
		
		return service.get(id);
	}
	
	
	
	public List<Student> getAll() {
		
		 return service.getAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
