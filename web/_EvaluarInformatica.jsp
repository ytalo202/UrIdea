
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion Para El Area de Informatica</h1>
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
            <td>Trata de sobresalir en su grupo</td>
            <td>  <input type="radio" name="competitive" value="3">pocas veces
                <input type="radio" name="competitive" value="5">regularmente
                <input type="radio" name="competitive" value="8.325">siempre
            </td>
        </tr>

        <tr>
            <td>Trabajo bien bajo presion</td>
            <td> <input type="radio" name="work_under_pressure" value="3">bajo
                <input type="radio" name="work_under_pressure" value="5">medio
                <input type="radio" name="work_under_pressure" value="8.325">alto
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
    <input type="hidden" value="createEvaluationIformatica1" name="action"/>
    <input type="submit" />
</form>