	function initialize() {
		var latlng = new google.maps.LatLng(38.236602, -85.717916);
		var settings = {
			zoom: 15,
			center: latlng,
			mapTypeControl: true,
			mapTypeControlOptions: {style: google.maps.MapTypeControlStyle.DROPDOWN_MENU},
			navigationControl: true,
			navigationControlOptions: {style: google.maps.NavigationControlStyle.SMALL},
			mapTypeId: google.maps.MapTypeId.ROADMAP
    };
            var map = new google.maps.Map(document.getElementById("map_canvas"), settings);
    }
    
        
    var map = new google.maps.Map(document.getElementById("map_canvas"), settings);
        var companyPos = new google.maps.LatLng(38.236602, -85.717916);
    var companyMarker = new google.maps.Marker({
        position: companyPos,
        map: map,
        title:"Heart and Soy"
    });
        
