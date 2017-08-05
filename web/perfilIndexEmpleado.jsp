<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<%--
  Created by IntelliJ IDEA.
  User: Yoshinon
  Date: 5/07/2017
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>

<html lang="en">
<head>
    <!-- Theme Made By www.w3schools.com - No Copyright -->
    <title>Perfil</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


    <script src="js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Monserrat">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">





</head>
<body style="background-image:url(https://st.depositphotos.com/1181438/2916/v/950/depositphotos_29165175-stock-illustration-high-tech-background-for-a.jpg)" class="fa-home">


<div class="navbar navbar-default navbar-fixed-top">


    <div class="w3-top">
        <div align="center" class="w3-bar w3-white w3-card-2" id="myNavbar">



            <a href="#dem" data-toggle="collapse" class="w3-bar-item w3-button w3-wide">
                <img src="image/logo.jpg"  width="80" height="30">
            </a>


            <div id="dem" class="collapse">
                <form action="search" method="post" class="w3-bar-item w3-button w3-wide"
                      style="height:38px" style="width:80px">
                    <input type="text" name="compañiaCode" size="10" style="height:30px">
                    <input type="hidden"  value="BuscarCodCompañi" name="action">
                    <input type="submit" value="Buscar" size="5"  style="height:30px">
                </form>
            </div>



            <!-- Right-sided navbar links -->
            <div class="w3-right w3-hide-small">


                <a href="index.jsp" class="w3-bar-item w3-button">
                    <i class="fa fa-home" aria-hidden="true" ></i> Inicio</a>
                <a href="CompEmail.jsp" class="w3-bar-item w3-button"> Registrarse</a>
                <a href="login.jsp" class="w3-bar-item w3-button"><i class="fa fa-user"></i>Ingresar</a>
            </div>
            <!-- Hide right-floated links on small screens and replace them with a menu icon -->

            <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
                <i class="fa fa-bars"></i>
            </a>

        </div>
    </div>
</div>

</nav>




<!-- Sidebar on small screens when clicking the menu icon -->
<nav class="w3-sidebar w3-bar-block w3-black w3-card-2 w3-animate-left
  w3-hide-medium w3-hide-large" style="display:none" id="mySidebar">
    <p> </p>
    <p> </p>
    <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button
    w3-large w3-padding-16">Close ×</a>
    <a href="index.jsp" onclick="w3_close()" class="w3-bar-item w3-button">Inicio</a>
    <a href="register.jsp" onclick="w3_close()" class="w3-bar-item w3-button">Registrese</a>
    <a href="login.jsp" onclick="w3_close()" class="w3-bar-item w3-button">Ingresar</a>
</nav>





<!-- Sidebar on small screens when clicking the menu icon -->

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Compañia Datos -->


    <c:forEach var="employee" items="${service.findAllEmployeeById(employee.id)}">
    <h1>Perfil</h1>


    <h1 align="center">Nombre : <c:out value="${employee.name} "/></h1>
    <p align="center"><a href="#1" data-toggle="collapse">
        <img src="http://www.eset-la.com/images/empleado-seguro-gr.jpg"
             class="img-circle person" alt="Random Name" width="255" height="255"> </a></p>
    <div id="1" class="collapse">
        <div align="center">
            <div class="col-xs-12 col-sm-12">
                <ul class="list-group">



                    <li class="list-group-item" >Nombre :   <c:out value="${employee.name} "/></li>
                    <li class="list-group-item" >Apelido Paterno : <c:out value="${employee.firstLastName} "/></li>
                    <li class="list-group-item" >Apelido Materno : <c:out value="${employee.secondLastName}"/></li>


                    <li class="list-group-item">Compañia<c:out value="${employee.company.nameCompany}"/></li>


                    <li class="list-group-item"> Correo : <c:out value="${employee.emailAddress.emailData} "/></li>


                    <li class="list-group-item" >Departamento : <c:out value="${employee.department}"/></li>

                    <li class="list-group-item">Dni : <c:out value="${employee.dni} "/></li>


                    <li class="list-group-item">Dirección de Domicilio : <c:out value="${employee.address} "/></li>

                    <li class="list-group-item">Fecha de Nacimiento :  <c:out value="${employee.birthdate} "/></li>


                    <li class="list-group-item">Teléfono : <c:out value="${employee.phoneNumber}"/></li>

           <li class="list-group-item" >Celular : <c:out value="${employee.cellPhoneNumber}"/></li>


           <li class="list-group-item"> Area : <c:out value="${employee.area.nameArea}"/></li>

                </ul>
            </div>
            </c:forEach>
        </div>
    </div>





    <c:forEach var="evaluation" items="${service.findEvaluationAgv((employee.id))}">
        <h1 align="center">Evaluacion</h1>
    <p align="center"><a href="#2" data-toggle="collapse">
        <img src="http://assets0.somoscafeina.com/system/articles/images/000/000/014/original/10_Criterios_para_evaluar_la_usabilidad_de_tus_paginas_web.jpg"
             class="img-circle person" alt="Random Name" width="255" height="255"> </a></p>
    <div id="2" class="collapse">
        <div align="center">
            <div class="col-xs-12 col-sm-12">

        <div class="progress">
            <div class="progress-bar progress-bar-success"
                 style="width: <c:out value="${evaluation.grade}"/>%">
                <span class="sr-only">35% Complete (success)</span>
                <c:out value="${evaluation.grade}"/>%
            </div>
            <div class="progress-bar progress-bar-striped active" style="width: <c:out value=" ${evaluation.grade1}"/>%">
                <span class="sr-only">20% Complete (warning)</span>
                <c:out value="${evaluation.grade1}"/>%
            </div>
            <div class="progress-bar progress-bar-danger" style="width: <c:out value=" ${evaluation.grade2}"/>%">
                <span class="sr-only">10% Complete (danger)</span>
                <c:out value="${evaluation.grade2}"/>%
            </div>
        </div>
                <h1>Promedio General</h1>
                <c:out value="${evaluation.avg_grade}"/>

            </div>
        </div>
    </div>




    </c:forEach>


    <h1 align="center">Cv</h1>

    <p align="center"><a href="#3" data-toggle="collapse">
        <img src="http://lhh.pe/site/wp-content/uploads/2016/04/cv-digital-648x425.png"
             class="img-circle person" alt="Random Name" width="255" height="255"> </a></p>
    <div id="3" class="collapse">
        <div align="center">
            <div class="col-xs-12 col-sm-8">

                <c:forEach var="cv" items="${service.findAllCvsByIdEmployee((employee.id))}">
        <p>
            <c:out value="${cv.description}"/>

        </p>
                </c:forEach>

            </div>
        </div>
    </div>





</div>


<script>




    var mySidebar = document.getElementById("mySidebar");

    function w3_open() {
        if (mySidebar.style.display === 'block') {
            mySidebar.style.display = 'none';
        } else {
            mySidebar.style.display = 'block';
        }
    }

    // Close the sidebar with the close button
    function w3_close() {
        mySidebar.style.display = "none";
    }

</script>


</body>
</html>