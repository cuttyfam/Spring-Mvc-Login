<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home page</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
<h1>Welcome</h1>
	<div class=container">
		<fieldset>
			<legend>Navigation menu</legend>
			<a href="index.jsp">Home</a><br/>
			<br/>
			<h2>HELLO</h2>
			<br/>
			Welcome ${userBean.username}
			<br/>
			<a href="toAdd.obj">AddProduct</a><br/>
			<a href="toDel.obj">DeleteProduct</a><br/>
			<a href="doVat.obj">ViewVat</a>
		</fieldset>
	</div>

</body>
</html>