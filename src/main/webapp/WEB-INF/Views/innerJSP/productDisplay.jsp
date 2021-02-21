<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="css/custom/product.css" />
<c:forEach items="${products}" var="product">
	<div id="calloutLogIn">
		<img src="images/logIn_top.png" width="485" height="25" />
		<div id="calloutLogInInterior">
			<div class="calloutLeft">
				<img src="${product.image}" width="150" height="180" alt="Penguin" />
			</div>
			<div class="calloutRight">
				<h2>${product.name}</h2>
				<p>${product.description}</p>
				<h6>Retail Price ${product.retailprice}</h6>
				<button class="addToCartButton" onclick="addToCart('test')">Add to Cart</button>
			</div>
			<div class="clear">&nbsp;</div>
		</div>
		<!--end calloutLogInInterior-->
		<img src="images/logIn_bottom.png" width="485" height="26" />
	</div>
	<br />
</c:forEach>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="js/custom/addToCart.js"></script>