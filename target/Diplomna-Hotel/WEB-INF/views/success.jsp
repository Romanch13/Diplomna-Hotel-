<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.css">
    <style>
    <%@include file="/resources/css/bootstrap.min.css"%>
    <%@include file="/resources/css/MyCSS.css"%>
	</style>
	
<title>Сторінка підтвердження реєстрації</title>


</head>
<body>
<div class="container">
	<h1 class="success-people">  ${success}</h1>
	<div class="center">
	 <button class="btn btn-Info"><a class="back-list" href="<c:url value='/list' />">Повернутися до Списку всіх Гостей</a></button>
	</div>
	</div>
</body>

</html>