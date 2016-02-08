<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Page</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
		<fieldset>
			<legend>Add Product</legend>
			<a href="Welcome.jsp">Back to menu</a>
			<sf:form action="doAdd.obj" modelAttribute="productBean">
				
				<sf:label path="product_code">product_code</sf:label>
				<sf:input path="product_code" class="form-control" />
				
				<sf:label path="isactive">isactive</sf:label>
				<sf:select path="isactive" class="form-control">isactive
				<option value="Y">Y</option>
				<option value="N">N</option>
				</sf:select>
				
				<sf:label path="name">name</sf:label>
				<sf:input path="name" class="form-control"/>
				
				<sf:label path="price">price</sf:label>
				<sf:input path="price" class="form-control" />
				
				<sf:label path="store_id">store_id</sf:label>
				<sf:input path="store_id" class="form-control"/>
				
				<br/>
				<button type="submit" class="btn btn-primary btn-block">Submit</button>
			</sf:form>
		</fieldset>
	</div>

</body>
</html>