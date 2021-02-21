
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp"%>

<head>
<link rel="SHORTCUT ICON"
		href="http://www.amstringer.com/clients/ppi/favicon32x32.jpg">





 <script type="text/javascript" src="js/swfobject.js"></script>
 <script type="text/javascript" src="js/custom/customerComment.js"></script>
 <script language="javascript" type="text/javascript"
		src="js/rollovers.js"></script>
<!--[if IE]>
<link rel="stylesheet" type="text/css" href="css/default_ie.css" />
<![endif]-->

<link href="css/default.css" rel="stylesheet" type="text/css">
<link href="css/custom/customerComment.css" rel="stylesheet"
		type="text/css">
</head>

<body onload="initRollover()">



	




<div id="contain">
<div id="auxNav">
	<a href="default.html"><img src="images/auxNav_home_up.png"
				alt="Home" hsrc="images/auxNav_home_over.png"></a>
	<a href="customerComment"><img src="images/auxNav_email_up.png"
				alt="Email" hsrc="images/auxNav_email_over.png"></a>
	<a href="#" onclick="window.print();return false;"><img
				src="images/auxNav_print_up.png" alt="Print"
				hsrc="images/auxNav_print_over.png"></a>
	</div>
		<!--end auxNav-->
		<div class="clear">&nbsp;</div>
	<div id="nav">
		<a href="aboutUs.html"><img src="images/nav_aboutUs_up.png"
				alt="About Us" hsrc="images/nav_aboutUs_over.png"></a>
		<a href="products.html"><img src="images/nav_products_up.png"
				alt="Products" hsrc="images/nav_products_over.png"></a>
		<a href="newsAndMedia.html"><img src="images/nav_newsMedia_up.png"
				alt="News and Media" hsrc="images/nav_newsMedia_over.png"></a>
		<a href="signIn.html"><img src="images/nav_signIn_up.png"
				alt="Employee Sign In" hsrc="images/nav_signIn_over.png"></a>
	</div>
		<!--end nav-->
	
	<div class="clear">&nbsp;</div>

<div class="customerComment">
	<div id="leftCC">
		<form>
			<label for="toLine">To:</label><br>
			<input type="text" name="toLine" disabled
						value="christian.juste@waldenu.edu">
			<br>
			<label for="email">Email</label><br>
			<input type="text" name="email" id="email">
			<br>
			<label for="">city</label><br>
			<input type="text" name="city" id="city">
			<br>
			<label for="state">State</label><br>
			<input type="text" name="state" id="state">
			<br>
			<label for="">Zip</label><br>
			<select name="zip" id="zip">
				<c:forEach items="${zipcodes}" var="zipcode">
					<option value="${zipcode}">${zipcode}</option>
				</c:forEach>
			</select>
		</form>
		
	</div>
	<div id="rightCC">
		<textarea id="commentZone"></textarea>
	</div>
	<div id="buttonContainer"><button id="submitEmail">Submit</button></div>
</div>

<!--end content-->
		<div id="callout">
			<div id="calloutLeft">
				<img src="images/hr_aboutUs_up.png" alt="About Us"
					hsrc="images/hr_aboutUs_over.png">
            <p>
					<strong>Plush Packet  Inc. is a recognized leader in technology infused, educational toys and games. </strong>With offices in Los Angeles, Chicago and Washington D.C., PPI continues to grow and expand its product line.    </p>
            <p align="right">
					<a href="#"><img src="images/btn_learnMore.png"
						hsrc="images/btn_learnMore_over.png" width="87" height="27"
						alt="Learn More"></a>
				</p>
				<div id="footer">
					<p align="center">&nbsp;</p>
              <p align="center">
						<a href="default.html">Home</a> | <a href="aboutUs.html">About Us</a> | <a
							href="products.html">Products</a> | <a href="newsAndMedia.html">News &amp; Media</a> | <a
							href="signIn.html">Sign In</a> | <a href="mailto:info@ppi.com">Email</a>
					</p>
            </div>
				<!--end footer-->
			</div>
			<!--end calloutLeft-->
			<div id="calloutRight">
       	    <img src="images/logo.png" width="413" height="275"
					alt="Plush Packet Inc.">
			</div>
			<!--end calloutRight-->
			<div class="clear">&nbsp;</div>
		</div>
		<!--end Callout-->
		
		
		<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <h3>Your email has been delivered, here is what you sent:</h3>
    <br>
    <span>Email:</span><p id="emailP"></p>
    <span>City:</span><p id="cityP"></p>
    <span>State:</span><p id="stateP"></p>
    <span>Zip:</span><p id="zipP"></p>
    <span>Text:</span><p id="textP"></p>
  </div>

</div>
		
		
	</div>
	<!--end contain-->

<!-- The Modal -->




<script type="text/javascript" src="js/custom/homepage.js"></script>
<script type="text/javascript" src="js/custom/modal.js"></script>
</body></body>

<script type="text/javascript" src="js/custom/homepage.js"></script>
</html>