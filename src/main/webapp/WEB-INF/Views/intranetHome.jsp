  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

<!-- store emp name and general needed info here -->
<div id="username" class="hide"><c:out value="${username}"/></div>
<%@ include file="html/intranetHome.html" %>
<script src="js/custom/signin.js"></script>
</body>
</html>