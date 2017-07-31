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
<head><meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


    <script src="js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Monserrat">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">



    <jsp:include page="bootstrap.jsp"/>
    <title>Perfil</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion</h1>
<div class="col-sm-4">
    <c:forEach var="evaluation" items="${service.findListEvaluatsById((employee.id))}">


        <a href="#<c:out value="${evaluation.id}"/>" data-toggle="collapse">
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

        </a>
        <div id="<c:out value="${evaluation.id}"/>" class="collapse">
            <p>promedio: <c:out value="${evaluation.avg_grade}"/></p>
            <p>Fecha: <c:out value=" ${evaluation.date}"/></p>
        </div>


    </c:forEach>

</div>


</body>
</html>
