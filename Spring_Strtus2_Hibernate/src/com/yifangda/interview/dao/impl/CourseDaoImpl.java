package com.yifangda.interview.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yifangda.interview.dao.ICourseDao;
import com.yifangda.interview.entity.Course;
import com.yifangda.interview.entity.Student;

@Repository
public class CourseDaoImpl implements ICourseDao {
	
	private Logger log = Logger.getLogger(CourseDaoImpl.class);
	private SessionFactory sessionFactory;
	private HibernateTemplate ht;

	public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
		this.ht = new HibernateTemplate(sessionFactory);
	}

	@Override
	public List<Course> search(String name) {
		
		String hql = "select m.id , m.name from Course as m left join m.students as n where n.name = ? )";
		List<Course> courses = ht.find(hql,name);
		return courses;
	}

	@Override
	public int add(Student student) {
		ht.save(student);
		return 0;
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getStudent(int id) {
		return ht.load(Student.class, id);
	}
	
}
