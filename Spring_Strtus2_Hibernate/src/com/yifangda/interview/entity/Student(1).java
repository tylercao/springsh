package com.yifangda.interview.entity;

import java.util.Set;

public class Student extends BaseObject{
	
	private String name;
	private int age;
	private String remark;
	private Set<Course> courses;
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    public Set<Course> getCourses() {
        return courses;
    }
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", remark=" + remark
				+ ", courses=" + courses + "]";
	}
    
}
