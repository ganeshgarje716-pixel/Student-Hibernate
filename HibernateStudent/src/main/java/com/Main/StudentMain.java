package com.Main;

import com.Controller.StudentController;
import com.entity.Student;

public class StudentMain {
	
	
	public static void main(String[] args) {
		
		
		
		StudentController controller=new StudentController();
		
		
		
		System.out.println(controller.insert(new Student(22, "Ram", "ram@gmail.com", 9078563412f, "Mumbai", "IT", 9.0)));
		
		
		
		
		
		
		
	}

}
