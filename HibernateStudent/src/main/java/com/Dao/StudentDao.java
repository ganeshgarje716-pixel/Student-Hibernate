package com.Dao;

import java.util.List;

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
	
	
	
	
	public List<Student> getAll() {
		
		Session session = sf.openSession();
		
		List<Student> students = session.createQuery("from Student").list();
		
		return students;
	}
	
	
	
	public String updateById(Student student) {
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Student existing = session.get(Student.class, student.getId());
		
		existing.setName(student.getName());
		existing.setEmail(student.getEmail());
		existing.setMobileNo(student.getMobileNo());
		existing.setAddress(student.getAddress());
		existing.setBranch(student.getBranch());
		existing.setCgpa(student.getCgpa());
		
		session.update(existing);
		
		tr.commit();
		
		session.close();
		
		return "Student Update";
		
	}
	
	
	
	public String delete(int id) {
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
		session.delete(student);
		
		tr.commit();
		
		session.close();
		
		return "Student Delete";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
