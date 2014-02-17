package com.yifangda.interview.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yifangda.interview.dao.ICourseDao;
import com.yifangda.interview.entity.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestDB {
	
	@Resource
	private ICourseDao ICourseDao;
	
	@Test
	public void test() {
		
		Student s = ICourseDao.getStudent(1);
		System.out.println(s);
	}

}
