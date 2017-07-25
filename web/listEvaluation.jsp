<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yoshinon
  Date: 5/07/2017
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<html>
<head>
    <jsp:include page="bootstrap.jsp"/>
    <title>Title</title>
</head>
<body>
<b:jumbotron>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<c:forEach var="evaluation" items="${service.evaluations}">

    <p><c:out value=" ${evaluation.company.nameCompany} ---> "/>
        <c:out value=" ${evaluation.idEmployee.name} ---> "/>
        <c:out value=" ${evaluation.idUserEmployee.name} ---> "/>
        <c:out value=" ${evaluation.date} ---> "/>
            <c:out value=" ${evaluation.knowledge_of_languages}"/>

            <c:out value=" ${evaluation.commitment}"/>
        <div ><FONT SIZE=15><p>Animes</p></font ></div>
    <div class="progress">

        <div class="progress-bar progress-bar-success" role="progressbar"
             aria-valuenow="70" aria-valuemin="70" aria-valuemax="100" style=" width:
            <c:out value=" ${evaluation.grade}"/>%">
            <span class="sr-only">40% Complete (success)</span>
        </div>
    </div>


    <c:out value=" ${evaluation.grade} ---> "/>
    <c:out value=" ${evaluation.communication} ---> "/>
    <c:out value=" ${evaluation.cost_orientation} ---> "/>
    <c:out value=" ${evaluation.customer_orientation} ---> "/>
    <c:out value=" ${evaluation.decision_making} ---> "/>
    <c:out value=" ${evaluation.digital_skills} ---> "/>
    <c:out value=" ${evaluation.strategic_thinking} ---> "/>
    <c:out value=" ${evaluation.knowledge_of_languages} ---> "/>
    <c:out value=" ${evaluation.team_management} ---> "/>



        <a href="eva?action=edit&id=<c:out value="${evaluation.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="eva?action=add">Add Evaluation</a>

</b:jumbotron>

</body>
</html>
