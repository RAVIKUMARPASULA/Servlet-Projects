package com.createiq.students.querries;

public interface Studentquaries {
	String STD_FIND_ALL = "SELECT * FROM Student";
	String STD_SEARCH_BY_ID = "SELECT * FROM Student WHERE Sid = ?";
	String STD_INSERT = "INSERT INTO Student VALUES(?,?,?,?)";
	String STD_UPDATE = "UPDATE Student SET Sname = ?, Sfee = ?,joindate=? WHERE Sid = ?";
	String STD_DELETE = "DELETE FROM Student WHERE Sid = ?";


}
