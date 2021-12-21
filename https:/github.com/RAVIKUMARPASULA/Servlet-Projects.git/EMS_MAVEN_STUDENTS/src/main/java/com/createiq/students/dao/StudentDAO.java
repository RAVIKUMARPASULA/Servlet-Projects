package com.createiq.students.dao;

import java.util.List;

import com.createiq.students.model.Student;



public interface StudentDAO {
	public void insert(Student student );
	public void update(Student student);
	public void delete(Integer sid);
	public Student serachById(Integer Sid);
	List<Student>findAll();
	
	
	
}
