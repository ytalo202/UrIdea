


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="v" method="post">



    <p>id_company

        <input type="text" name="idCompany" value="${company.id}"/></p>

    <p>id_email_address int

        <input type="text" name="idEmail" value="${emailAddress.id}"/></p>




    <input type="hidden" value="create" name="action"/>
    <input type="submit"/>
</form>