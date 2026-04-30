package com.Main;

import java.util.List;

import com.Controller.StudentController;
import com.entity.Student;

public class StudentMain {
	
	
	public static void main(String[] args) {
		
		
		
		StudentController controller=new StudentController();
		
		
		
//		System.out.println(controller.insert(new Student(22, "Ram", "ram@gmail.com", 9078563412f, "Mumbai", "IT", 9.0)));
		
//		System.out.println(controller.get(11));
		
		
//		for (Student student : controller.getAll()) {
//			
//			System.out.println(student);
//		}
		
		
//		System.out.println(controller.update(new Student(22, "Shyam", "shyam@gmail.com", 9876543210f, "Hydrabad", "Civil", 5.6)));
		
		System.out.println(controller.delete(22));
		
		
		
		
	}

}
