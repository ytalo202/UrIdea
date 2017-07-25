<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 30/06/2017
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<html>
<head>
    <jsp:include page="bootstrap.jsp"/>
    <title>Welcome</title>
</head>
<body>
<b:jumbotron>
    <h1 align="center">Tuesta Nuñez,Ytalo Salvador</h1>

    <br>
    <div class="btn-group btn-group-justified" role="group" aria-label="...">
        <div class="btn-group" role="group">
            <a href="index.jsp"> <button  type="button" class="btn btn-default">Index</button></a>

        </div>
        <div class="btn-group" role="group">
            <a href="aboutMe.jsp"> <button  type="button" class="btn btn-default">About Me</button></a>

        </div>
        <div class="btn-group" role="group">
            <a href="hobbies.jsp">  <button type="button" class="btn btn-default">hobbies</button></a>
        </div>
        <div class="btn-group" role="group">
            <a href="contactMe.jsp">  <button type="button" class="btn btn-default">Contact Me</button></a>
        </div>
    </div>
    <br>
    <div align="center">
        <h2 align="center" ><FONT SIZE=20>Hobbies</font > </h2>
    </div>


    <div ><FONT SIZE=15><p>Animes</p></font ></div>
    <div class="progress">

        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="70" aria-valuemin="70" aria-valuemax="100" style=" width: 70%">
            <span class="sr-only">40% Complete (success)</span>
        </div>
    </div>

    <div  ><FONT SIZE=15><p>Light Novels</p></font ></div>
    <div class="progress">
        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
            <span class="sr-only">20% Complete</span>
        </div>
    </div>
    <div ><FONT SIZE=15><p>Friends</p></font ></div>
    <div class="progress">
        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
            <span class="sr-only">60% Complete (warning)</span>
        </div>
    </div>

    <div ><FONT SIZE=15><p>food</p></font ></div>
    <div class="progress">
        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
            <span class="sr-only">80% Complete (danger)</span>
        </div>
    </div>
</b:jumbotron>
</body>
</html>