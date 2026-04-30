package com.Service;

import com.Dao.StudentDao;
import com.entity.Student;

public class StudentService {

	
	StudentDao dao=new StudentDao();
	
	
	
	public String insert(Student student) {
		
		return dao.insertStudent(student);
	}
	
	
	
	
	
}
