<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order List View</title>
</head>
<body>
	<table>
	<c:forEach var= "order" items ="${oDetails}">
	
	
	<tr>
		<td>Supplier ID:</td>
		<td>${order.supplierId}</td>
	</tr>
	
	<tr>
		<td>Order ID:</td>
		<td>${order.orderId}</td>
	</tr>
	
	
	<tr>
		<td>Orders:</td>
		<td>${order.orders}</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>