
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

    <title>Perfil</title>

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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Empleado <b class="caret"></b></a>
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
                    <a href="TypeEmployeeValidation?action=editCorre"><i class="fa fa-fw fa-table"></i> Editar Email</a>
                </li>


                <li>
                    <a  href="TypeEmployeeValidation?action=PerfilEmpleado"><i class="fa fa-fw fa-wrench"></i> Perfil y Evaluaciones</a>
                </li>


            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>

    <br>

    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
    <div class="container">
        <div class="row">
            <h1 align="center">Perfil del Empleado</h1>
            <div class="col-sm-11">

                <!-- resumt -->
                <div class="panel panel-default">
                    <div class="panel-heading resume-heading">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="col-xs-12 col-sm-4">
                                    <figure>
                                        <img class="img-circle img-responsive" alt="" src="http://2.bp.blogspot.com/-NcUqzr5Eyyc/ToNMmTHrY2I/AAAAAAAAA4E/WVw3bWlLi_o/s1600/terno_cc_2.jpg">
                                    </figure>
                                    <div class="row">
                                        <div class="col-xs-12 social-btns">
                                            <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                                                <a href="#" class="btn btn-social btn-block btn-google">
                                                    <i class="fa fa-google"></i> </a>
                                            </div>
                                            <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                                                <a href="#" class="btn btn-social btn-block btn-facebook">
                                                    <i class="fa fa-facebook"></i> </a>
                                            </div>
                                            <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                                                <a href="#" class="btn btn-social btn-block btn-twitter">
                                                    <i class="fa fa-twitter"></i> </a>
                                            </div>
                                            <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                                                <a href="#" class="btn btn-social btn-block btn-linkedin">
                                                    <i class="fa fa-linkedin"></i> </a>
                                            </div>
                                            <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                                                <a href="#" class="btn btn-social btn-block btn-github">
                                                    <i class="fa fa-github"></i> </a>
                                            </div>
                                            <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                                                <a href="#" class="btn btn-social btn-block btn-stackoverflow">
                                                    <i class="fa fa-stack-overflow"></i> </a>
                                            </div>
                                        </div>


                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-8">
                                    <ul class="list-group">
                                        <c:forEach var="employee" items="${service.findAllEmployeeById(employee.id)}">

                                            <li class="list-group-item">Nombre :  <c:out value="${employee.name}"/></li>
                                            <li class="list-group-item">Apellido Paterno :  <c:out value="${employee.firstLastName} "/></li>
                                            <li class="list-group-item">Apellido Materno :   <c:out value="${employee.secondLastName}"/></li>
                                            <li class="list-group-item">Empresa : <c:out value="${employee.company.nameCompany}"/></li>
                                            <li class="list-group-item">Residencia <c:out value="${employee.department}"/></li>
                                            <li class="list-group-item">Dni : <c:out value="${employee.dni} "/></li>
                                            <li class="list-group-item">Direccion : <c:out value="${employee.address} "/></li>
                                            <li class="list-group-item">Cumpleaños : <c:out value="${employee.birthdate} "/></li>
                                            <li class="list-group-item">Area : <c:out value="${employee.area.nameArea}"/></li>
                                            <li class="list-group-item"><i class="fa fa-envelope"></i> <c:out value="${employee.emailAddress.emailData} "/></li>
                                            <li class="list-group-item"><i class="fa fa-phone"></i> <c:out value="${employee.phoneNumber}"/></li>
                                            <li class="list-group-item"><i class="fa fa-mobile-phone"></i> <c:out value="${employee.cellPhoneNumber}"/></li>


                                        </c:forEach>




                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="bs-callout bs-callout-danger">

                        <h4>Evaluación</h4>
                        <ul class="list-group">

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


                                <div >


                                </div>
                                <h1>Promedio General</h1>
                                <c:out value="${evaluation.avg_grade}"/>



                                <a href="TypeEmployeeValidation?action=EvaluationHistorial&idEmployee=
<c:out value="${evaluation.idUserEmployee.id}"/>&idArea=<c:out value="${evaluation.idUserEmployee.area.id}"/>">
                                    Ver Historial de Evaluaciones
                                </a>

                            </c:forEach>

                        </ul>
                    </div>
                    <div class="bs-callout bs-callout-danger">

                        <table class="table table-striped table-responsive ">
                            <thead>

                            </thead>
                            <tbody>
                            <tr>
                                <h2>Estudios</h2>
                                <c:forEach var="cv" items="${service.findCvByIdEmployeeTypo(employee.id,2)}">

                                    <p>
                                        <c:out value="${cv.description} -> "/>
                                        <c:out value="${cv.date_cv}"/>


                                    </p>
                                </c:forEach>

                                <h2>Experienzas</h2>
                                <c:forEach var="cv" items="${service.findCvByIdEmployeeTypo(employee.id,1)}">
                                    <p>
                                        <c:out value="${cv.description} -> "/>
                                        <c:out value="${cv.date_cv}"/>



                                    </p>
                                </c:forEach>
                            </tr>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <!-- resume -->

        </div>
    </div>
</div>



























</div>
<!-- /#wrapper -->

<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/bootstrap.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/raphael.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris-data.js"></script>



<!-- jQuery -->


</body>

</html>
