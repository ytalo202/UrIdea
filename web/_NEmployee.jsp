


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="emp" method="post">



    <p>id_company<input type="text" name="id_company" value="${employee.company.nameCompany}"/></p>
    <p>id_email_address int<input type="text" name="id_email_address" value="${employee.emailAddress.emailData}"/></p>
   <p>employee_type int <input type="text" name="employee_type" value="${employee.employeeType}"/></p>
    <p>password<input type="text" name="password" value="${employee.password}"/></p>
    <p>employee_name <input type="text" name="employee_name" value="${employee.name}"/></p>
    <p>employee_first_last_name <input type="text" name="employee_first_last_name" value="${employee.firstLastName}"/></p>
    <p>employee_second_last_name <input type="text" name="employee_second_last_name" value="${employee.secondLastName}"/></p>
    <p>dni<input type="text" name="dni" value="${employee.dni}"/></p>
    <p>phone_number <input type="text" name="phone_number" value="${employee.phoneNumber}"/></p>
    <p>cell_phone_number<input type="text" name="cell_phone_number" value="${employee.cellPhoneNumber}"/></p>
    <p>address<input type="text" name="address" value="${employee.address}"/></p>
    <p>department <input type="text" name="department" value="${employee.department}"/></p>
    <p>birthdate <input type="text" name="birthdate" value="${employee.birthdate}"/></p>


    <input type="hidden" value="create" name="action"/>
    <input type="submit"/>
</form>