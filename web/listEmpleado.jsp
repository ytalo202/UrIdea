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
<h1>Lista Empleados</h1>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>




<form   action="v" method="post">
    <select name="idArea"  onchange="this.form.submit()">
        <option value="0">Elija una Opcion</option>
        <option value="1">Informatica</option>
        <option value="2">Marketing</option>
        <option value="3">Produccion</option>
        <option value="4">Administracion</option>
        <option value="5">Practicantes</option>
        <option value="6">Todas las Areas</option>
    </select>
    <input type="hidden" value="listTypeArea" name="action">

</form>


<c:forEach var="employee" items="${service.findAdmin(2,company.id)}">
    <p>
        <c:out value="${employee.name}"/>
        <c:out value="${employee.company.id}"/>
        <c:out value="${employee.employeeType}"/>
        <c:out value="${employee.dni}"/>
        <c:out value="${employee.emailAddress.emailData}"/>
        <c:out value="${employee.area.nameArea}"/>


        <a href="v?action=editTypeAdmin&idEmployee=<c:out value="${employee.id}"/>">
            Cambiar a Admin
        </a>

        <a href="v?action=Perfil&idEmployee=<c:out value="${employee.id}"/>">
            Ver Perfil
        </a>
    </p>
</c:forEach>

<a href="v?action=regresar">

    Regresar</a>

</body>
</html>
