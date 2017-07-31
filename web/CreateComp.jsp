


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">

    <p>nombre<input type="text" name="nameCompany" /></p>
    <p>contraseña<input type="text" name="password" /></p>
    <input type="hidden" value="createComp" name="action"/>
    <input type="submit"/>
</form>