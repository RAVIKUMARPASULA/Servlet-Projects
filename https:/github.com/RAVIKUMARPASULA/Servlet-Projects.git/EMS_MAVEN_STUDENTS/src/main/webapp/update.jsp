<%@page import="com.createiq.students.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
	

</head>
<div class="p-3 mb-2 bg-primary text-white"><h1 align="center">SRIMATHA INTERNATIONAL SCHOOL</h1></div>
<body>
<h3 align="center">UPDATE STUDENT DETAILS</h3><hr>
<%Student student=(Student)request.getAttribute("Student"); %>
<form action="./StudentUpdateController" method="post">
		<table align="center">
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