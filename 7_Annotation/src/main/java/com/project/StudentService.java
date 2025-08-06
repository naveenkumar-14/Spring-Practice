package com.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentDataBase sdb;
	
	public void add(int id,String name) {
		Student s=new Student(id,name);
		sdb.addStudent(s);
	}
	
	public List<Student>getAllStudents(){
		return sdb.getAllStudents();
	}
}
