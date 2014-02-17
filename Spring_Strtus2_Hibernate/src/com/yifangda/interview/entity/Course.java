package com.yifangda.interview.entity;

import java.util.HashSet;
import java.util.Set;

public class Course extends BaseObject{
	
	private String name;
	private double credit;
	private Set<Student> students = new HashSet<Student>();
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
    public Set<Student> getStudents() {
        return students;
    }
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
	@Override
	public String toString() {
		return "Course [name=" + name + ", credit=" + credit + ", students="
				+ students + "]";
	}
    
}
