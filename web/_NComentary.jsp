


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="com" method="post">
    <p>id_Comentario string<input type="text" name="id" /></p>
    <p>id_evaluacion string<input type="text" name="id_evaluation"/></p>
    <p>tipo int <input type="text" name="commentaryType" /></p>
    <p>detalle <input type="text" name="detail" /></p>


    <input type="hidden" value="create" name="action"/>
    <input type="submit"/>
</form>