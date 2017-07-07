<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yoshinon
  Date: 5/07/2017
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<c:forEach var="paymentsType" items="${service.paymentsTypes}">
    <p><c:out value="${paymentsType.name}"/>


        <a href="pay?action=edit&id=<c:out value="${paymentsType.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="pay?action=add">Add PaymentsType</a>
</body>
</html>
