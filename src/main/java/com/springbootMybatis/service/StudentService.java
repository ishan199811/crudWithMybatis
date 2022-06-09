package com.springbootMybatis.service;

import java.util.List;

import com.springbootMybatis.model.Student;

public interface StudentService {

	List<Student> getStudent();

	int save(Student student);

	Student getStudentById(int id);

	

	

	Student putStudent(Student student);

	Student deleteStudent(int id);

}
