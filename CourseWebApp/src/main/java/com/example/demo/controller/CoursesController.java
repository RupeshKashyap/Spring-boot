package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	@RequestMapping("courses")
	public ModelAndView couse(@RequestParam("cname") String  coursename) {
		//HttpSession session = req.getSession();
		
		System.out.println("Welcome to Coures");
		//String cname = req.getParameter("cname");
		//System.out.println("The Couse Name "+cname);
		//session.setAttribute("cname", cname);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course");
		
		return mv;
	}

}
