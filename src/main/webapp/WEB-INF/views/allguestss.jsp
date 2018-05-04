<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="UK">
<head>
	<meta http-equiv="Content-Type\" content="text/html; charset=UTF-8\">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.css">
    <style>
    <%@include file="/resources/css/bootstrap.min.css"%>
    <%@include file="/resources/css/MyCSS.css"%>
	</style>
	<script type="text/javascript">
	 <%@include file="/resources/js/MyJs.js"%>
	</script>
	<title>Гончара Романа</title>
</head>
    
<div class="h2-zagolovk-first-page"></div>
<body>
 <h2 align="center" class="zagolovok">Список Клієнтів</h2>

<div class="fixed-table-toolbar">
	<div class="fsearch pull-left search">
	<table>
	 <tr class="search-tabl">
	 <td><label >Знайти клієнта:</label></td> 
	 <td><input type="text" class="search form-control" placeholder="Введіть дані"></td>
	 </tr></table>
	</div>
</div>
<span class="counter pull-right"></span>
     	<table data-toggle="table" class="allguestss1" data-pagination="true"  > 
           <thead class="podpis">
            <tr>
             <th  data-sortable="true">Прізвище</th><th data-sortable="true">Ім'я</th><th data-sortable="true">Тип номеру</th><th data-sortable="true">Номер кімнати</th><th  data-sortable="true"> Доп. послуги</th><th data-sortable="true">Типи витрат</th><th>Номер телефону</th><th>Тип Оплати</th><th>Тип картки</th><th>Номер картки</th><th >Сума оплати</th><th data-sortable="true">Дата</th><th>Змінити дані</th><th>Видалити</th>
   		
  </thead>
    <tbody class="allguestss">
        <c:forEach items="${guests}" var="guests">
            <tr class="dani">
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
            <td><a  href="<c:url value='/edit-${guests.id}-guests' />"><button class="btn-m btn-success btn-sm">Редагувати</button></a></td>
            <td><a href="<c:url value='/delete-${guests.id}-guests' />"><button class="btn-m btn-danger btn-sm">Видалити</button></a></td>
            </tr>    
        </c:forEach>
        </tbody>
       
    </table>

    <br/>
    <div class="container-fluid">
    <div class="mybut">
    <a href="<c:url value='/new' />"><button class="btn btn-dark">Додати нового гостя</button></a>
    </div>
    </div>
 

</body>
</html>