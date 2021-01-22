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
		},
		flashTitle: function(){
			setInterval(function(){
				let color = $(".modalTitle").css('color') == "rgb(255, 0, 0)" ? $(".modalTitle").css('color','black') : $(".modalTitle").css('color','red');
			}, 700)
		}
}