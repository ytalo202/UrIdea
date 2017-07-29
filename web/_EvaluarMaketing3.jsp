
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion de Crecimiento Profesional  Marketing</h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">

        <tr>
            <td>Tiene estudios de otros idiomas</td>
            <td> <input type="radio" name="language_skills" value="1">bajo
                <input type="radio" name="language_skills" value="3">medio
                <input type="radio" name="language_skills" value="8.35">alta
            </td>
        </tr>

        <tr>
            <td>sabe de negocios</td>
            <td> <input type="radio" name="business_skills" value="1">bajo
                <input type="radio" name="business_skills" value="3">medio
                <input type="radio" name="business_skills" value="8.35">alto
            </td>
        </tr>

        <tr>
            <td>Cumplio con todas sus tareas</td>
            <td> <input type="radio" name="business_knowledge" value="1">bajo
                <input type="radio" name="business_knowledge" value="3">medio
                <input type="radio" name="business_knowledge" value="8.35">alto
            </td>
        </tr>
        <tr>
            <td>actualiza sus conocimientos de mercado</td>
            <td> <input type="radio" name="market_knowledge" value="1">bajo
                <input type="radio" name="market_knowledge" value="3">medio
                <input type="radio" name="market_knowledge" value="8.35">alto
            </td>
        </tr>
        <tr>
            <td>fue productivo</td>
            <td> <input type="radio" name="productivity" value="1">bajo
                <input type="radio" name="productivity" value="3">medio
                <input type="radio" name="productivity" value="8.35">alto
            </td>
        </tr>
        <tr>
            <td>mejoro sus habilidades de comunicacion</td>
            <td> <input type="radio" name="communication_skills" value="1">bajo
                <input type="radio" name="communication_skills" value="3">medio
                <input type="radio" name="communication_skills" value="8.35">alto
            </td>
        </tr>

        <tr>
            <td>Innovo ?</td>
            <td> <input type="radio" name="innovative" value="1">bajo
                <input type="radio" name="innovative" value="5">medio
                <input type="radio" name="innovative" value="8.35">alto
            </td>
        </tr>





    </table>

    <p>Comentario
        <textarea name="comment"
                  cols="30" rows="10"></textarea>
    </p>
    <input type="hidden" value="createEvaluationMarketing3" name="action"/>
    <input type="submit"/>
</form>