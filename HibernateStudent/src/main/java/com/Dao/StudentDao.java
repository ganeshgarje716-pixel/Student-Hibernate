package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.entity.Student;

public class StudentDao {
	 
	
		
		SessionFactory sf = HibernateConfig.getSessionFactory();
	
	
	
	
	public String insertStudent(Student student) {
		
		Session session = sf.openSession(); //save, update, delete, get
		
		Transaction tr = session.beginTransaction();
		
		 session.save(student);
		 
		 tr.commit();
		 
		 session.close();
		 
		 return "Student Register";
	}
	
	
	
	public Student getStudent(int id) {
		
		Session session = sf.openSession();
		
		Student student = session.get(Student.class, id);
		
		return student;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
