<%@ page import="de.uni_koeln.spinfo.maalr.common.server.util.Configuration" %>
<%@ page import="de.uni_koeln.spinfo.maalr.common.shared.description.LemmaDescription.Language" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="<%=session.getAttribute("pl")%>" />
<fmt:setBundle basename="de.uni_koeln.spinfo.maalr.webapp.i18n.text" />

<div id="navi_head">
	<div id="brand_title">
		<a class="brand active" href="${dictContext}"><%=Configuration.getInstance().getLongName()%></a>
	</div>
	<%-- MAIN MENU --%>
    <ul class="left">
        <li><a id="navTemplate" title="template" href="${dictContext}/template.html"><fmt:message key="maalr.navi.template" /></a></li>
        <li><a id="navHilfe" title="help" href='#'><fmt:message key="maalr.navi.help" /></a></li>
    </ul>
	<%-- LANGUAGE SELECTION --%>	
	<ul class="right">
		<li><a href="?pl=ru" class="<%=(session.getAttribute("pl").equals("ru"))?"lang_select active":"lang_select"%>"><fmt:message key="maalr.langSelect.russian" /></a></li>
		<li><a href="?pl=de" class="<%=(session.getAttribute("pl").equals("de"))?"lang_select active":"lang_select"%>"><fmt:message key="maalr.langSelect.german" /></a></li>
	</ul>
	<jsp:include page="/maalr_modules/misc/login_widget.jsp" />
</div>



