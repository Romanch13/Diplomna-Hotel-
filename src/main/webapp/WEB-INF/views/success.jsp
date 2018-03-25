<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Сторінка підтвердження реєстрації</title>

<style>

	body {
		font-family: sans-serif;}
	a{
		text-decoration: none;}
</style>
</head>
<body>
	message : ${success}
	<br/>
	<br/>
	 Повернутися до <a href="<c:url value='/list' />">Списку всіх Гостей</a>
	
</body>

</html>