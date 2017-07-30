
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion de Valores  Marketing</h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">



        <tr>
            <td></td>
            <td> <input type="radio" name="punctuality" value="1">bajo
                <input type="radio" name="punctuality" value="3">medio
                <input type="radio" name="punctuality" value="6.66">alto
            </td>
        </tr>



        <tr>
            <td></td>
            <td> <input type="radio" name="honesty" value="1">bajo
                <input type="radio" name="honesty" value="3">medio
                <input type="radio" name="honesty" value="6.66">alto
            </td>
        </tr>
        <tr>
            <td>Comparte el logro con su equipo de trabajo</td>
            <td> <input type="radio" name="organized" value="1">bajo
                <input type="radio" name="organized" value="3">medio
                <input type="radio" name="organized" value="6.66">alto
            </td>
        </tr>

        <tr>
            <td>Usa de manera responsable los recursos de empresa</td>
            <td> <input type="radio" name="responsibility" value="1">bajo
                <input type="radio" name="responsibility" value="3">medio
                <input type="radio" name="responsibility" value="6.66">alto
            </td>
        </tr>
        <tr>
            <td>Muestra Transparencia y Confianza al encargarle alguna compra</td>
            <td> <input type="radio" name="respect" value="1">bajo
                <input type="radio" name="respect" value="3">medio
                <input type="radio" name="respect" value="6.66">alto
            </td>
        </tr>







    </table>
    <input type="hidden" value="createEvaluationMarketing2" name="action"/>
    <input type="submit"/>
</form>