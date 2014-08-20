<%@ page import="java.util.Calendar" %>
<%@ page import="de.uni_koeln.spinfo.maalr.webapp.i18n.UrlGenerator" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="<%=session.getAttribute("pl")%>" />
<fmt:setBundle basename="de.uni_koeln.spinfo.maalr.webapp.i18n.text" />

<div id="navi_bottom">
<footer>
	<ul id="navi_bottom_menu">
		<li><a href="#" id="propose_navi"><i></i><span class=""><fmt:message key="maalr.navi.suggest" /> </span></a></li>	
		<li><a href="/help.html"><fmt:message key="maalr.navi.help" /></li>
		<li><a href="/infos.html"><i></i><span class=""><fmt:message key="maalr.navi.info" /> </span></a></li>
		<li><a href="/browse.html"><i></i><span class=""><fmt:message key="maalr.navi.alphabet" /> </span></a></li>
		<li><a href="http://spinfo.phil-fak.uni-koeln.de/maalr.html" target="_blank"> <span><fmt:message key="maalr.footer.maalr" /></span></a></li>
	</ul>
	</footer>
</div>