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
<body>
<div class="container">
		<h2>Striped Rows</h2>
		<p>The .table-striped class adds zebra-stripes to a table:</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SID</th>
					<th>SNAME</th>
					<th>STUDENTFEE</th>
					<th>JOINDATE</th>
				</tr>
			</thead>
			<%
			List<Student> students = (List<Student>) request.getAttribute("students");
			for (Student std : students) {
			%>
			<tbody>
				<tr>
					<td><%=std.getSid() %></td>
					<td><%=std.getSname() %></td>
					<td><%=std.getSfee() %></td>
					<td><%=std.getjoindate() %></td>
				</tr>
			
			</tbody>
			<%} %>
		</table>
	</div>

</body>
</html>