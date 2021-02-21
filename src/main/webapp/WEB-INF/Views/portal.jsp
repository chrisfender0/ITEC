  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

<div id="invalid" class="hide"><c:out value="${invalid}"/></div>
<div id="warning" class="hide" style="color: red;position:  absolute;margin-top:  20px;margin-left: 57%;">Invalid Username or Password</div>
<%@ include file="html/portal.html" %>
<script src="js/custom/portal.js"></script>
</body>
</html>

