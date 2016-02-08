<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Vat</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
		<fieldset>
			<legend>View Vat</legend>
			<a href="Welcome.jsp">Back to menu</a>
		
				
				<!--  <h1>Store ${storeName}</h1>-->
					<table>
						<thead>
							<tr>
								<th>ProductName</th>
								<th>Price</th>
								<th>VAT</th>
								<th>CalculateVat</th>
							</tr>
							</thead>
							<tbody>
							<c:forEach var="listValue" items="${invoiceList}">
								<tr>
									<td>${invoiceList.getProductBean().getPname()}</td>
									<td>${invoiceList.getProductBean().getPrice()}</td>
									<td>${invoiceList.getVat()}</td>
									<td>${vat}</td>
								</tr>
								<tr>
									<td></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
	
		</fieldset>
	</div>
</body>
</html>