<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>University Enrollments</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
			
		}
	</style>

</head>


<body>
	 <h2>List of Guests</h2> 
    <table>
        <tr>
            <td>Прізвище</td><td>Ім'я</td><td>Тип номеру</td><td>Номер кімнати</td><td>Додаткові послуги</td><td>Типи витрат</td><td>Номер телефону</td><td>Тип Оплати</td><td>Тип картки</td><td>Номер картки</td><td>Сума оплати</td><td>Дата</td> 
        </tr>
        <c:forEach items="${guests}" var="guests">
            <tr>
            <td>${guests.surname}</td>
            <td>${guests.name}</td>
            <td>${guests.type_rooms}</td>
            <td>${guests.number_room}</td>
            <td>${guests.additional_Service}</td>
            <td>${guests.spending_Types}</td>
            <td>${guests.number_phone}</td>
            <td>${guests.payment}</td>
            <td>${guests.type_cards}</td>
            <td>${guests.number_cards}</td>
            <td>${guests.amount_payment}</td>
            <td>${guests.date}</td>
            <td><a href="<c:url value='/edit-${guests.payment}-guests' />">${guests.payment}</a></td>
            <td><a href="<c:url value='/delete-${guests.payment}-guests' />">delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New Guests</a>
</body>
</html>