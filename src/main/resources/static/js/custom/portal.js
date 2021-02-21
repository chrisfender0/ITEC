$( document ).ready(function() {
	console.log("is it invalid?==" + $("invalid").text());
	if($("#invalid").text()=="invalid"){
		$("#warning").removeClass("hide");
		
		let intervalTimes = 0;
		
		let myInterval = setInterval(function(){
				
				if(intervalTimes===11){
					clearTimeout(myInterval);
				}
				var color = $("#warning").css( "background-color" );
				if(color=="rgb(0, 0, 0)"){
					$("#warning").css( "background-color", "white");
				} else {
					$("#warning").css( "background-color", "black");
				}
				intervalTimes = intervalTimes+1;
		}	
				,100);
		
		
	}
	
});

