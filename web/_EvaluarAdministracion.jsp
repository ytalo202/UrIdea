
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion Para El Area Administracion</h1>
<h2>Evaluacion de Actitud </h2>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">
        <tr>
            <td>Mostro su compromiso a la Empresa en Mcuhas Ocaciones</td>
            <td>
                <input type="radio" name="commitment_company" value="1">bajo
                <input type="radio" name="commitment_company" value="3">medio
                <input type="radio" name="commitment_company" value="6.66">alto
            </td>
        </tr>
        <tr>
            <td>proactivo</td>
            <td>  <input type="radio" name="proactive" value="1">pocas veces
                <input type="radio" name="proactive" value="3">regularmente
                <input type="radio" name="proactive" value="6.66">siempre
            </td>
        </tr>

        <tr>
            <td>Objetivo</td>
            <td>  <input type="radio" name="objective" value="1">pocas veces
                <input type="radio" name="objective" value="3">regularmente
                <input type="radio" name="objective" value="6.66">siempre
            </td>
        </tr>

        <tr>
            <td>toma decision</td>
            <td> <input type="radio" name="decision_making" value="1">bajo
                <input type="radio" name="decision_making" value="3">medio
                <input type="radio" name="decision_making" value="6.66">alto
            </td>
        </tr>


        <tr>
            <td>Trabaja en equipo</td>
            <td> <input type="radio" name="teamwork" value="1">pocas veces
                <input type="radio" name="teamwork" value="3">regularmente
                <input type="radio" name="teamwork" value="6.66">siempre
            </td>
        </tr>


    </table>
    <input type="hidden" value="createEvaluationAdministracion1" name="action"/>
    <input type="submit" />
</form>
