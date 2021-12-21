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



public class StudentInsertController extends HttpServlet {
	private  StudentServices  studentServices=new StudentServicesImpl();
	
	
	
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("insert.jsp");
		rd.forward(req, resp);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stubresp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String AS=req.getParameter("Sid");
		int sid=Integer.parseInt(AS);
		
		
		String sname=req.getParameter("Sname");
		String sfee=req.getParameter("Sfee");
		double fee=Double.parseDouble(sfee);
		String joindate=req.getParameter("joindate");
		
		Student student=new Student(sid, sname, fee, joindate);
		
		
		studentServices.insert(student);
	
		RequestDispatcher d=req.getRequestDispatcher("/FindAllStudentsController");
		d.forward(req, resp);
			}
	
	

}
