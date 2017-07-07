<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 07/07/2017
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Regions</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<c:forEach var="payment" items="${service.allPayments}">
    <p><c:out value="${payment.name}"/>
        <a href="payments?action=edit&id=<c:out value="${payment.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="payments?action=add">Add Payment</a>
</body>
</html>
