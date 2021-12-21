<%@page import="com.createiq.students.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>UPDATE STUDENT DETAILS</h3><hr>
<%Student student=(Student)request.getAttribute("Student"); %>
<form action="./StudentUpdateController" method="post">
		<table>
			<tr>
				<td>SID</td>
				<td><input type="text" name="sid" value="<%=student.getSid()%>" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>SNAME</td>
				<td><input type="text" name="sname" value="<%=student.getSname()%>"/></td>
			</tr>
			<tr>
				<td>SFEE</td>
				<td><input type="text" name="sfee" value="<%=student.getSfee()%>"/></td>
			</tr>
			<tr>
				<td>JOINDATE</td>
				<td><input type="text" name="joindate" value="<%=student.getJoindate()%>"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>