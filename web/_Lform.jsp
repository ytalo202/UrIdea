

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">

    <input type="text" name="idCompany" value="${company.id}"/>
    <input type="hidden" value="edit" name="action"/>
    <input type="submit"/>
</form>
