package com.springbootMybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootMybatis.model.Student;
import com.springbootMybatis.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {


	@Autowired
	StudentService studentService;
	
@GetMapping("/")
public ResponseEntity<?> getStudents(){
	
	return ResponseEntity.ok(studentService.getStudent());
}

@GetMapping("/{id}")
public ResponseEntity<?> getStudentById(@PathVariable int id){
	return ResponseEntity.ok(studentService.getStudentById(id));
}

@PostMapping("/save")
public ResponseEntity<?> saveStudent(@RequestBody Student student){
	
	return ResponseEntity.ok(studentService.save(student));
}

@PutMapping("/put")
public ResponseEntity<?> putStudent(@RequestBody Student student){
	
	return ResponseEntity.ok(studentService.putStudent(student));
	
}

@DeleteMapping("/{id}")
public ResponseEntity<?> deletStudent(@PathVariable int id){
	return ResponseEntity.ok(studentService.deleteStudent(id));
	
}
}
