


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="comp" method="post">


    <p>contraseña<input type="text" name="password" /></p>
    <p>Correo<input type="text" name="EmailId" /></p>
    <p>descrip<input type="text" name="description" /></p>
    <p>nombre<input type="text" name="nameCompany" /></p>
    <p>estadInt<input type="text" name="companyState" /></p>
    <p>direccion<input type="text" name="address" /></p>
    <p>NumTelefo<input type="text" name="phoneNumber" /></p>

    <input type="hidden" value="create" name="action"/>
    <input type="submit"/>
</form>