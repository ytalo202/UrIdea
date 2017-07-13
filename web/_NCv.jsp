
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="cV" method="post">


    <p>id_employee<input type="text" name="id_employee"/></p>
    <p>cv_type<input type="text" name="cv_type"/></p>
    <p>description<input type="text" name="description"/></p>


    <input type="hidden" value="create" name="action"/>
    <input type="submit"/>
</form>