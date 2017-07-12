

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="email" method="post">

    <input type="text" name="id" value="${emailAddress.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="emailData" value="${emailAddress.emailData}"/>
    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>