


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="eva" method="post">

    <input type="text" name="id" value="${evaluation.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="id_company" value="${evaluation.company.nameCompany}"
        <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
            />
    <input type="text" name="id_evaluator" value="${evaluation.idEmployee.name} "
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="id_user_employee" value="${evaluation.idUserEmployee.name}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />

    <input type="text" name="date" value="${evaluation.date} "/>
    <input type="text" name="note" value="${evaluation.grade}"/>

    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>