$( document ).ready(function() {
	console.log("username==" + $("#username").text());
	
	if($("#username").text()=="invalid" || $("#username").text()==undefined){
		//set red text invalid u/p 
	} else {
		$("#greeter").text($("#greeter").text().replace("stranger", $("#username").text()));
	}
	
});