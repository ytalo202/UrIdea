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
        <c:out value=" ${payment.id}  ----> "/>
        <c:out value=" ${payment.name} ---> "/>
        <c:out value=" ${payment.amount}---> "/>
        <c:out value=" ${payment.company.nameCompany} ---> "/>
        <c:out value=" ${payment.cardNumber}"/>
    </p>

</c:forEach>
</body>
</html>
