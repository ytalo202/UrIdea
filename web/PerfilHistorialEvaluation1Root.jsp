
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

    <title>Historial de Evaluación</title>

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

    <style>
        th{
            height: 24px;
            line-height: 24px;
            color: #d5d5d5;
            background-color:#000000;
            text-align: center;
            vertical-align: middle;
        }
    </style>

</head>

<body style="background-image:url(https://previews.123rf.com/images/vska/vska1302/vska130200057/17854770-gran-luz-tecnolog-a-futurista-ordenador-negocio-bandera-Foto-de-archivo.jpg)" class="fa-home">

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
            <a class="navbar-brand" href="#"><img src="image/logo.jpg" width="70" height="30"></a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i>Root<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="TypeEmployeeValidation?action=PerfilEmpleado"><i class="fa fa-fw fa-user"></i> Perfil</a>
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
                <li>
                    <a href="v?action=regresar"><i class="fa fa-fw fa-dashboard"></i> Menú</a>
                </li>
                <li>
                    <a href="v?action=edit"><i class="fa fa-fw fa-bar-chart-o"></i> Editar Empresa</a>
                </li>
                <li>
                    <a href="v?action=creEmail"><i class="fa fa-fw fa-table"></i> Crear Administrador</a>
                </li>
                <li>
                    <a href="v?action=lista"><i class="fa fa-fw fa-edit"></i> Listar Administradores</a>
                </li>
                <li class="active">
                    <a href="v?action=seleccionEmpleados"><i class="fa fa-fw fa-desktop"></i> Lista de Empleados</a>
                </li>
                <li>
                    <a href="v?action=editCorre"><i class="fa fa-fw fa-wrench"></i> Editar Email</a>
                </li>


            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>
<br>
    <br>

<h1 align="center">Historial de Evaluacion de Practicante</h1>
<div class="col-sm-4">
<c:forEach var="evaluation" items="${service.findListEvaluatsById((employee.id))}">


        <a href="#<c:out value="${evaluation.id}"/>" data-toggle="collapse">
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

        </a>
        <div id="<c:out value="${evaluation.id}"/>" class="collapse">

            <section class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title" align="center">Descripción</h3>
                            </div>
                            <div class="panel-body">



                            <p>promedio: <c:out value="${evaluation.avg_grade}"/></p>
            <p>Fecha: <c:out value=" ${evaluation.date}"/></p>
                                <p>Evaluador: <c:out value=" ${evaluation.idEvaluator.name}"/></p>
                                <p> Apllido Paterno   <c:out value=" ${evaluation.idEvaluator.firstLastName}"/> </p>
             <p>Apellido Materno   <c:out value=" ${evaluation.idEvaluator.secondLastName}"/></p>
                                <div class="table-responsive">
            <table class="table table-bordered">
            <tr>
                <th >Evaluacion de Actitud</th>
                <th >Puntaje </th>
                <th >Evaluacion de Valores</th>
                <th >Puntaje </th>
                <th >Evaluacion de Crecimiento Profecional</th>
                <th >Puntaje </th>
            </tr>
            <tr>
                <td>Compromiso: </td> <td><c:out value=" ${evaluation.commitment_company}"/></td>
                <td>Puntualidad: </td> <td><c:out value=" ${evaluation.punctuality}"/></td>
                <td>Desempeño: </td><td><c:out value=" ${evaluation.performance}"/></td>
            </tr>
            <tr>
                <td>Proactividad: </td><td><c:out value=" ${evaluation.proactive}"/></td>
                <td>Honestidad: </td><td><c:out value=" ${evaluation.honesty}"/></td>
                <td>Eficiencia: </td><td><c:out value=" ${evaluation.efficiency}"/></td>
            </tr>
            <tr>
                <td>Trabajo en Equipo: </td><td><c:out value=" ${evaluation.teamwork}"/></td>
                <td>Organizacion: </td><td><c:out value=" ${evaluation.organized}"/></td>
                <td>Productividad: </td><td><c:out value=" ${evaluation.productivity}"/></td>
            </tr>
            <tr>
                <td>Toma de Decisiones: </td><td><c:out value=" ${evaluation.decision_making}"/></td>
                <td>Responsabilidad: </td><td><c:out value=" ${evaluation.responsibility}"/></td>
                <td>Innovacion: </td><td><c:out value=" ${evaluation.innovative}"/></td>
            </tr>
                <tr>
                    <td></td><td></td>
                    <td>Respeto: </td><td><c:out value=" ${evaluation.respect}"/></td>
                    <td></td><td></td>
                </tr>
        </table>
                                </div>
            <br>
            <p>Comentario: <c:out value=" ${evaluation.comment}"/></p>

        </div>

                        </div>
                    </div>
                </div>



    </section>
</div>
<br>

</c:forEach>


</div>

</div>

</div>


<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/bootstrap.min.js"></script>

<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/raphael.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris-data.js"></script>
</body>
</html>