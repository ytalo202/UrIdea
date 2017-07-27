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

    <c:forEach var="evaluation" items="${service.findEvaluationAgv(11)}">




        <div class="progress">
            <div class="progress-bar progress-bar-success"
                 style="width: <c:out value="${evaluation.grade}"/>%">
                <span class="sr-only">35% Complete (success)</span>
                <c:out value="${evaluation.grade}"/>%
            </div>
            <div class="progress-bar progress-bar-striped active" style="width: <c:out value=" ${evaluation.grade1}"/>%">
                <span class="sr-only">20% Complete (warning)</span>
                <c:out value="${evaluation.grade1}"/>%
            </div>
            <div class="progress-bar progress-bar-danger" style="width: <c:out value=" ${evaluation.grade2}"/>%">
                <span class="sr-only">10% Complete (danger)</span>
                <c:out value="${evaluation.grade2}"/>%
            </div>
        </div>

        <div class="progress">
            <div class="progress-bar" role="progressbar" aria-valuenow="<c:out value="${evaluation.grade}"/>" aria-valuemin="0" aria-valuemax="100" style="width: <c:out value="${evaluation.grade}"/>%;">
                60%
            </div>
        </div>


           <c:out value="${evaluation.avg_grade}"/>


    </c:forEach>




</b:jumbotron>

</body>
</html>
