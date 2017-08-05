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

    <style>
        th{
            height: 24px;
            line-height: 24px;
            color: #e2e2e2;
            background-color: #ac2925;
            text-align: center;
            vertical-align: middle;
        }


    </style>






</head>
<body style="background-image:url(https://previews.123rf.com/images/vska/vska1302/vska130200057/17854770-gran-luz-tecnolog-a-futurista-ordenador-negocio-bandera-Foto-de-archivo.jpg)" class="fa-home">


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



    <!-- Compañia Datos -->

    <jsp:useBean id="service" class="dbUrIdea.services.HRService"/>




    <c:forEach var="company" items="${service.ListCompanyById(company.id)}">

<br>
    <br>

    <br>


            <h1 align="center">Compañia <c:out value="${company.nameCompany}"/></h1>
<p align="center"><a href="#1" data-toggle="collapse">
    <img src="http://e.rpp-noticias.io/normal/2016/09/26/111411_252455.png"
         class="img-circle person" alt="Random Name" width="255" height="255"> </a></p>
<div id="1" class="collapse">
    <div align="center">
    <div class="col-xs-12 col-sm-12">
        <ul class="list-group">
            <li class="list-group-item" >Correo: <c:out value="${company.emailAdress.emailData}"/></li>
            <li class="list-group-item">Direccion: <c:out value="${company.address}"/></li>
    <li class="list-group-item" >Numero Telefonico: <c:out value="${company.phoneNumber}"/></li>
    <li class="list-group-item">Descripxion: <c:out value="${company.description}"/></li>

        </ul>
    </div>
    </c:forEach>
    </div>
</div>


    <h1 align="center">Empleados Administradores</h1>
    <p align="center"><a href="#2" data-toggle="collapse">
        <img src="http://carmenpareja.com/wp-content/uploads/2015/09/junta_socios-300x200.jpg"
             class="img-circle person" alt="Random Name" width="255" height="255"> </a></p>
    <div id="2" class="collapse">
    <section class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title" align="center">Descripción</h3>
                    </div>
                    <div class="panel-body">
<div class="table-responsive">
    <table class="table table-bordered">

        <tr>

            <th>Nombre Completo</th>
            <th>Apellido Paterno</th>
            <th>Apellido Materno</th>
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
                <td><c:out value="${employee.name} "/></td>
                <td>     <c:out value="${employee.firstLastName} "/></td>
                 <td>   <c:out value="${employee.secondLastName}"/></td>
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
</div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    </div>





    <h1 align="center">Empleados Ordinarios</h1>
    <p align="center"><a href="#3" data-toggle="collapse">
        <img src="https://www.actuall.com/wp-content/uploads/2016/04/empleado-discapacitado-trabaja-en-la-factoria-de-Ford-de-Almussafes-Valencia-EFE.jpg"
                                                               class="img-circle person" alt="Random Name" width="255" height="255"> </a></p>
    <div id="3" class="collapse">
    <section class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title" align="center">Descripción</h3>
                    </div>
                    <div class="panel-body">
                        <div class="table-responsive">
    <table class="table table-bordered">

        <tr>

            <th>Nombre Completo</th>
            <th>Apellido Paterno</th>
            <th>Apelido Materno</th>
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
                <td><c:out value="${employee.name} "/></td>
                <td>    <c:out value="${employee.firstLastName} "/></td>
                <td>    <c:out value="${employee.secondLastName}"/></td>
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
                </div>
            </div>
        </div>
    </div>
    </section>
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