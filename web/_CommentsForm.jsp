


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="com" method="post">
    <input type="text" name="id" value="${commentary.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="evaluation" value="${commentary.evaluation.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="commentaryType" value="${commentary.commentaryType}"/>
    <input type="text" name="detail" value="${commentary.detail}"/>
    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>