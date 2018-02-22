<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Employee Registration Form</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	 <h2>Registration Form</h2>
 
    <form:form method="POST" modelAttribute="guests">
        <form:input type="hidden" path="id" id="id"/>
        <table>
            <tr>
                <td><label for="surname">Surname: </label> </td>
                <td><form:input path="surname" id="surname"/></td>
                <td><form:errors path="surname" cssClass="error"/></td>
            </tr>
        
        <tr>
                <td><label for="name">Name: </label> </td>
                <td><form:input path="name" id="name"/></td>
                <td><form:errors path="name" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="type_rooms">Type rooms: </label> </td>
                <td><form:input path="type_rooms" id="type_rooms"/></td>
                <td><form:errors path="type_rooms" cssClass="error"/></td>
            </tr>
            
            <tr>
                <td><label for="number_room">Number room: </label> </td>
                <td><form:input path="number_room" id="number_room"/></td>
                <td><form:errors path="number_room" cssClass="error"/></td>
            </tr>
    
            <tr>
                <td><label for="additional_Service">Additional Service: </label> </td>
                <td><form:input path="additional_Service" id="additional_Service"/></td>
                <td><form:errors path="additional_Service" cssClass="error"/></td>
            </tr>
    
            <tr>
                <td><label for="spending_Types">Spending Types: </label> </td>
                <td><form:input path="spending_Types" id="spending_Types"/></td>
                <td><form:errors path="spending_Types" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="number_phone">Number phone: </label> </td>
                <td><form:input path="number_phone" id="number_phone"/></td>
                <td><form:errors path="number_phone" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="payment">Payment: </label> </td>
                <td><form:input path="payment" id="payment"/></td>
                <td><form:errors path="payment" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="type_cards">Type cards: </label> </td>
                <td><form:input path="type_cards" id="type_cards"/></td>
                <td><form:errors path="type_cards" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="number_cards">Number cards: </label> </td>
                <td><form:input path="number_cards" id="number_cards"/></td>
                <td><form:errors path="number_cards" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="amount_payment">Amount payment: </label> </td>
                <td><form:input path="amount_payment" id="amount_payment"/></td>
                <td><form:errors path="amount_payment" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="date">Date: </label> </td>
                <td><form:input path="date" id="date"/></td>
                <td><form:errors path="date" cssClass="error"/></td>
            </tr>
    
            <tr>
                <td colspan="3">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Update"/>
                        </c:when>
                        <c:otherwise >
                            <input type="submit" value="Register"/>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/list' />">List of All Guests</a>
</body>
</html>