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



<c:forEach var="company" items="${service.companies}">

    <p><c:out value="${company.password} -> "/>
        <c:out value="${company.nameCompany} -> "/>
        <c:out value="${company.description} -> "/>
        <c:out value="${company.companyState} -> "/>
        <c:out value="${company.emailAdress.emailData} -> "/>
        <c:out value="${company.address} -> "/>
        <c:out value="${company.phoneNumber} -> "/>

        <a href="comp?action=edit&id=<c:out value="${company.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="comp?action=add">Add Email</a>
</body>
</html>
