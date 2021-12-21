<%@page import="com.createiq.students.model.Student"%>
<%@page import="java.util.List"%>
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



</head>
<div class="p-3 mb-2 bg-primary text-white"><h1 align="center">SRIMATHA INTERNATIONAL SCHOOL</h1></div>
<body >
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

<div class="header">
  <a href="#default" class="logo"></a>
  <div class="header-right">
    <a class="active" href="./index.jsp">Home</a>
  
  </div>

		<hr>
		<%
			if (request.getAttribute("msg") != null) {
		%>
		<span class="success"><%=request.getAttribute("msg")%></span>
		<%
			}
		%>

<div   bgcolor="lightblue" class="container">
		<h3 align="CENTER">STUDENT  DETAILS</h3>
		<h3 align="left"><a href="./INSERTSTUDENTCONTROLLER" class="btn btn-primary" >NewStudent</a></h3>
		<h3 align="left"><a href="./StudentSearchByIdController" class="btn btn-primary">SEARCH STUDENT</a></h3>
		
		<p ></p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SID</th>
					<th>SNAME</th>
					<th>STUDENTFEE</th>
					<th>JOINDATE</th>
					<th>EDIT</th>
					<th>DELETE</th>
					
				</tr>
			</thead>
			<%
			List<Student> students = (List<Student>) request.getAttribute("Student");
			for (Student std : students) {
			%>
			<tbody>
				<tr>
					<td><%=std.getSid() %></td>
					<td><%=std.getSname() %></td>
					<td><%=std.getSfee() %></td>
					<td><%=std.getJoindate() %></td>
					<td><a href="./StudentUpdateController?sid=<%=std.getSid()%>">Edit</a></td>
				<td><a href="./StudentDeleteController?sid=<%=std.getSid()%>">Delete</a></td>
				
					
				</tr>
			
			</tbody>
			<%} %>
		</table>
		
	</div>

</body>
</html>