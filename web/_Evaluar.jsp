
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion Para Practicantes </h1>
<h2>Evaluacion de Actitud </h2>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">
    <tr>
    <td>Mostro su compromiso a la Empresa en Mcuhas Ocaciones</td>
    <td> <input type="radio" name="commitment_company" value="3">bajo
        <input type="radio" name="commitment_company" value="5">medio
        <input type="radio" name="commitment_company" value="8.325">alto
    </td>
</tr>

    <tr>
    <td>Tomo Decisiones para resolver distintos Problemas Ocurridos</td>
    <td>  <input type="radio" name="decision_making" value="3">pocas veces
        <input type="radio" name="decision_making" value="5">regularmente
        <input type="radio" name="decision_making" value="8.325">siempre
    </td>
</tr>

    <tr>
        <td>Trabajo en Equipo de manera Adecuada Sin Demasiados percances</td>
        <td> <input type="radio" name="teamwork" value="3">bajo
            <input type="radio" name="teamwork" value="5">medio
            <input type="radio" name="teamwork" value="8.325">alto
        </td>
    </tr>


    <tr>
        <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
        <td> <input type="radio" name="proactive" value="3">pocas veces
            <input type="radio" name="proactive" value="5">regularmente
            <input type="radio" name="proactive" value="8.325">siempre
        </td>
    </tr>


    </table>
    <input type="hidden" value="createEvaluation1" name="action"/>
    <input type="submit" />
</form>