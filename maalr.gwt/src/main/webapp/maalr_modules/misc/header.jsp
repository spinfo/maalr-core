<%@ page import="de.uni_koeln.spinfo.maalr.common.server.util.Configuration" %>
<%@ page import="de.uni_koeln.spinfo.maalr.common.shared.description.LemmaDescription.Language" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="<%=session.getAttribute("pl")%>" />
<fmt:setBundle basename="de.uni_koeln.spinfo.maalr.webapp.i18n.text" />

<div id="navi_head">
	<div id="brand_title">
		<a class="brand active" href="/"><%=Configuration.getInstance().getLongName()%></a>
	</div>
	<%-- MAIN MENU --%>
    <ul class="left">
        <li><a id="navTemplate" title="template" href="/template.html">Beispiel-Seite</a></li>
        <li><a id="navInfo" title="info" href="/template.html"><fmt:message key="maalr.navi.info" /></a></li>
        <li><a id="navHilfe" title="help" href='#'><fmt:message key="maalr.navi.help" /></a></li>
    </ul>
	<%-- LANGUAGE SELECTION --%>	
	<ul class="right">
		<li><a href="?pl=ru" class="<%=(session.getAttribute("pl").equals("ru"))?"lang_select active":"lang_select"%>"><fmt:message key="maalr.langSelect.russian" /></a></li>
		<li><a href="?pl=rm" class="<%=(session.getAttribute("pl").equals("rm"))?"lang_select active":"lang_select"%>"><fmt:message key="maalr.langSelect.romansh" /></a></li>
		<li><a href="?pl=de" class="<%=(session.getAttribute("pl").equals("de"))?"lang_select active":"lang_select"%>"><fmt:message key="maalr.langSelect.german" /></a></li>
		<li><a href="?pl=en" class="<%=(session.getAttribute("pl").equals("en"))?"lang_select active":"lang_select"%>"><fmt:message key="maalr.langSelect.english" /></a></li>
        <li><img class="login_icon" src="/assets/img/login-icon.png" alt="login" /></li>
	    <li><jsp:include page="/maalr_modules/misc/login_widget.jsp" /></li>
	</ul>
</div>



