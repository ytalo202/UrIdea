
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion Para El Area Administracion</h1>
<h2>Evaluacion de Crecimiento Profecional </h2>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">
        <tr>
            <td>Mostro su compromiso a la Empresa en Mcuhas Ocaciones</td>
            <td> <input type="radio" name="communication_skills" value="3">bajo
                <input type="radio" name="communication_skills" value="5">medio
                <input type="radio" name="communication_skills" value="8.325">alto
            </td>
        </tr>

        <tr>
            <td>Tomo Decisiones para resolver distintos Problemas Ocurridos</td>
            <td>  <input type="radio" name="language_skills" value="3">pocas veces
                <input type="radio" name="language_skills" value="5">regularmente
                <input type="radio" name="language_skills" value="8.325">siempre
            </td>
        </tr>

        <tr>
            <td>Trabajo en Equipo de manera Adecuada Sin Demasiados percances</td>
            <td> <input type="radio" name="business_skills" value="3">bajo
                <input type="radio" name="business_skills" value="5">medio
                <input type="radio" name="business_skills" value="8.325">alto
            </td>
        </tr>


        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="business_knowledge" value="3">pocas veces
                <input type="radio" name="business_knowledge" value="5">regularmente
                <input type="radio" name="business_knowledge" value="8.325">siempre
            </td>
        </tr>

        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="resource_optimization" value="3">pocas veces
                <input type="radio" name="resource_optimization" value="5">regularmente
                <input type="radio" name="resource_optimization" value="8.325">siempre
            </td>
        </tr>
        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="efficiency" value="3">pocas veces
                <input type="radio" name="efficiency" value="5">regularmente
                <input type="radio" name="efficiency" value="8.325">siempre
            </td>
        </tr>
        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="productivity" value="3">pocas veces
                <input type="radio" name="productivity" value="5">regularmente
                <input type="radio" name="productivity" value="8.325">siempre
            </td>
        </tr>
        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="innovative" value="3">pocas veces
                <input type="radio" name="innovative" value="5">regularmente
                <input type="radio" name="innovative" value="8.325">siempre
            </td>
        </tr>



    </table>

    <p>Comentario
        <textarea name="comment"
                  cols="30" rows="10"></textarea>
    </p>
    <input type="hidden" value="createEvaluationAdministracion3" name="action"/>
    <input type="submit" />
</form>