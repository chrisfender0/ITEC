  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>


<c:forEach items="${products}" var="product">
	<c:out value = "${product.id}"/><br/>
	<c:out value = "${product.type}"/><br/>
	<c:out value = "${product.name}"/><br/>
	<c:out value = "${product.description}"/><br/>
	<c:out value = "${product.image}"/><br/>
	<c:out value = "${product.retailprice}"/><br/>
</c:forEach>

</body>
</html>