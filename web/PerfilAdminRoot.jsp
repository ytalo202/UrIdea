
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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Empleado <b class="caret"></b></a>
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
                <li class="active">
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
                <li>
                    <a href="v?action=seleccionEmpleados"><i class="fa fa-fw fa-desktop"></i> Lista de Empleados</a>
                </li>
                <li>
                    <a href="v?action=editCorre"><i class="fa fa-fw fa-wrench"></i> Editar Email</a>
                </li>


            </ul>
        </div>
        <!-- /.navbar-collapse -->


    </nav>




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
                                <div class="col-xs-12 col-sm-8" >
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

                        <table class="table table-striped table-responsive ">
                            <thead>

                            </thead>
                            <tbody>
                            <tr>
                                <h2>Estudios</h2>
                                <c:forEach var="cv" items="${service.findCvByIdEmployeeTypo(employee.id,2)}">

                                    <p>
                                        <c:out value="${cv.description} -> "/>
                                        <c:out value="${cv.date_cv} -> "/>
                                    <c:forEach var="cv" items="${service.findCvFecha(cv.id)}">

                                            <a href="v?action=EditarCvAdmin&idCv=<c:out value="${cv.id}"/>&year=<c:out value="${cv.year}"/>&month=<c:out value="${cv.month}"/>&day=<c:out value="${cv.day}"/>">
                                                Si desea Editar El Cv:
                                            </a>

                                    </c:forEach>


                                    </p>
                                </c:forEach>

                                <h2>Experienzas</h2>
                                <c:forEach var="cv" items="${service.findCvByIdEmployeeTypo(employee.id,1)}">
                                    <p>
                                        <c:out value="${cv.description} -> "/>
                                        <c:out value="${cv.date_cv} -> "/>
                                        <c:forEach var="cv" items="${service.findCvFecha(cv.id)}">

                                            <a href="v?action=EditarCvAdmin&idCv=<c:out value="${cv.id}"/>&year=<c:out value="${cv.year}"/>&month=<c:out value="${cv.month}"/>&day=<c:out value="${cv.day}"/>">
                                                Si desea Editar El Cv:
                                            </a>

                                        </c:forEach>


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








<br>





</div>



</div>

</div>


</div>
<!-- /#wrapper -->

<!-- jQuery -->

<!-- Morris Charts JavaScript -->

<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/bootstrap.min.js"></script>

<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/raphael.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin/js/plugins/morris/morris-data.js"></script>

</body>

</html>
