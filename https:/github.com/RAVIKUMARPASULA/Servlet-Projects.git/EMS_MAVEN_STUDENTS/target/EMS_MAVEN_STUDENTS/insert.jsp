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
<body  >
<div   bgcolor="red" class="container">
		<h3 align="CENTER">STUDENT  DETAILS</h3>
	<form action="./INSERTSTUDENTCONTROLLER" method="post">
		<table align="center">
			
			<tr>
				<td>SID</td>
				<td><input type="text" name="Sid" /></td>
			</tr>
			<tr>
				<td>SNAME</td>
				<td><input type="text" name="Sname" /></td>
			</tr>
			<tr>
				<td>SFEE</td>
				<td><input type="text" name="Sfee" /></td>
			</tr>
			<tr>
			<tr>
				<td>JOINDATE</td>
				<td><input type="text" name="joindate" /></td>
			</tr>
				<td></td>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>