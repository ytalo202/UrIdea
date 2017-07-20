


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Esta Seguro ?.....</h1>
<form action="v" method="post">


    <input type="hidden" name="idEmployee" value="${employee.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="hidden" name="idCompany" value="${employee.company.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />




    <input type="hidden" value="updatechangeEmployee" name="action"/>
    <input type="submit"/>

    <button type="button">
        <a href="v?action=regresar&idCompany=<c:out value="${employee.company.id}"/>">

            Regresar</a></button>
</form>