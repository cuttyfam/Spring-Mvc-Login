<%@page import="th.co.aware.dao.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="th.co.aware.bean.ProductBean"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Page</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%
List<ProductBean> productBeans = new ArrayList<ProductBean>();
productBeans = ProductDAO.select();
%>
<div class="container">
	<fieldset>
		<legend>Delete Product</legend>
		<a href="Welcome.jsp">Back to menu</a>
		<sf:form action="doDel.obj" modelAttribute="productBean">
			<sf:label path="product_code">product_code</sf:label>
				<sf:select path="product_code" class="form-control">
				<% for(ProductBean prod : productBeans){  %>
					<option value="<%=prod.getProduct_code() %>"><%=prod.getName() %></option>
				<% } %>
				</sf:select>
			
			<br/>
			<button type="submit" class="btn btn-primary btn-block">Delete</button>
		</sf:form>
	</fieldset>
</div>

</body>
</html>