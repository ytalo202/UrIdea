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
    <title>Perfil</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Perfil</h1>
<c:forEach var="employee" items="${service.findAllEmployeeById(employee.id)}">

    <p>Nombre </p>
    <c:out value="${employee.name} "/>
    <c:out value="${employee.firstLastName} "/>
    <c:out value="${employee.secondLastName}"/>
    <br>
    <p>Trabaja Para </p>
    <c:out value="${employee.company.nameCompany} -> "/>
    <br>
    <p>Su Correo </p>
    <c:out value="${employee.emailAddress.emailData} -> "/>
    <br>
    <p>Recidencia </p>
    <c:out value="${employee.department}"/>
    <br>
    <p>Dni </p>
    <c:out value="${employee.dni} -> "/>
    <br>
    <p>Direccion de Domicilio </p>
    <c:out value="${employee.address} -> "/>
    <br>
    <p>Cumpleaños </p>
    <c:out value="${employee.birthdate} -> "/>
    <br>
    <p>Telefono
        <c:out value="${employee.phoneNumber}"/></p>
    <br>
    <p>Celular
        <c:out value="${employee.cellPhoneNumber}"/></p>
    <br>
    <p>Area
        <c:out value="${employee.area.nameArea}"/></p>




</c:forEach>

<h1>Evaluacion</h1>
<c:forEach var="evaluation" items="${service.findEvaluationAgv((employee.id))}">
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


    <h1>Promedio General</h1>
    <c:out value="${evaluation.avg_grade}"/>

    <a href="TypeEmployeeValidation?action=EvaluationHistorial&idEmployee=
<c:out value="${evaluation.idUserEmployee.id}"/>&idArea=<c:out value="${evaluation.idUserEmployee.area.id}"/>">
        Ver Historial de Evaluaciones
    </a>

</c:forEach>



<h1>Cv</h1>
<c:forEach var="cv" items="${service.findAllCvsByIdEmployee((employee.id))}">

    <p>
        <c:out value="${cv.description}"/>

    </p>
</c:forEach>
</body>
</html>
