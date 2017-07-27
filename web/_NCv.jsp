
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="TypeEmployeeValidation" method="post">



    <select name="cv_type">
        <option value="1" >Experienza</option>
        <option value="2" >Estudios</option>
    </select>

    <p>description
        <textarea name="description"
                  cols="30" rows="10"></textarea>
    </p>


    <input type="hidden" value="addCv2" name="action"/>
    <input type="submit"/>
</form>