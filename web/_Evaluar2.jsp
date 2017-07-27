
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<h1>Evaluacion de Valores </h1>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">



        <tr>
            <td>Responde por sus actos ante algun error</td>
            <td> <input type="radio" name="ethic" value="1">bajo
                <input type="radio" name="ethic" value="3">medio
                <input type="radio" name="ethic" value="5">alto
            </td>
        </tr>



        <tr>
            <td>Muestra sinceridad consigo mismo ante la verdad</td>
            <td> <input type="radio" name="customer_orientation" value="1">bajo
                <input type="radio" name="customer_orientation" value="3">medio
                <input type="radio" name="customer_orientation" value="5">alto
            </td>
        </tr>
        <tr>
            <td>Comparte el logro con su equipo de trabajo</td>
            <td> <input type="radio" name="social_responsability" value="1">bajo
                <input type="radio" name="social_responsability" value="3">medio
                <input type="radio" name="social_responsability" value="5">alto
            </td>
        </tr>

        <tr>
            <td>Usa de manera responsable los recursos de empresa</td>
            <td> <input type="radio" name="use_of_resources" value="1">bajo
                <input type="radio" name="use_of_resources" value="3">medio
                <input type="radio" name="use_of_resources" value="5">alto
            </td>
        </tr>
        <tr>
            <td>Muestra Transparencia y Confianza al encargarle alguna compra</td>
            <td> <input type="radio" name="cost_orientation" value="1">bajo
                <input type="radio" name="cost_orientation" value="3">medio
                <input type="radio" name="cost_orientation" value="5">alto
            </td>
        </tr>







    </table>
    <input type="hidden" value="createEvaluation2" name="action"/>
    <input type="submit"/>
</form>