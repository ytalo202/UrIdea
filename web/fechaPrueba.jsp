<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yoshinon
  Date: 5/07/2017
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<html>
<head>
    <jsp:include page="bootstrap.jsp"/>
    <title>Title</title>
</head>
<body>
<b:jumbotron>
    <jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

    <c:forEach var="evaluation" items="${service.findFechaEvaluation(1)}">
        <c:out value="${evaluation.id}"/><br>
        <p><c:out value="${evaluation.year}"/>-
        <c:out value="${evaluation.month}"/>-
        <c:out value="${evaluation.day}"/></p>

    </c:forEach>




</b:jumbotron>

</body>
</html>
