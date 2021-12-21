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




<body>

<div   bgcolor="lightblue" class="container">

		



<div class="header">
  <a href="#default" class="logo"></a>
  <div class="header-right">
    <a  class="active" href="#home"  >About</a>
   </div>
  <a class="active" href="./index.jsp">Home</a>



</div>
<table class="table table-striped"  bgcolor="lightblue">
			<thead>
				<tr >
					<th><h4 style=" bgcolor:lightblue" class="container" align="center">Current Time: <%= java.util.Calendar.getInstance().getTime() %>  </h4>
					<p></p><p>In addition to these core schools, students in a given country may also attend schools before and after primary (elementary in the US) and secondary (middle school in the US) education.
					 field, such as a school of economics or a school of dance. Alternative schools may provide nontraditional curriculum and methods.
					Non-government schools, also known as private schools,[3] may be required when the government does not supply adequate, or specific educational needs. Other private schools can also be religious, 
					such as Christian schools, gurukula (Hindu schools), madrasa (Arabic schools), hawzas (Shi'i Muslim schools), yeshivas (Jewish schools), and others; or schools that have a higher standard of education 
					or seek to foster other personal achievements. Schools for adults include institutions of corporate training, military education and training and business schools.

					

					
					
				</tr>
			</thead>
			</table>


  


</div>
</body>
</html>
