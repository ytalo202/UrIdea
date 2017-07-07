<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Magnus
  Date: 7/7/2017
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<c:forEach var="payment" items="${service.payments}">

    <p>
        <c:out value="${payment.id}  ----> "/>
        <c:out value=" ${payment.company.id} ---> "/>
        <c:out value=" ${payment.name} ---> "/>
        <c:out value=" ${payment.lastName} ---> "/>
        <c:out value=" ${payment.firstAddress} ---> "/>
        <c:out value=" ${payment.secondAddress} ---> "/>
        <c:out value=" ${payment.paymentsType.id}---> "/>
        <c:out value=" ${payment.cardNumber}---> "/>
        <c:out value=" ${payment.paymentDate} ---> "/>
        <c:out value=" ${payment.location} ---> "/>
        <c:out value=" ${payment.country} ---> "/>
        <c:out value=" ${payment.codeZip} ---> "/>
        <c:out value=" ${payment.cellPhoneNumber} ---> "/>
        <c:out value=" ${payment.amount} "/>

    </p>

</c:forEach>
</body>
</html>
