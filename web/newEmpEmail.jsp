
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">
    <input type="hidden" name="idCompany" value="${company.id}"/>
    <p>Correo ..<input type="text" name="emailData" /></p>
    <input type="hidden" value="createEmail" name="action"/>
    <input type="submit"/>
</form>