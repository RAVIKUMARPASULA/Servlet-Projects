package com.createiq.students.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.students.model.Student;
import com.createiq.students.services.StudentServices;
import com.createiq.students.services.StudentServicesImpl;




public class StudentFindAllController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private  StudentServices  studentServices=new StudentServicesImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		List<Student> students=studentServices.findAll();
		System.out.println(students);
		req.setAttribute("Student", students);
		RequestDispatcher d=req.getRequestDispatcher("findall.jsp");
		d.forward(req, resp);
		
		}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
