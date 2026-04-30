package com.Service;

import java.util.List;

import com.Dao.StudentDao;
import com.entity.Student;

public class StudentService {

	
	StudentDao dao=new StudentDao();
	
	
	
	public String insert(Student student) {
		
		return dao.insertStudent(student);
	}
	
	
	
	public Student get(int id) {
		
		return dao.getStudent(id);
	}
	
	
	public List<Student> getAll(){
		
		return dao.getAll();	
	}
	
	
	
	
	
}
