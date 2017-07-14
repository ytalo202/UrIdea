

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">

    <input type="text" name="ytalo" value="${company}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text"  value="${company}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />

    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>