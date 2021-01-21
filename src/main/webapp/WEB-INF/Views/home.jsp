  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<div id="evenOrOdd" class="hide"><c:out value="${evenOrOdd}"/></div>
<div id="modal" class="hide modal">
	<div class="modal-content">
		<span class="close" onclick="modal.close()">&times;</span>
		<%@ include file="modal.jsp" %>
	</div>
</div>
<%@ include file="html/default.html" %>

</body>
<script type="text/javascript" src="js/custom/homepage.js"></script>
<script type="text/javascript" src="js/custom/modal.js"></script>
</html>