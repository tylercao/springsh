package com.yifangda.interview.service;

import java.util.List;

import com.yifangda.interview.entity.Course;

public interface ICourseService {
	
	public List<Course> search (String name);
}
