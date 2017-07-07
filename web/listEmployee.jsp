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
    <title>Title</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Desordenado</h1>
<c:forEach var="employee" items="${service.employees}">

    <p><c:out value="${employee.id}  ----> "/>
        <c:out value=" ${employee.name}"/> </p>

</c:forEach>
</body>
</html>
