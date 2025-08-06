package com.project;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StudentConfig {
	@Autowired
	private StudentService ss;
	@Bean
	void perform() {
		
		Scanner sc=new Scanner(System.in);
		boolean repeat =true;
		while(repeat) {
			System.out.println("Enter 1 for adding atudent");
			System.out.println("Enter 2 for get all students");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the Id: ");
				int id=sc.nextInt();
				System.out.println("Enter name:");
				String name=sc.next();
				ss.add(id,name);
				System.out.println("Student added successfully");
				System.out.println("Details of students:");
				System.out.println("______________________________________________");
				List<Student> l=ss.getAllStudents();
				for(Student s:l) {
					System.out.println(s);
				}
				System.out.println("______________________________________________");
				break;
			case 2:
				System.out.println("Details of students:");
				System.out.println("______________________________________________");
				List<Student> ll=ss.getAllStudents();
				for(Student s:ll) {
					System.out.println(s);
				}
				System.out.println("______________________________________________");
				break;
			default:
				System.out.println("No such option");
				repeat=false;
				break;	
			} 
		}
		
	}
}
