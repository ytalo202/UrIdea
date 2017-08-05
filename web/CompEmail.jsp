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

<html lang="es">
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

    <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">

    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>







</head>
<body style="background-image:url(http://www.freeppt.net/template/Business_presentation_powerpoint_template.jpg)" class="fa-home">


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



<br>
<br><br>
<div class="my-content" >
    <div class="container" >

        <div class="row">
            <div class="col-sm-12" >
                <h1 align="center"><img src="http://www.minsarsta.gob.pe/Aplicativos%20Informaticos/SES%20LAB.png"  width="80px" height="80px"></h1>
                <div class="mydescription">

                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                <div class="myform-bottom">


<form action="v" method="post" class="form-horizontal">
<div class="form-group"><label class="col-lg-2">Correo</label>
    <div class="col-lg-10"><input type="email" required name="emailData" placeholder="Correo..." class="form-control" /></div></div>
    <input type="hidden" value="createCompEmail" name="action"/>
    <p align="center"><button input type="submit" class="btn btn-primary">Siguiente</button></p>
</form>



                </div>
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