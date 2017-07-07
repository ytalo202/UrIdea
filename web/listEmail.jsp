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
<h1>Desordenado</h1>
<c:forEach var="emailAddress" items="${service.emailAddresses}">


    <p><c:out value="${emailAddress.emailData}"/>
        <a href="email?action=edit&id=<c:out value="${emailAddress.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="email?action=add">Add Email</a>


</body>
</html>
