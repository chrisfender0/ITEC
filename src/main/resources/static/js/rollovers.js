function initRollover() {
  if (!document.getElementById) return
  var imgOver = new Array();
  var imgDown = new Array();
  var DOMimgs = document.getElementsByTagName('img');
  for (var i = 0; i < DOMimgs.length; i++) {
    if (DOMimgs[i].getAttribute('hsrc')) {
        imgOver[i] = new Image();
        imgOver[i].src = DOMimgs[i].getAttribute('hsrc');
		DOMimgs[i].setAttribute('osrc',DOMimgs[i].getAttribute('src'));
        DOMimgs[i].onmouseover = function() {
            this.setAttribute('src',this.getAttribute('hsrc'));
        }
        DOMimgs[i].onmouseout = function() {
            this.setAttribute('src',this.getAttribute('osrc'));
        }
	}
    if (DOMimgs[i].getAttribute('dsrc')) {
        imgOver[i] = new Image();
        imgOver[i].src = DOMimgs[i].getAttribute('dsrc');
		DOMimgs[i].setAttribute('osrc',DOMimgs[i].getAttribute('src'));
        DOMimgs[i].onmousedown = function() {
            this.setAttribute('src',this.getAttribute('dsrc'));
        }
        DOMimgs[i].onmouseup = function() {
            this.setAttribute('src',this.getAttribute('osrc'));
        }
		DOMimgs[i].onmouseout = function() {
            this.setAttribute('src',this.getAttribute('osrc'));
        }
	}
  }
  
	  var DOMlnks = document.getElementsByTagName('a');
	  var TestHref;
	  var thisLocation =new String(window.location);
	
	  for (var i=0; i < DOMlnks.length; i++) {
	
		TestHref = DOMlnks[i].getAttribute('href');
		if ( thisLocation.search(TestHref) > -1) {
			if(DOMlnks[i].getAttribute('highlight')=="true")
				DOMlnks[i].style.color = "#FFFFCC" ;
		}
	  }
}
