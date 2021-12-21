package com.createiq.students.services;

import java.util.List;

import com.createiq.students.dao.StudentDAO;
import com.createiq.students.dao.StudentDAOImpl;
import com.createiq.students.model.Student;

public class StudentServicesImpl implements StudentServices {

	private static StudentDAO dao=new StudentDAOImpl();
	

	@Override
	public void insert(Student student) {
		dao.insert(student);
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

	@Override
	public void delete(Integer Sid) {
		// TODO Auto-generated method stub
		dao.delete(Sid);
		
	}

	@Override
	public Student serachById(Integer Sid) {
		return dao.serachById(Sid);
	}



	@Override
	public void update(Student student) {
		dao.update(student);
		// TODO Auto-generated method stub
		
	}

}
