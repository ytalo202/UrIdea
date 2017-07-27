
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion de Crecimiento Profesional </h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">

        <tr>
            <td>Habilidades de Comunicacion</td>
            <td> <input type="radio" name="communication" value="1">bajo
                <input type="radio" name="communication" value="3">medio
                <input type="radio" name="communication" value="5">alta
            </td>
        </tr>

        <tr>
            <td>Conocimiento de Idiomas</td>
            <td> <input type="radio" name="knowledge_of_languages" value="1">bajo
                <input type="radio" name="knowledge_of_languages" value="3">medio
                <input type="radio" name="knowledge_of_languages" value="5">alto
            </td>
        </tr>

        <tr>
        <td>Manejo de Computacion</td>
        <td> <input type="radio" name="digital_skills" value="1">bajo
            <input type="radio" name="digital_skills" value="3">medio
            <input type="radio" name="digital_skills" value="5">alto
        </td>
    </tr>

        <tr>
            <td>Lleva Cursos para aumentar y actualizar sus conocimientos</td>
            <td> <input type="radio" name="professional_improvement" value="3">bajo
                <input type="radio" name="professional_improvement" value="5">medio
                <input type="radio" name="professional_improvement" value="10">alto
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
