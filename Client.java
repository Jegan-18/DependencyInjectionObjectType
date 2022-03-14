package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Client {

	public static void main(String[] args) {
		
    
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    System.out.println("beans.xml is loaded");
	    Student student = (Student)context.getBean("student");
	    student.cheating();
	    
	    AnotherStudent anotherStudent = (AnotherStudent)context.getBean("anotherStudent");
		anotherStudent.startCheating();
		
	}

}
