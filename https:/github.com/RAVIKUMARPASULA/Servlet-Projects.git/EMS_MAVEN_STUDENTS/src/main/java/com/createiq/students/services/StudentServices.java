package com.createiq.students.services;

import java.util.List;

import com.createiq.students.model.Student;

public interface StudentServices {
	public void insert(Student student);

	public void update(Student student);

	public void delete(Integer Sid);

	public Student serachById(Integer Sid);
    
	public List<Student> findAll();


}
