
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion de Crecimiento Profesional Practicantes</h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">

        <tr>
            <td>Se Desempeño de Manera Adecuando</td>
            <td> <input type="radio" name="performance" value="1">bajo
                <input type="radio" name="performance" value="3">medio
                <input type="radio" name="performance" value="8.35">alta
            </td>
        </tr>

        <tr>
            <td>Trabajo de Manera Eficiente</td>
            <td> <input type="radio" name="efficiency" value="1">bajo
                <input type="radio" name="efficiency" value="3">medio
                <input type="radio" name="efficiency" value="8.35">alto
            </td>
        </tr>

        <tr>
        <td>Cumplio con todas sus tareas</td>
        <td> <input type="radio" name="productivity" value="1">bajo
            <input type="radio" name="productivity" value="3">medio
            <input type="radio" name="productivity" value="8.35">alto
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
    <input type="hidden" value="createEvaluation3" name="action"/>
    <input type="submit"/>
</form>
