<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (user == null) {
		//response.sendRedirect("/view/user/login");
	} else {
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=rootPath%>/ui/css/style_login.css" />
<link rel="stylesheet" href="<%=rootPath%>/ui/css/ani.css" />
<title>IOT_TEST</title>
</head>
<body>

	<jsp:include page="/WEB-INF/view/common/header.jspf" flush="false" />
	

    <link href='https://fonts.googleapis.com/css?family=Montserrat:700|Pinyon+Script' rel='stylesheet' type='text/css'>

<div class="e">
  <h1 id="welcom">환영합니다</h1>
  <h2>My</h2>
</div>



	
</body>
</html>
<%
	}
%>
