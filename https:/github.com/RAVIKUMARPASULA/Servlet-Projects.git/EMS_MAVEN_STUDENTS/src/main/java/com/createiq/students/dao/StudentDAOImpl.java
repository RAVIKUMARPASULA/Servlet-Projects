package com.createiq.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.createiq.students.model.Student;
import com.createiq.students.querries.Studentquaries;
import com.createiq.students.util.ConnectionUtil;
//import com.vidvaan.queries.Queries;
//import com.vidvaan.queries.Queries;

//import com.vidvaan.queries.Queries;


public class StudentDAOImpl implements StudentDAO {

	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.getConnection();
		try {
			preparedStatement = connection.prepareStatement(Studentquaries.STD_INSERT);
			preparedStatement.setInt(1, student.getSid());
			preparedStatement.setString(2, student.getSname());
			preparedStatement.setDouble(3, student.getSfee());
			preparedStatement.setString(4, student.getJoindate());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
		
			
		} finally {
			//ConnectionUtil.close(preparedStatement, connection);
		}
		

		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		
		try {
			connection=ConnectionUtil.getConnection();
			preparedStatement=connection.prepareStatement(Studentquaries.STD_UPDATE);
			preparedStatement.setInt(4,student.getSid());
			preparedStatement.setString(1,student.getSname());
			preparedStatement.setDouble(2,student.getSfee());
			preparedStatement.setString(3,student.getJoindate());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		
	}



	@Override
	public Student serachById(Integer Sid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Student student = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Studentquaries.STD_SEARCH_BY_ID);
			preparedStatement.setInt(1, Sid);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				student = new Student();
				student.setSid(resultSet.getInt("SID"));
				student.setSname(resultSet.getString("SNAME"));
				student.setSfee(resultSet.getDouble("SFEE"));
				student.setJoindate(resultSet.getString("JOINDATE"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//ConnectionUtil.close(resultSet, preparedStatement, connection);
		}
		return student;
		// TODO Auto-generated method stub
		
		
	}
	public static void main(String[] args) {
		StudentDAOImpl a=new StudentDAOImpl();
		Student b=a.serachById(1);
		
		
		System.out.println(b);
	}

	@Override
	public List<Student> findAll() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Student> students = null;

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Studentquaries.STD_FIND_ALL);
			resultSet = preparedStatement.executeQuery();
			students = new ArrayList<Student>();
			while (resultSet.next()) {
				Student student = new Student();
				student.setSid(resultSet.getInt(1));
				student.setSname(resultSet.getString(2));
				student.setSfee(resultSet.getDouble(3));
				student.setJoindate(resultSet.getString(4));
				students.add(student);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}
//	public static void main(String[] args) {
//		StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
//		List<Student> std = studentDAOImpl.findAll();
//		System.out.println(std);
//		
//		
//	}

	@Override
	public void delete(Integer sid) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Studentquaries.STD_DELETE);
			preparedStatement.setInt(1, sid);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//ConnectionUtil.close(preparedStatement, connection);
		}
		
	}
	
	
	
	
	
	}
	


