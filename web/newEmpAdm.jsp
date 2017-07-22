


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">





        <input type="hidden" name="idCompany" value="${company.id}"/>

    <p>Cod Email <input type="text" name="CorreNum" value="${emailNum}"/><p>

    <p>Nombre<input type="text" name="employee_name"/></p>
    <p>Dni <input type="text" name="dni"/><p>

    <select name="idArea">
        <option value="1">Contabilidad</option>
        <option value="2">Administracion</option>
        <option value="3">Publicidad</option>
        <option value="4">Recursos Humanos</option>
    </select>
    <input type="date" name="cumple">

    <p>Clave <input type="text" name="password"/><p>



    <input type="hidden" value="createEmplAdmin" name="action"/>
    <input type="submit"/>
</form>