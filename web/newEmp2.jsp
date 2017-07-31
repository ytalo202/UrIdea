


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="TypeEmployeeValidation" method="post">


    <p>Cod Email <input type="text" name="CorreNum" value="${emailNum}"/><p>

    <p>Nombre<input type="text" name="employee_name"/></p>
    <p>Dni <input type="text" name="dni"/><p>

    <input type="date" name="cumple">

    <p>Clave <input type="text" name="password"/><p>



    <input type="hidden" value="createEmplPeon" name="action"/>
    <input type="submit"/>
</form>