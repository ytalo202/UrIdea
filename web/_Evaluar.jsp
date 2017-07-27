
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion de Actitud </h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">
    <tr>
    <td>Muestra compromiso a la Empresa</td>
    <td> <input type="radio" name="commitment" value="3">bajo
        <input type="radio" name="commitment" value="5">medio
        <input type="radio" name="commitment" value="10">alto
    </td>
</tr>

    <tr>
    <td>Toma de Decision en su Ambito de trabajo</td>
    <td>  <input type="radio" name="decision_making" value="3">pocas veces
        <input type="radio" name="decision_making" value="5">regularmente
        <input type="radio" name="decision_making" value="10">siempre
    </td>
</tr>

    <tr>
        <td>Trabajo en Equipo de manera Adecuada</td>
        <td> <input type="radio" name="team_management" value="3">bajo
            <input type="radio" name="team_management" value="5">medio
            <input type="radio" name="team_management" value="10">alto
        </td>
    </tr>


    <tr>
        <td>Tiende a Opinar para dar la solucion a algun Problema Ocurrido</td>
        <td> <input type="radio" name="strategic_thinking" value="3">pocas veces
            <input type="radio" name="strategic_thinking" value="5">regularmente
            <input type="radio" name="strategic_thinking" value="10">siempre
        </td>
    </tr>


    <tr>
        <td>Maneja de manera presisa su tiempo cumpliendo todas sus responsabilidades</td>
        <td> <input type="radio" name="time_management" value="3">pocas veces
            <input type="radio" name="time_management" value="5">regularmente
            <input type="radio" name="time_management" value="10">siempre
        </td>
    </tr>

    </table>
    <input type="hidden" value="createEvaluation1" name="action"/>
    <input type="submit" />
</form>