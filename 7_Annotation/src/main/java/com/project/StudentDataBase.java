package com.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDataBase {
	List<Student> students =new ArrayList<>();
	 public void addStudent(Student s) {
		 students.add(s);
	 }
	 
	 public List<Student> getAllStudents() {
		 return students;
	 }
}
