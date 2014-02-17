package com.yifangda.interview.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yifangda.interview.entity.Course;
import com.yifangda.interview.service.ICourseService;


public class TestSpringHibernate {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");	
		ICourseService courseDao = (ICourseService)ac.getBean("userService");
		
		List<Course> courses = courseDao.search("");
	}
}
