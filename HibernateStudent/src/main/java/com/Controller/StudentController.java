package com.Controller;

import com.Service.StudentService;
import com.entity.Student;

public class StudentController {
	
	
	
	StudentService service=new StudentService();
	
	
	
	public String insert(Student student) {
		
		return service.insert(student);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
