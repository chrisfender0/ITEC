let modal = {
		launch: function(){
			setTimeout( 
					function(){
						$("#modal").toggleClass("hide");
						modal.pickProduct();
					}
					,1000);
		},
		close: function(){
			$("#modal").toggleClass("hide");
		},
		pickProduct: function(){
			if($("#evenOrOdd").text()==0){
				$("#evenDayProduct").removeClass("hide");
			} else {
				$("#oddDayProduct").removeClass("hide");
			}
		}
}