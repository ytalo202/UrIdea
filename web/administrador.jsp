<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 14/07/2017
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Formulario Login</title>

    <!-- CSS de Bootstrap -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"> <!--Iconos-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500" >
    <link rel="stylesheet" href="css/custom.css">

<style>
    .w3-bar .w3-button {
    padding: 16px;
    }
    .container {
        padding: 80px 120px;
    }
</style>

</head>

<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<div class="navbar navbar-default navbar-fixed-top">


    <div class="w3-top">
        <div align="center" class="w3-bar w3-white w3-card-2" id="myNavbar">
            <a href="#home" class="w3-bar-item w3-button w3-wide">
                <img src="image/logo.jpg"  width="80" height="30"></a>
            <!-- Right-sided navbar links -->
            <div class="w3-right w3-hide-small">




                <a href="login.jsp" class="w3-bar-item w3-button"><i class="fa fa-user"></i> Administrador</a>
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
    <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button
    w3-large w3-padding-16">Close ×</a>


    <a href="" onclick="w3_close()" class="w3-bar-item w3-button"><i class="fa fa-user"></i> Administrador</a>
</nav>

<div class="my-content" >
    <div class="container" >
        <div class="row">
            <div class="col-sm-12" >
                <h1> Company Pepito</h1>
                <div class="mydescription">
                    <p> </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                <div class="myform-top">
                    <div class="myform-top-left">
                        <h3 >Administratot</h3>

                    </div>
                    <div class="myform-top-right">
                        <i class="fa fa-user"></i>
                    </div>
                </div>
                <div class="myform-bottom">
                    <form role="form" >
                        <h1>Menú</h1>
                        <form><button type="button" class="btn btn-primary btn-lg btn-block">Seleccione Una Opción</button></form>


                      <form>  <button type="button" class="btn btn-default btn-lg btn-block"><a href="_CompaniesForm.jsp">Editar Cuenta</a></button>
                      <form>  <button type="button" class="btn btn-default btn-lg btn-block"><a href="_NEmployee.jsp">Agregar Empleado</a></button>
                          <form>  <button type="button" class="btn btn-default btn-lg btn-block"><a href="">Lista de Empleados</a></button></form>

                          <form>   <button type="button" class="btn btn-default btn-lg btn-block"><a href="">Evaluar Empleados</a></button></form>

                          <form>     <button type="button" class="btn btn-default btn-lg btn-block"><a href="index.jsp">Cerrar Cuenta</a></button></form>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<!-- Enlazamos el js de Bootstrap, y otros plugins que usemos siempre al final antes de cerrar el body -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<script>

    //////////////////////////77777777


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
