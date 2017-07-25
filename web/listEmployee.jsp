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

<c:forEach var="employee" items="${service.employees}">

    <p><c:out value="${employee.employeeType} -> "/>
        <c:out value="${employee.password} -> "/>
        <c:out value="${employee.company.nameCompany} -> "/>
        <c:out value="${employee.emailAddress.emailData} -> "/>
        <c:out value="${employee.name} -> "/>
        <c:out value="${employee.firstLastName} -> "/>
        <c:out value="${employee.secondLastName} -> "/>
        <c:out value="${employee.department} -> "/>
        <c:out value="${employee.dni} -> "/>
        <c:out value="${employee.address} -> "/>
        <c:out value="${employee.birthdate} -> "/>
        <c:out value="${employee.dni} -> "/>
        <c:out value="${employee.phoneNumber} -> "/>
        <c:out value="${employee.cellPhoneNumber} -> "/>

        <c:out value="${employee.area.nameArea} -> "/>

        <a href="emp?action=edit&id=<c:out value="${employee.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="emp?action=add">Add Email</a>
</body>
</html>
