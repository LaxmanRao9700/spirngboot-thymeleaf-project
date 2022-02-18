package com.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {

	public Student createStudent(Student student);

	public List<Student> getAllStudent();

	public Student updateStudent(Student student);

	public Student getStudentById(Long id);
	
	public void deleteStudentById(Long id);

}
