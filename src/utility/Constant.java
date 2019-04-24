package utility;



public class Constant {
	
	public static final String BURDA_MAIN_URL="https://www.burdastyle.de/";
	public static final String BURDA_MAIN_URL_STAGING="https://staging-env.burdastyle.de/";
	
	public static final String BEFORE="<!doctype html>\n" + 
			"<html lang=\"en\">\n" + 
			"  <head>\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\">"+
			"    <title>burda tests</title>\n" + 
			"    <!-- Required meta tags -->\n" + 
			"    <meta charset=\"utf-8\">\n" + 
			"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" + 
			"\n" + 
			"    <!-- Bootstrap CSS -->\n" + 
			"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n" + 
			"  		<link rel=\"stylesheet\" href=\"burda.css\" type=\"text/css\">\n" + 
			"   \n" + "<style>\n" + 
					"\n" + 
					"body {\n" + 
					"  font-family: \"Lato\", sans-serif;\n" + 
					"  background-color: #F5F5F5;\n" + 
					"    color:#333;\n" + 
					"    display:flex;\n" + 
					"    justify-content: center;\n" + 
					"}\n" + 
					".testContainer{\n" + 
					"    display: flex;\n" + 
					"    padding: 3px 0 3px 0;\n" + 
					"    border-bottom: solid 1px #EC008C;\n" + 
					"}\n" + 
					"\n" + 
					".testContainer > div{\n" + 
					"    display:flex;\n" + 
					"}\n" + 
					"\n" + 
					".testGroup{\n" + 
					"    color:#EC008C;\n" + 
					"    text-align: center;\n" + 
					"    justify-content: center;\n" + 
					"}\n" + 
					"\n" + 
					".testNumber{\n" + 
					"    padding-left: 10px;\n" + 
					"}\n" + 
					"\n" + 
					".globalContainer{\n" + 
					"    max-width: 1100px;\n" + 
					"}\n" + 
					"\n" + 
					".testStatusFailed{\n" + 
					"    color:white;\n" + 
					"    background-color:rgb(51, 51, 51);\n" + 
					"    margin-right: 10px;\n" + 
					"    padding-left: 5px;\n" + 
					"    padding-right: 5px;\n" + 
					"    align-self: flex-end;\n" + 
					"    margin-left:auto ;\n" + 
					"}\n" + 
					"\n" + 
					".testStatus{\n" + 
					"    margin-left:auto ;\n" + 
					"    margin-right: 10px;\n" + 
					"}\n" + 
					"\n" + 
					".testTitle{\n" + 
					"    margin-left: 30px;\n" + 
					"    margin-right: 30px;\n" + 
					"    text-align:left;\n" + 
					"}\n" + 
					"\n" + 
					"   </style>"+
			"</head>\n" + 
			"  \n" + 
			"\n" + 
			"<body>\n" + 
			"\n" + 
			"\n" + 
			"    \n" +"<div class=\"globalContainer\">"+
			"    <div class=\"testContainer\">\n" + 
			"    	<div class=\"testNumber\">NUMBER</div>\n" + 
			"      	<div class=\"testTitle\">TEST NAME</div>\n" + 
			"      	<div class=\"testStatus\">STATUS</div>\n" + 
			"    </div>";
	
	public static final String AFTER="</div>"+" <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" + 
			"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n" + 
			"    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n" + 
			"	 <script type=\"text/javascript\" src=\"js/cryptocurrency_prices.js\"></script>\n" + 
			"  </body>\n" + 
			"</html>";
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static final String[] INTERNAL_LINKS_STAGING = {
			//BURDA_STYLE
			"https://staging-env.burdastyle.de/wir-ueber-uns"
			,"https://staging-env.burdastyle.de/newsletter","https://burdastyle-abo.de/?hnr=extern.verlag.burdastyle.footer", "https://staging-env.burdastyle.de/magazin",
			"https://staging-env.burdastyle.de/community-richtlinien",
			//HILFE
			"https://staging-env.burdastyle.de/hilfe","https://staging-env.burdastyle.de/fragen-zum-bestellablauf",
			"https://staging-env.burdastyle.de/customer-information?page=naehen-mit-dem-downloadschnitt","https://staging-env.burdastyle.de/customer-information?page=versandkosten",
			"https://staging-env.burdastyle.de/kontakt",
			//RECHTLICHES
			"https://staging-env.burdastyle.de/customer-information?page=allgemeine-geschaeftsbedingungen",
			"https://staging-env.burdastyle.de/impressum","https://staging-env.burdastyle.de/customer-information?page=datenschutzbestimmungen",
			"https://staging-env.burdastyle.de/nutzungsbedingungen","https://bcn.burda.de/werbeloesungen/uebersicht/",
			"https://staging-env.burdastyle.de/gewinnspielbedingungen",
			//ADRESSEN
			"https://staging-env.burdastyle.de/gesucht-und-gefunden","https://staging-env.burdastyle.de/naehkurs-liste",
			"https://staging-env.burdastyle.de/haendler-liste",
			//DATENSCHUTZ
			"https://staging-env.burdastyle.de/datenschutzanfrage",
			//WERBUNG
			"https://bcn.burda.de/marken/national/titel/burda-style-online/","https://bcn.burda.de/marken/national/titel/burda-style/",
			//GESCHAFTSKUNDEN
			"http://geschaeftskunden.burdastyle.de/"
			
	};
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
}


