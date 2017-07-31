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
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>




<c:forEach var="company" items="${service.ListCompanyById(2)}">


    <h1>Compañia <c:out value="${company.nameCompany}"/></h1>

    <p>Correo: <c:out value="${company.emailAdress.emailData}"/></p>
    <p>Direccion: <c:out value="${company.address}"/></p>
    <p>Numero Telefonico: <c:out value="${company.phoneNumber}"/></p>
    <p>Descripxion: <c:out value="${company.description}"/></p>

        <a href="v?action=edit">
            Editar Datos
        </a>

</c:forEach>



<h2>Empleados Administradores</h2>

<table>

    <tr>

        <th>Nombre Completo</th>
        <th>Dni</th>
        <th>Correo Electrónico</th>
        <th>Área</th>
        <th>Cumpleaños</th>
        <th>Telefono</th>
        <th>Celular</th>
        <th>Residencia</th>
        <th>Ciudad</th>

    </tr>

    <c:forEach var="employee" items="${service.findAdmin(1,2)}">
        <tr>
            <td><c:out value="${employee.name} "/><c:out value="${employee.firstLastName} "/>
                <c:out value="${employee.secondLastName}"/></td>
            <td> <c:out value="${employee.dni}"/></td>
            <td> <c:out value="${employee.emailAddress.emailData}"/></td>
            <td><c:out value="${employee.area.nameArea}"/></td>
            <td><c:out value="${employee.birthdate}"/></td>
            <td><c:out value="${employee.phoneNumber}"/></td>
            <td><c:out value="${employee.cellPhoneNumber}"/></td>
            <td><c:out value="${employee.address}"/></td>
            <td><c:out value="${employee.department}"/></td>



        </tr>
    </c:forEach>

</table>







<h2>Empleados Ordinarios</h2>
<table>

    <tr>

        <th>Nombre Completo</th>
        <th>Dni</th>
        <th>Correo Electrónico</th>
        <th>Área</th>
        <th>Cumpleaños</th>
        <th>Telefono</th>
        <th>Celular</th>
        <th>Residencia</th>
        <th>Ciudad</th>

    </tr>

    <c:forEach var="employee" items="${service.findAdmin(2,2)}">
        <tr>
            <td><c:out value="${employee.name} "/><c:out value="${employee.firstLastName} "/>
                <c:out value="${employee.secondLastName}"/></td>
            <td> <c:out value="${employee.dni}"/></td>
            <td> <c:out value="${employee.emailAddress.emailData}"/></td>
            <td><c:out value="${employee.area.nameArea}"/></td>
            <td><c:out value="${employee.birthdate}"/></td>
            <td><c:out value="${employee.phoneNumber}"/></td>
            <td><c:out value="${employee.cellPhoneNumber}"/></td>
            <td><c:out value="${employee.address}"/></td>
            <td><c:out value="${employee.department}"/></td>



        </tr>
    </c:forEach>

</table>

</body>
</html>
