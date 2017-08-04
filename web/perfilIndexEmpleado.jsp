<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Evap</title>
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




    <style>



        .carousel-inner img {


            width: 100%; /* Set width to 100% */
            margin: auto;
        }


        h3, h4 {
            margin: 10px 0 30px 0;
            letter-spacing: 10px;
            font-size: 20px;
            color: #111;
        }
        .person {

            margin-bottom: 25px;
            width: 50%;
            height: 30%;

        }


        @import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700,300);
        @import url(https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css);
        ul,li{
            padding:0;
            margin:0;
        }
        li{
            list-style-type:none;
        }



        footer { background-color:#0c1a1e; min-height:350px; font-family: 'Open Sans', sans-serif; }
        .footer-col { margin-top:50px; }
        .logofooter { margin-bottom:10px; font-size:25px; color:#fff; font-weight:700;}

        .footer-col p { color:#fff; font-size:12px; font-family: 'Open Sans', sans-serif; margin-bottom:15px;}
        .footer-col p i { width:20px; color:#999;}

        .footer-ul { list-style-type:none;  padding-left:0; margin-left:2px;}
        .footer-ul li { line-height:29px; font-size:12px;}
        .footer-ul li a { color:#a0a3a4; transition: color 0.2s linear 0s, background 0.2s linear 0s; }
        .footer-ul i { margin-right:10px;}
        .footer-ul li a:hover {transition: color 0.2s linear 0s, background 0.2s linear 0s; color:#ff670f; }

        .copyright { min-height:40px; background-color:#000000;}
        .copyright p { text-align:left; color:#FFF; padding:10px 0; margin-bottom:0;}
        .heading7 { font-size:21px; font-weight:700; color:#d9d6d6; margin-bottom:22px;}
        .post p { font-size:12px; color:#FFF; line-height:20px;}
        .post p span { display:block; color:#8f8f8f;}
        .bottom_ul { list-style-type:none; float:right; margin-bottom:0;}
        .bottom_ul li { float:left; line-height:40px;}
        .bottom_ul li:after { content:"/"; color:#FFF; margin-right:8px; margin-left:8px;}
        .bottom_ul li a { color:#FFF;  font-size:12px;}
        .social-icon {
            width: 30px;
            height: 30px;
            font-size: 15px;
            background-color: blue;
            color: #fff;
            text-align: center;
            margin-right: 10px;
            padding-top: 7px;
            border-radius: 50%;
        }
        .footer-social li{
            float:left;
        }
        .linked-in{
            background-color:#007bb6;
        }
        .facebook{
            background-color:#3b5998;
        }
        .twitter{
            background-color:#1da1f2;
        }
        .google{
            background-color:#f63e28;
        }
        .form-control {
            border-radius: 0;
        }

    </style>
</head>
<body>


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


                <a href="pagos.jsp" class="w3-bar-item w3-button">
                    <i class="fa fa-home" aria-hidden="true" ></i> Inicio</a>
                <a href="Listado.jsp" class="w3-bar-item w3-button">Nosotros</a>

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
    <a href="#team" onclick="w3_close()" class="w3-bar-item w3-button">Nosotros</a>

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

    <jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

    <h1>Perfil</h1>
    <c:forEach var="employee" items="${service.findAllEmployeeById(employee.id)}">

        <p>Nombre </p>
        <c:out value="${employee.name} "/>
        <c:out value="${employee.firstLastName} "/>
        <c:out value="${employee.secondLastName}"/>
        <br>
        <p>Trabaja Para </p>
        <c:out value="${employee.company.nameCompany} -> "/>
        <br>
        <p>Su Correo </p>
        <c:out value="${employee.emailAddress.emailData} -> "/>
        <br>
        <p>Recidencia </p>
        <c:out value="${employee.department}"/>
        <br>
        <p>Dni </p>
        <c:out value="${employee.dni} -> "/>
        <br>
        <p>Direccion de Domicilio </p>
        <c:out value="${employee.address} -> "/>
        <br>
        <p>Cumpleaños </p>
        <c:out value="${employee.birthdate} -> "/>
        <br>
        <p>Telefono
            <c:out value="${employee.phoneNumber}"/></p>
        <br>
        <p>Celular
            <c:out value="${employee.cellPhoneNumber}"/></p>
        <br>
        <p>Area
            <c:out value="${employee.area.nameArea}"/></p>




    </c:forEach>

    <h1>Evaluacion</h1>
    <c:forEach var="evaluation" items="${service.findEvaluationAgv((employee.id))}">
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


    </c:forEach>



    <h1>Cv</h1>
    <c:forEach var="cv" items="${service.findAllCvsByIdEmployee((employee.id))}">

        <p>
            <c:out value="${cv.description}"/>

        </p>
    </c:forEach>







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