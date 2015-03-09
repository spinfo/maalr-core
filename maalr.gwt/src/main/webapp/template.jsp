<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- HTML HEADER --%>
<jsp:include page="/maalr_modules/misc/htmlhead.jsp" />

	<body>
	
		<div id="top">
			<jsp:include page="/maalr_modules/misc/header.jsp" />
		</div>
		
		<div class="content">
			<%-- CONTENT AREA --%>
			<div id="template_page">
                <div class="container_full">
		             <h1 class="this-title">Title</h1>
					<div class="text">
						<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, 
						sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, 
						sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
						Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
						Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod 
						tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. 
						At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, 
						no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
					</div>
				</div>
			</div>
		</div>
		
		<jsp:include page="/maalr_modules/misc/footer.jsp" />

		<%-- GWT AJAX BROWSER HISTORY SUPPORT --%>
		<iframe src="javascript:''" id="__gwt_historyFrame" style="width: 0; height: 0; border: 0"></iframe>
		
	</body>
</html>