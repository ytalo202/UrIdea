
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 24/06/2017
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Countries By Name</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Ordenado</h1>
<c:forEach var="emaillAdress" items="${service.emailsOrderById}">

    <p><c:out value="${emaillAdress.id} ----> "/><c:out value=" ${emaillAdress.emailData}"/> </p>


</c:forEach>
</body>
</html>
