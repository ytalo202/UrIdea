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




    <c:forEach var="company" items="${service.ListCompanyById(company.id)}">

<br>
    <br>

    <br>

    <h1>Compañia <c:out value="${company.nameCompany}"/></h1>

    <p>Correo: <c:out value="${company.emailAdress.emailData}"/></p>
    <p>Direccion: <c:out value="${company.address}"/></p>
    <p>Numero Telefonico: <c:out value="${company.phoneNumber}"/></p>
    <p>Descripxion: <c:out value="${company.description}"/></p>



    </c:forEach>



    <h2>Empleados Administradores</h2>

    <table>

        <tr>

            <th>Nombre Completo</th>
            <th>Dni</th>
            <th>Correo Electrónico</th>
            <th>Área</th>
            <th>Cumpleaños</th>
            <th>Telefono</th>
            <th>Celular</th>
            <th>Residencia</th>
            <th>Ciudad</th>
            <th>Perfil</th>

        </tr>

        <c:forEach var="employee" items="${service.findAdmin(1,company.id)}">
            <tr>
                <td><c:out value="${employee.name} "/><c:out value="${employee.firstLastName} "/>
                    <c:out value="${employee.secondLastName}"/></td>
                <td> <c:out value="${employee.dni}"/></td>
                <td> <c:out value="${employee.emailAddress.emailData}"/></td>
                <td><c:out value="${employee.area.nameArea}"/></td>
                <td><c:out value="${employee.birthdate}"/></td>
                <td><c:out value="${employee.phoneNumber}"/></td>
                <td><c:out value="${employee.cellPhoneNumber}"/></td>
                <td><c:out value="${employee.address}"/></td>
                <td><c:out value="${employee.department}"/></td>
                <td><a href="search?action=PerfilAdm&codEmp=<c:out value="${employee.id}"/>">
                    Ver Perfil
                </a></td>



            </tr>
        </c:forEach>

    </table>







    <h2>Empleados Ordinarios</h2>
    <table>

        <tr>

            <th>Nombre Completo</th>
            <th>Dni</th>
            <th>Correo Electrónico</th>
            <th>Área</th>
            <th>Cumpleaños</th>
            <th>Telefono</th>
            <th>Celular</th>
            <th>Residencia</th>
            <th>Ciudad</th>
            <th>Perfil</th>

        </tr>

        <c:forEach var="employee" items="${service.findAdmin(2,company.id)}">
            <tr>
                <td><c:out value="${employee.name} "/><c:out value="${employee.firstLastName} "/>
                    <c:out value="${employee.secondLastName}"/></td>
                <td> <c:out value="${employee.dni}"/></td>
                <td> <c:out value="${employee.emailAddress.emailData}"/></td>
                <td><c:out value="${employee.area.nameArea}"/></td>
                <td><c:out value="${employee.birthdate}"/></td>
                <td><c:out value="${employee.phoneNumber}"/></td>
                <td><c:out value="${employee.cellPhoneNumber}"/></td>
                <td><c:out value="${employee.address}"/></td>
                <td><c:out value="${employee.department}"/></td>
                <td><a href="search?action=perfilEmpleado&codEmp=<c:out value="${employee.id}"/>">
                    Ver Perfil
                </a></td>



            </tr>
        </c:forEach>

    </table>


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