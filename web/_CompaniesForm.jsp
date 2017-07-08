


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="comp" method="post">


    <input type="text" name="id" value="${company.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="evaluation" value="${company.emailAdress.emailData}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />

    <input type="text" name="nameCompany" value="${company.nameCompany}"/>
    <input type="text" name="description" value="${company.description}"/>
    <input type="text" name="companyState" value="${company.companyState}"/>
    <input type="text" name="address" value="${company.address}"/>

    <input type="text" name="phoneNumber" value="${company.phoneNumber}"/>

    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>