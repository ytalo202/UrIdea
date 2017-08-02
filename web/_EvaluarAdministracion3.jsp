
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<html lang="es">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body style="background-image:url(http://img.freepik.com/free-vector/modern-medical-background_1035-8989.jpg?size=338&ext=jpg)" class="fa-home">

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><img src="image/logo.jpg" width="40" height="30"></a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Administrador <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="v?action=perfilCompany"><i class="fa fa-fw fa-user"></i> Perfil</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-envelope"></i> Mensaje</a>
                    </li>

                    <li class="divider"></li>
                    <li>
                        <a href="index.jsp"><i class="fa fa-fw fa-power-off"></i>Cerrar Sesión</a>
                    </li>
                </ul>
            </li>
        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li class="active">
                    <a href="v?action=regresar"><i class="fa fa-fw fa-dashboard"></i> Menú</a>
                </li>
                <li>
                    <a href="TypeEmployeeValidation?action=editEmployee"><i class="fa fa-fw fa-bar-chart-o"></i> Editar Cuenta</a>
                </li>
                <li>
                    <a href="newEmpEmail2.jsp"><i class="fa fa-fw fa-table"></i> Agregar Empleado</a>
                </li>
                <li>
                    <a href="TypeEmployeeValidation?action=lista"><i class="fa fa-fw fa-edit"></i> Listar Empleados</a>
                </li>

                <li>
                    <a href="TypeEmployeeValidation?action=editCorre"><i class="fa fa-fw fa-wrench"></i> Editar Email</a>
                </li>


            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">













        <h1>Evaluacion Para El Area Administracion</h1>
<h2>Evaluacion de Crecimiento Profecional </h2>

<form action="TypeEmployeeValidation" method="post">

    <table border="1">
        <tr>
            <td>Mostro su compromiso a la Empresa en Mcuhas Ocaciones</td>
            <td> <input type="radio" name="communication_skills" value="1">bajo
                <input type="radio" name="communication_skills" value="2">medio
                <input type="radio" name="communication_skills" value="4.175">alto
            </td>
        </tr>

        <tr>
            <td>Tomo Decisiones para resolver distintos Problemas Ocurridos</td>
            <td>  <input type="radio" name="language_skills" value="1">pocas veces
                <input type="radio" name="language_skills" value="2">regularmente
                <input type="radio" name="language_skills" value="4.175">siempre
            </td>
        </tr>

        <tr>
            <td>Trabajo en Equipo de manera Adecuada Sin Demasiados percances</td>
            <td> <input type="radio" name="business_skills" value="1">bajo
                <input type="radio" name="business_skills" value="2">medio
                <input type="radio" name="business_skills" value="4.175">alto
            </td>
        </tr>


        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="business_knowledge" value="1">pocas veces
                <input type="radio" name="business_knowledge" value="2">regularmente
                <input type="radio" name="business_knowledge" value="4.175">siempre
            </td>
        </tr>

        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="resource_optimization" value="1">pocas veces
                <input type="radio" name="resource_optimization" value="2">regularmente
                <input type="radio" name="resource_optimization" value="4.175">siempre
            </td>
        </tr>
        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="efficiency" value="1">pocas veces
                <input type="radio" name="efficiency" value="2">regularmente
                <input type="radio" name="efficiency" value="4.175">siempre
            </td>
        </tr>
        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="productivity" value="1">pocas veces
                <input type="radio" name="productivity" value="2">regularmente
                <input type="radio" name="productivity" value="4.175">siempre
            </td>
        </tr>
        <tr>
            <td>Tomo la Iniciativa Para Empezar el Trabajo</td>
            <td> <input type="radio" name="innovative" value="1">pocas veces
                <input type="radio" name="innovative" value="2">regularmente
                <input type="radio" name="innovative" value="4.175">siempre
            </td>
        </tr>



    </table>

    <p>Comentario
        <textarea name="comment"
                  cols="30" rows="10"></textarea>
    </p>
    <input type="hidden" value="createEvaluationAdministracion3" name="action"/>
    <input type="submit" />
</form>




        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/bootstrap.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/raphael.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris-data.js"></script>

</body>

</html>