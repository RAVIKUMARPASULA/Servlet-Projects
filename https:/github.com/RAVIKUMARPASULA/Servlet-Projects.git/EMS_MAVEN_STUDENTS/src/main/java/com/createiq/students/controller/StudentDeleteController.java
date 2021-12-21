package com.createiq.students.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.students.services.StudentServices;
import com.createiq.students.services.StudentServicesImpl;
//import com.vidvaan.service.EmployeeService;
//import com.vidvaan.service.EmployeeServiceImpl;

public class StudentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
		StudentServices studentServices = new StudentServicesImpl();
		studentServices.delete(sid);
		request.setAttribute("msg", "Record Deleted Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("/FindAllStudentsController");
		rd.forward(request, response);
	}
}
