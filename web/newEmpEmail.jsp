
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">
    <input type="hidden" name="idCompany" value="${company.id}"/>
    <input type="text" name="emailData" />
    <input type="hidden" value="createEmail" name="action"/>
    <input type="submit"/>
</form>