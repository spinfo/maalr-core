<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="de.uni_koeln.spinfo.maalr.login.MaalrUserInfo"%>
<%@page import="java.util.List"%>
<%@page import="de.uni_koeln.spinfo.maalr.login.UserInfoBackend"%>
<%@ page import="de.uni_koeln.spinfo.maalr.common.shared.Constants"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="javax.security.auth.login.LoginContext"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="de.uni_koeln.spinfo.maalr.login.LoginManager"%>
<%-- Header included here --%>
<jsp:include page="editor_head.jsp" />
<body>
<iframe src="javascript:''" id="__gwt_historyFrame" style="width:0;height:0;border:0"></iframe>
	<div id="navigation"></div>
	<div id="main-content" class="container-fluid"></div>
</body>
</html>
