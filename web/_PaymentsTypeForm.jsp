


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="pay" method="post">
    <input type="text" name="id" value="${paymentsType.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="name" value="${paymentsType.name}"/>
    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>