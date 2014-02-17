package com.yifangda.interview.service.impl;

import java.util.List;

import com.yifangda.interview.dao.ICourseDao;
import com.yifangda.interview.entity.Course;
import com.yifangda.interview.service.ICourseService;


public class CourseServiceImpl implements ICourseService {
	
	private ICourseDao courseDao;	
	
	public CourseServiceImpl() {
		super();
	}

	public void setCourseDao(ICourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public List<Course> search(String name) {
		return courseDao.search(name);
	}

}
