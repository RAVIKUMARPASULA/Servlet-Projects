package com.createiq.students.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.students.model.Student;
import com.createiq.students.services.StudentServices;
import com.createiq.students.services.StudentServicesImpl;


public class StudentUpdateController extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int sid=Integer.parseInt(req.getParameter("sid"));
		StudentServices studentServices=new StudentServicesImpl();
		Student student=studentServices.serachById(sid);
		System.out.println("check"+student);
		req.setAttribute("Student", student);
		RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
		rd.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int sid = Integer.parseInt(req.getParameter("sid"));
		String sname = req.getParameter("sname");
		double sfee = Double.parseDouble(req.getParameter("sfee"));
		String joindate=req.getParameter("joindate");
		Student student = new Student(sid, sname, sfee,joindate);
		StudentServices studentServices = new StudentServicesImpl();
		studentServices.update(student);
		req.setAttribute("msg", "Record Updated Successfully");
		RequestDispatcher rd = req.getRequestDispatcher("/FindAllStudentsController");
		rd.forward(req, resp);
		
	}
	public static void main(String[] args) {
	
		
	}
	

}
