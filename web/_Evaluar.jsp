
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion </h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">
    <tr>
    <td>commitment</td>
    <td> <input type="radio" name="commitment" value="1">bajo
        <input type="radio" name="commitment" value="2">medio
        <input type="radio" name="commitment" value="3">alto
    </td>
</tr>

    <tr>
    <td>communication</td>
    <td> <input type="radio" name="communication" value="1">bajo
        <input type="radio" name="communication" value="2">medio
        <input type="radio" name="communication" value="3">alto
    </td>
</tr>

    <tr>
        <td>ethic</td>
        <td> <input type="radio" name="ethic" value="1">bajo
            <input type="radio" name="ethic" value="2">medio
            <input type="radio" name="ethic" value="3">alto
        </td>
    </tr>

    <tr>
        <td>team_management</td>
        <td> <input type="radio" name="team_management" value="2">bajo
            <input type="radio" name="team_management" value="5">medio
            <input type="radio" name="team_management" value="10">alto
        </td>
    </tr>
    <tr>
        <td>decision_making</td>
        <td> <input type="radio" name="decision_making" value="2">bajo
            <input type="radio" name="decision_making" value="5">medio
            <input type="radio" name="decision_making" value="10">alto
        </td>
    </tr>
    <tr>
        <td>strategic_thinking</td>
        <td> <input type="radio" name="strategic_thinking" value="2">bajo
            <input type="radio" name="strategic_thinking" value="5">medio
            <input type="radio" name="strategic_thinking" value="10">alto
        </td>
    </tr>
    <tr>
        <td>customer_orientation</td>
        <td> <input type="radio" name="customer_orientation" value="2">bajo
            <input type="radio" name="customer_orientation" value="5">medio
            <input type="radio" name="customer_orientation" value="10">alto
        </td>
    </tr>
    <tr>
        <td>social_responsability</td>
        <td> <input type="radio" name="social_responsability" value="2">bajo
            <input type="radio" name="social_responsability" value="5">medio
            <input type="radio" name="social_responsability" value="10">alto
        </td>
    </tr>
    <tr>
        <td>time_management</td>
        <td> <input type="radio" name="time_management" value="2">bajo
            <input type="radio" name="time_management" value="5">medio
            <input type="radio" name="time_management" value="10">alto
        </td>
    </tr>
    <tr>
        <td>use_of_resources</td>
        <td> <input type="radio" name="use_of_resources" value="2">bajo
            <input type="radio" name="use_of_resources" value="5">medio
            <input type="radio" name="use_of_resources" value="10">alto
        </td>
    </tr>
    <tr>
        <td>cost_orientation</td>
        <td> <input type="radio" name="cost_orientation" value="2">bajo
            <input type="radio" name="cost_orientation" value="5">medio
            <input type="radio" name="cost_orientation" value="10">alto
        </td>
    </tr>
    <tr>
        <td>knowledge_of_languages</td>
        <td> <input type="radio" name="knowledge_of_languages" value="2">bajo
            <input type="radio" name="knowledge_of_languages" value="5">medio
            <input type="radio" name="knowledge_of_languages" value="10">alto
        </td>
    </tr>

    <tr>
        <td>digital_skills</td>
        <td> <input type="radio" name="digital_skills" value="1">bajo
            <input type="radio" name="digital_skills" value="3">medio
            <input type="radio" name="digital_skills" value="5">alto
        </td>
    </tr>





    </table>
    <input type="hidden" value="createEvaluation" name="action"/>
    <input type="submit"/>
</form>