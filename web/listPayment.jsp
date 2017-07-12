<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<c:forEach var="payment" items="${service.allPayments}">

    <p>
        <c:out value="${payment.company.nameCompany} -> "/>
        <c:out value="${payment.paymentsType.name} -> "/>
        <c:out value="${payment.cardNumber} -> "/>
        <c:out value="${payment.name} -> "/>
        <c:out value="${payment.lastName} -> "/>
        <c:out value="${payment.firstAddress} -> "/>
        <c:out value="${payment.secondAddress} -> "/>
        <c:out value="${payment.paymentDate} -> "/>
        <c:out value="${payment.location} -> "/>
        <c:out value="${payment.country} -> "/>
        <c:out value="${payment.codeZip} -> "/>
        <c:out value="${payment.cellPhoneNumber} -> "/>
        <c:out value="${payment.amount} -> "/>
        <c:out value="${payment.expiryMonth} -> "/>
        <c:out value="${payment.expiryDay} -> "/>
        <c:out value="${payment.securityCode} -> "/>
        <a href="paym?action=edit&id=<c:out value="${payment.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="paym?action=add">Add Payment</a>
</body>
</html>
