package com.yifangda.interview.dao;

import java.util.List;

import com.yifangda.interview.entity.Course;
import com.yifangda.interview.entity.Student;

public interface ICourseDao {

	public List<Course> search(String name);
	
	public int add(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student getStudent(int id);
	
}
