


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">





        <input type="hidden" name="idCompany" value="${company.id}"/>

    <p>Nombre<input type="text" name="employee_name" value="${employee.name}"/></p>

    <p>Clave <input type="text" name="password" value="${employee.password}"/><p>




    <input type="hidden" value="createEmplAdmin" name="action"/>
    <input type="submit"/>
</form>