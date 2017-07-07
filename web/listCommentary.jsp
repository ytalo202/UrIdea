<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Magnus
  Date: 7/7/2017
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TypeComentary</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Desordenado</h1>
<c:forEach var="commentary" items="${service.comments}">

<p><c:out value="${commentary.id}------>"/><c:out value="${commentary.commentaryType}  ----> "/>
        <c:out value="${commentary.detail}  ----> "/>
        <c:out value="${commentary.evaluation.company.nameCompany}----> "/>
        <c:out value="${commentary.evaluation.company.description}----> "/>
    </c:forEach>
</body>
</html>
