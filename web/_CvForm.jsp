
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="cV" method="post">

    <input type="text" name="id" value="${cv.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="id_employee" value="${cv.employee.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />

    <input type="text" name="cv_type" value="${cv.cvType}"/>
    <input type="text" name="description" value="${cv.description}"/>


    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>