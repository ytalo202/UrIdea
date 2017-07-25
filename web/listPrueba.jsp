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

    <c:forEach var="evaluation" items="${service.findEvaluationAgv(15)}">




       <p>
           <c:out value=" ${evaluation.grade} ---> "/>
        <c:out value=" ${evaluation.communication} ---> "/>
        <c:out value=" ${evaluation.cost_orientation} ---> "/>
        <c:out value=" ${evaluation.customer_orientation} ---> "/>
        <c:out value=" ${evaluation.decision_making} ---> "/>
        <c:out value=" ${evaluation.digital_skills} ---> "/>
        <c:out value=" ${evaluation.strategic_thinking} ---> "/>
        <c:out value=" ${evaluation.knowledge_of_languages} ---> "/>
           <c:out value=" ${evaluation.team_management} ---> "/>
       </p>

    </c:forEach>


</b:jumbotron>

</body>
</html>
