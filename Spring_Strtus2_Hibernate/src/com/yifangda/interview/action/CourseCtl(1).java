package com.yifangda.interview.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.yifangda.interview.service.ICourseService;

public class CourseCtl {
	
	private ICourseService courseService;
	
    public ICourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	
	public String execute(){
	    
	    HttpServletRequest req = ServletActionContext.getRequest();
	    HttpServletResponse resp = ServletActionContext.getResponse();
	    ActionContext context = ActionContext.getContext(); 
	    Map params = context.getParameters();
	    String name = req.getParameter("name");
	    
	    List courses = courseService.search(name);
	    context.put("courses", courses);
		return "success";
	}
	
	
}
