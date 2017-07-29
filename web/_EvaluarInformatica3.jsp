
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion de Crecimiento Profesional  Informatica</h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">

        <tr>
            <td>Tiene Conocimientos de Otros idiomas</td>
            <td> <input type="radio" name="language_skills" value="1">bajo
                <input type="radio" name="language_skills" value="2">medio
                <input type="radio" name="language_skills" value="4.77">alta
            </td>
        </tr>

        <tr>
            <td>Tiene buen manejo de la computacion</td>
            <td> <input type="radio" name="computer_skills" value="1">bajo
                <input type="radio" name="computer_skills" value="2">medio
                <input type="radio" name="computer_skills" value="4.77">alto
            </td>
        </tr>

        <tr>
            <td>Actualiza sus conocimientos con algun curso</td>
            <td> <input type="radio" name="market_knowledge" value="1">bajo
                <input type="radio" name="market_knowledge" value="2">medio
                <input type="radio" name="market_knowledge" value="4.77">alto
            </td>
        </tr>
        <tr>
            <td>Fue productivo</td>
            <td> <input type="radio" name="productivity" value="1">bajo
                <input type="radio" name="productivity" value="2">medio
                <input type="radio" name="productivity" value="4.77">alto
            </td>
        </tr>

        <tr>
            <td>Es Eficiente</td>
            <td> <input type="radio" name="efficiency" value="1">bajo
                <input type="radio" name="efficiency" value="2">medio
                <input type="radio" name="efficiency" value="4.77">alto
            </td>
        </tr>

        <tr>
            <td>Da Solucion a Problemas</td>
            <td> <input type="radio" name="give_successful_solutions" value="1">bajo
                <input type="radio" name="give_successful_solutions" value="2">medio
                <input type="radio" name="give_successful_solutions" value="4.77">alto
            </td>
        </tr>


        <tr>
            <td>Innovo ?</td>
            <td> <input type="radio" name="innovative" value="1">bajo
                <input type="radio" name="innovative" value="2">medio
                <input type="radio" name="innovative" value="4.78">alto
            </td>
        </tr>





    </table>

    <p>Comentario
        <textarea name="comment"
                  cols="30" rows="10"></textarea>
    </p>
    <input type="hidden" value="createEvaluationIformatica3" name="action"/>
    <input type="submit"/>
</form>