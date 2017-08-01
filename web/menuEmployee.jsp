<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 14/07/2017
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Employee</title>

    <!-- CSS de Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"> <!--Iconos-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500" >
    <link rel="stylesheet" href="css/custom.css">

</head>

<body>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<div class="my-content" >
    <div class="container" >
        <div class="row">
            <div class="col-sm-12" >
                <h1> Empleado Pepito</h1>
                <div class="mydescription">
                    <p> </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                <div class="myform-top">
                    <div class="myform-top-left">
                        <h3 >Employee</h3>

                    </div>
                    <div class="myform-top-right">
                        <i class="fa fa-user"></i>
                    </div>
                </div>
                <div class="myform-bottom">
                    <form role="form" >
                        <h1>Menú</h1>
                        <button type="button" class="btn btn-primary btn-lg btn-block">Seleccione Una Opción</button>

                        <button type="button" class="btn btn-default btn-lg btn-block">
                            <a href="TypeEmployeeValidation?action=editEmployee">

                                Editar Cuenta</a></button>

                        <button type="button" class="btn btn-default btn-lg btn-block">
                            <a href="TypeEmployeeValidation?action=editCorre">

                                Editar Email</a></button>

                        <button type="button" class="btn btn-default btn-lg btn-block">
                            <a href="TypeEmployeeValidation?action=PerfilEmpleado">

                                Perfil Cuenta</a></button>





                        <button type="button" class="btn btn-default btn-lg btn-block">
                            <a href="index.jsp">Cerrar Cuenta</a></button>





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
