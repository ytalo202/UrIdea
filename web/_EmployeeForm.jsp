


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="emp" method="post">


    <input type="text" name="id" value="${employee.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="id_company" value="${employee.company.nameCompany}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="id_email_address" value="${employee.emailAddress.emailData}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />


    <input type="text" name="employee_type" value="${employee.employeeType}"/>
    <input type="text" name="password" value="${employee.password}"/>
    <input type="text" name="employee_name" value="${employee.name}"/>
    <input type="text" name="employee_first_last_name" value="${employee.firstLastName}"/>
    <input type="text" name="employee_second_last_name" value="${employee.secondLastName}"/>
    <input type="text" name="dni" value="${employee.dni}"/>
    <input type="text" name="phone_number" value="${employee.phoneNumber}"/>
    <input type="text" name="cell_phone_number" value="${employee.cellPhoneNumber}"/>
    <input type="text" name="address" value="${employee.address}"/>
    <input type="text" name="department" value="${employee.department}"/>
    <input type="text" name="birthdate" value="${employee.birthdate}"/>

    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>