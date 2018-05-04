<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
	
	<title>Реєстрація Клієнтів</title>
	
	
</head>
<div class="h2-zagolovk-first-page"></div>
<body>

	 <div align="center" class="zagolovok">Реєстрація Клієнтів</div>
 	<br>
    <form:form method="POST" modelAttribute="guests">
        <form:input type="hidden" path="id" id="id"/>
       <div class="container-fluid">
       <div class="col-xs-12 col-md-4 ">
            <table class="reg"><!-- ZAGOLOVOk -->
            <div align="center" class="zagolovok-form">Введіть Дані
            <tr>
                <td><label for="surname">Прізвище: </label> </td>
                <td><form:input path="surname" id="surname" /></td>
                <td><form:errors path="surname" cssClass="error"/></td>
             </tr>
             <tr>
                <td><label for="name">Ім'я: </label> </td>
                <td><form:input path="name" id="name"/></td>
                <td><form:errors path="name" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="number_phone">Номер телефону: </label></td>
                <td><form:input path="number_phone" number="number_phone" /></td>
                <td><form:errors path="number_phone" cssClass="error"/></td>
            </tr>
              </div>
            </table>
            
            <table class="reg">
             <!-- ZAGOLOVOk -->
            <div align="center" class="zagolovok-form">Виберіть Тип та Номер кімнати
            <tr class="reg_0">
                <td><label for="type_rooms">Тип кімнати:</label></td>
                <td><form:input path="type_rooms" id="type_rooms"/>
                <td><form:errors path="type_rooms" cssClass="error"/></td>
            </tr>
            <tr class="reg_0">
                <td><label for="number_room">Номер кімнати: </label> </td>
                <td><form:input path="number_room" id="number_room"/></td>
                <td><form:errors path="number_room" cssClass="error"/></td>
            </tr>
            </div>
              </table>
            </div>  
            
 <div class="col-xs-12 col-md-4 ">
  		<table class="reg"><!-- ZAGOLOVOk -->
            <div align="center" class="zagolovok-form">Виберіть Послуги та Типи витрат
            <tr>
                <td><label for="additional_Service">Додаткові послуги: </label> </td>
                <td><form:input path="additional_Service" id="additional_Service"/></td>
                <td><form:errors path="additional_Service" cssClass="error"/></td>
            </tr>
    
            <tr>
                <td><label for="spending_Types">Типи витрат: </label> </td>
                <td><form:input path="spending_Types" id="spending_Types"/></td>
                <td><form:errors path="spending_Types" cssClass="error"/></td>
            </tr>
             </div>
             </table>
            	
             <table class="reg1">
              <!-- ZAGOLOVOk -->
             <div align="center" class="zagolovok-form1">Виберіть Тип оплати
            <tr class="reg_1">
                <td><label for="payment">Тип Оплати: </label> </td>
                <td><form:input path="payment" id="payment" /></td>
                <td><form:errors path="payment" cssClass="error"/></td>
            </tr>
             <tr class="reg_1">
                <td><label for="type_cards">Тип Картки: </label> </td>
                <td><form:input path="type_cards" id="type_cards"/></td>
                <td><form:errors path="type_cards" cssClass="error"/></td>
            </tr>
             </div>
            </table>
            </div>
           
            <div class="col-xs-12 col-md-4 ">
            <table class="reg">
                 <!-- ZAGOLOVOk -->
             <div align="center" class="zagolovok-form nowrap">Введіть Hомер картки та Cумму оплати
            <tr>
                <td><label for="number_cards">Номер картки: </label> </td>
                <td><form:input path="number_cards" id="number_cards"/></td>
                <td><form:errors path="number_cards" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="amount_payment">Сума до оплати: </label> </td>
                <td><form:input path="amount_payment" id="amount_payment"/></td>
                <td><form:errors path="amount_payment" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="date">Дата реєстрації: </label> </td>
                <td><form:input path="date" id="date"/></td>
                <td><form:errors path="date" cssClass="error"/></td>
            </tr>
            </div>
          </table>
       </div>
    </div>
    <br>
    <div class="col-xs-12 col-md-12">
   <div class="container-fluid center-button">
   <br>
            <tr>
                <td colspan="3">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Оновити" class="btn btn-primary"/>
                        </c:when>
                        <c:otherwise >
                            <input type="submit" value="Зареєструвати" class="btn btn-success"/>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
       </div>
     </div>
    </form:form>
   
    <div class="container-fluid">
    <button class="btn btn-Info"><a class="back-list" href="<c:url value='/list' />" >Повернутися до Списку з гостями</a></button>
    </div>
    
  <div class="tabless">
   <div class="col-xs-4 col-md-4">
    <table data-toggle="table" class="regist" > 
           <thead class="podpis">
            <tr>
             <th  data-sortable="true">Типи витрат</th><th data-sortable="true">Ціна UAH</th></tr>
  </thead>
    <tbody class="regestire">
          <tr class="dani1">
           <td>Пляжна парасолька</td>
  			<td>70</td>
          </tr>  
          <tr class="dani1">
           <td>Аренда велосипеду</td>
  			<td>100</td>
          </tr> 
          <tr class="dani1">
           <td>Уроки гольфу</td>
  			<td>150</td>
          </tr> 
          <tr class="dani1">
           <td>Гольф, 18 лунок</td>
  			<td>300</td>
          </tr> 
          <tr class="dani1">
           <td>Гольф, 9 лунок</td>
  			<td>250</td>
          </tr> 
          <tr class="dani1">
           <td>Рушник для басейну</td>
  			<td>50</td>
          </tr> 
          <tr class="dani1">
           <td>Тенісний корт</td>
  			<td>400</td>
          </tr> 
          <tr class="dani1">
           <td>Уроки тенісу</td>
  			<td>250</td>
          </tr>   
           <tr class="dani1">
           <td>Спортивний комплекс</td>
  			<td>200</td>
          </tr>  
           <tr class="dani1">
           <td>Масаж</td>
  			<td>150</td>
          </tr>  
           <tr class="dani1">
           <td>Сауна</td>
  			<td>100</td>
          </tr>  
        </tbody> 
    </table>
    </div>
    <div class="col-xs-4 col-md-4">
    <table data-toggle="table" class="regist"> 
           <thead class="podpis">
            <tr>
             <th  data-sortable="true">Типи номерів </th><th data-sortable="true">Ціна UAH</th></tr>
  </thead>
     <tbody class="regestire">
         <tr class="dani1">
           <td>Президенський</td>
  			<td>2500</td>
          </tr> 
          <tr class="dani1">
           <td>Стандартний</td>
  			<td>600</td>
          </tr> 
          <tr class="dani1">
           <td>Люкс</td>
  			<td>1300</td>
  			</tr>
  			 <tr class="dani1">
           <td>Напів-люкс</td>
  			<td>1100</td>
          </tr>  
           <tr class="dani1">
           <td>Економ</td>
  			<td>450</td>
          </tr>  
          <tr class="dani1">
           <td>Преміум клас</td>
  			<td>1600</td>
          </tr>   
             <tr class="dani1">
           <td>Duplex-двоповерховий</td>
  			<td>2000</td>
          </tr>  
           <tr class="dani1">
           <td>Сімейний</td>
  			<td>1000</td>
          </tr>  
        </tbody> 
    </table>
    </div>
    <div class="col-xs-4 col-md-4">
    <table data-toggle="table" class="regist" > 
           <thead class="podpis">
            <tr>
             <th  data-sortable="true">Доп. послуги</th><th data-sortable="true">Ціна UAH</th></tr>
  </thead>
     <tbody class="regestire">
          <tr class="dani1">
           <td>Спутникове телебачення</td>
  			<td>200</td>
          </tr> 
          <tr class="dani1">
           <td>Мінібар</td>
  			<td>300</td>
          </tr> 
          <tr class="dani1">
           <td>Доставка сніданку в номер</td>
  			<td>400</td>
          </tr> 
             
        </tbody> 
    </table>
    </div>
   </div>
</body>
</html>