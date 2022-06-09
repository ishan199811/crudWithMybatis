package com.springbootMybatis.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootMybatis.mapper.StudentMapper;
import com.springbootMybatis.model.Student;
import com.springbootMybatis.model.StudentExample;
import com.springbootMybatis.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentMapper studentMapper;
	

	
	@Override
	public List<Student> getStudent(){
//geting all students
		StudentExample example=new StudentExample ();		
		List<Student> s=studentMapper.selectByExample(example);
		return s;
		
	}

	@Override
	public int save(Student student) {
  //saving student info
		studentMapper.insert(student);
		    return 0;
	}

	@Override
	public Student getStudentById(int id) {
		//geting Student by Id
		StudentExample example=new StudentExample ();
		example.createCriteria().andIdEqualTo(id);
		List<Student> student=studentMapper.selectByExample(example);
		return student.get(0);
		
	}

	@Override
	public Student putStudent( Student student) {
		// Updating student Info
		StudentExample example=new StudentExample ();
		example.createCriteria().andIdEqualTo(student.getId());
		studentMapper.updateByExample(student, example);
		List<Student> student1=studentMapper.selectByExample(example);
		
		return student1.get(0);
	}

	@Override
	public Student deleteStudent(int id) {
		// deleting the student
		StudentExample example=new StudentExample ();
		example.createCriteria().andIdEqualTo(id);
		studentMapper.deleteByExample(example);
		
		return null;
	}
	
	

}
