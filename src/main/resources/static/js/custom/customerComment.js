$(document).ready(function(){
	
	
	$("#submitEmail").on("click",function(){
		
		
		
		let email = $("#email").val();
		let city = $("#city").val();
		let state = $("#state").val();
		let zip = $("#zip").val();
		let comments = $("#commentZone").val();
		console.log("" + email + city + state + zip + comments + "");
		
		$("#emailP").text(email);
		$("#cityP").text(city);
		$("#stateP").text(state);
		$("#zipP").text(zip);
		$("#textP").text(comments);
		
		$("#myModal").css("display", "block");
	});
	
	$("span").on("click", function(){
		$("#myModal").css("display", "none");
	});
})