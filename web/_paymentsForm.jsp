<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 07/07/2017
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment</title>
</head>
<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<form action="payments" method="post">
    <input type="text" name="id" value="${payment.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="name" value="${payment.name}"/>
    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>

</form>
