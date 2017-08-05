
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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Root <b class="caret"></b></a>
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
                    <a href="v?action=edit">
                        Editar Datos
                    </a>
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
