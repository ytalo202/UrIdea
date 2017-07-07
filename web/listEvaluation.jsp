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
<c:forEach var="evaluation" items="${service.evaluations}">

    <p>
        <c:out value=" ${evaluation.id}  ----> "/>
        <c:out value=" ${evaluation.company.nameCompany} ---> "/>
        <c:out value=" ${evaluation.idEmployee.name} ---> "/>
        <c:out value=" ${evaluation.date} ---> "/>
        <c:out value=" ${evaluation.grade}"/>
    </p>

</c:forEach>
</body>
</html>
