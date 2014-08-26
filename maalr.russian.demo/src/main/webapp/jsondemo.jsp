<html>
<head>JSON REST API DEMO</head>
<link href="/assets/style/maalr_embed.css" rel="stylesheet">
<body>

	<!-- Zum Testen mit lokalem Server -->

	<!--  
   
   PARAMETER...
   
   -----------
   |Notwendig|
   -----------
   
   data-source: Pfad zum Maalr-Server
   data-locale: Sprache des Services (Lokalisierungsdatei muss vorhanden sein)
   
   ----------
   |Optional|
   ----------
   
   label, button, placeholder (Such-Zeile)
   autoquery (default ist "false", d.h. es werden keine queries beim tippen abgeschickt)
   pagesize (default is 5, Wertebereich ist 5 bis 20)
   embedcss (default ist true, bei false muss das styling der Suchbox selber übernommen werden und
   kann so an die Seite angepasst werden).
   
    -->

	<div id="maalr_query_div" class="maalr_query_div"
		data-source="http://localhost:8080" 
		data-locale="ru"
		data-label="Query" 
		data-button="Search!"
		data-placeholder="Enter a search phrase here..." 
		data-autoquery="true"
		data-pagesize="10" 
		data-embedcss="true">
		<script type="text/javascript" src="/assets/js/maalr_embed.js"></script>
	</div>

</body>
</html>
