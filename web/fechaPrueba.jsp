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

    <c:forEach var="cv" items="${service.findCvFecha(1)}">

        <a href="v?action=EditarCvAdmin&idCv=<c:out value="${cv.id}"/>&year=<c:out value="${cv.year}"/>&month=<c:out value="${cv.month}"/>&day=<c:out value="${cv.day}"/>">
            Si desea Editar El Cv:
        </a>
        <p><c:out value="${cv.id}"/>----<c:out value="${cv.year}"/>/<c:out value="${cv.month}"/>/<c:out value="${cv.day}"/></p>

    </c:forEach>




</b:jumbotron>

</body>
</html>
