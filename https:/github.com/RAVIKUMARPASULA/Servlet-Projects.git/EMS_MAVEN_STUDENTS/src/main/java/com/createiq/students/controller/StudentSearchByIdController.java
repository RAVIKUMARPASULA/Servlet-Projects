package com.createiq.students.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.students.model.Student;
import com.createiq.students.services.StudentServices;
import com.createiq.students.services.StudentServicesImpl;
//import com.vidvaan.model.Employee;
//import com.vidvaan.service.EmployeeService;
//import com.vidvaan.service.EmployeeServiceImpl;

public class StudentSearchByIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int sid = Integer.parseInt(req.getParameter("sid"));
		StudentServices studentServices = new StudentServicesImpl();
		Student student = studentServices.serachById(sid);
		if (student != null) {
			out.println("<h2>Student Details Are </h2>");
			out.println("----------------------------- ");
			out.println("<br>SID : " + student.getSid());
			out.println("<br>SNAME : " + student.getSname());
			out.println("<br>SFEE : " + student.getSfee());
			out.println("<br>JOINDATE : " + student.getJoindate());
			out.println("<br>-----------------------------");
		} else {
			out.println("<h2>No Records found</h2>");
		}
		out.println("<br><a href='home.html'>Go to Home </a>");

	}
		
}


