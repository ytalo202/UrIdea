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
<h1>Historial de Evaluacion de Marketing</h1>
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
            <h5>Descripcion</h5>
            <p>promedio: <c:out value="${evaluation.avg_grade}"/></p>
            <p>Fecha: <c:out value=" ${evaluation.date}"/></p>
            <p>Evaluador: <c:out value=" ${evaluation.idEvaluator.name}"/> <c:out value=" ${evaluation.idEvaluator.firstLastName}"/> <c:out value=" ${evaluation.idEvaluator.secondLastName}"/></p>
            <table border="1">
                <tr>
                    <th >Evaluacion de Actitud</th>
                    <th >Puntaje </th>
                    <th >Evaluacion de Valores</th>
                    <th >Puntaje </th>
                    <th >Evaluacion de Crecimiento Profecional</th>
                    <th >Puntaje </th>
                </tr>
                <tr>
                    <td>Compromiso: </td> <td><c:out value=" ${evaluation.commitment_company}"/></td>
                    <td>Puntualidad: </td><td><c:out value=" ${evaluation.punctuality}"/></td>
                    <td>Habilidad de Idiomas: </td><td><c:out value=" ${evaluation.language_skills}"/></td>
                </tr>
                <tr>
                    <td>Liderasgo: </td><td><c:out value=" ${evaluation.leadership}"/></td>
                    <td>Honestidad: </td><td><c:out value=" ${evaluation.honesty}"/></td>
                    <td>Habilidad de Negocios: </td><td><c:out value=" ${evaluation.business_skills}"/></td>
                </tr>
                <tr>
                    <td>Analitico: </td><td><c:out value=" ${evaluation.analytical}"/></td>
                    <td>Organizacion: </td><td><c:out value=" ${evaluation.organized}"/></td>
                    <td>Conocimientos de Negocio: </td><td><c:out value=" ${evaluation.business_knowledge}"/></td>
                </tr>
                <tr>
                    <td>Objetivo: </td><td><c:out value=" ${evaluation.objective}"/></td>
                    <td>Responsabilidad: </td><td><c:out value=" ${evaluation.responsibility}"/></td>
                    <td>Conocimientos de Mercado: </td><td><c:out value=" ${evaluation.market_knowledge}"/></td>
                </tr>
                <tr>
                    <td>Toma de decisiones: </td><td><c:out value=" ${evaluation.decision_making}"/></td>
                    <td>Respeto: </td><td><c:out value=" ${evaluation.respect}"/></td>
                    <td>Productividad: </td><td><c:out value=" ${evaluation.productivity}"/></td>
                </tr>
                <tr>
                    <td></td><td></td>
                    <td></td><td></td>
                    <td>Comunicacion: </td><td><c:out value=" ${evaluation.communication_skills}"/></td>
                </tr>
                <tr>
                    <td></td><td></td>
                    <td></td><td></td>
                    <td>Innovacion: </td><td><c:out value=" ${evaluation.innovative}"/></td>
                </tr>

            </table>
            <br>
            <p>Comentario: <c:out value=" ${evaluation.comment}"/></p>


        </div>
        <br>

    </c:forEach>

</div>


</body>
</html>
