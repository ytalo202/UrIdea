


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

<body style="background-image:url(https://previews.123rf.com/images/vska/vska1302/vska130200153/18156383-abstract-circuit-cyber-high-technology-business-background-Stock-Vector.jpg)" class="fa-home">

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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Administrador <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="TypeEmployeeValidation?action=PerfilAdmin"><i class="fa fa-fw fa-user"></i> Perfil</a>
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
                    <a href="TypeEmployeeValidation?action=regresar"><i class="fa fa-fw fa-dashboard"></i> Menú</a>
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








        <div class="row">
            <div class="col-sm-12" >
                <h1 align="center">Actualizar Datos de Empleado</h1>

            </div>
        </div>

        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                <div class="myform-top">


                </div>
                <div class="myform-bottom">

                    <form action="TypeEmployeeValidation" method="post" class="form-horizontal">







                        <div class="form-group">
                        <label class="col-lg-2">Contraseña</label>
                            <div class="col-lg-10">
                                <input type="text" name="password"
                                       value="${employee.password}"
                                       class="form-control"/>
                            </div></div>

                        <div class="form-group">
                         <label class="col-lg-2">Nombre</label>
                            <div class="col-lg-10">
                                <input type="text" name="employee_name" required pattern="[A-Za-z]+" value="${employee.name}"
                                       class="form-control"/></div></div>
                        <div class="form-group">
                          <label class="col-lg-2">Apellido Paterno</label>
                            <div class="col-lg-10"><input type="text" name="employee_first_last_name" pattern="[A-Za-z]+" required
                                                          value="${employee.firstLastName}" class="form-control"/>
                            </div></div>
                        <div class="form-group">
                            <label class="col-lg-2">Apellido Materno</label>
                            <div class="col-lg-10">
                                <input type="text" name="employee_second_last_name" pattern="[A-Za-z]+" required
                                       value="${employee.secondLastName}"
                                       class="form-control"/>
                            </div></div>
                        <div class="form-group">
                            <label class="col-lg-2">Dni</label>
                            <div class="col-lg-10"><input type="number" required min="10000000" max="99999999" name="dni" value="${employee.dni}" class="form-control" class="form-control"/>
                            </div></div>
                        <div class="form-group"><label class="col-lg-2">Teléfono</label>
                           <div class="col-lg-10"><input type="number" required name="phone_number" min="1000000" max="999999999" value="${employee.phoneNumber}" class="form-control"/>
                           </div></div>
                        <div class="form-group">
                        <label class="col-lg-2">Telefono Celular</label>
                            <div class="col-lg-10"><input type="number" required name="cell_phone_number" min="900000000" max="999999999" value="${employee.cellPhoneNumber}" class="form-control"/>
                            </div></div>
                        <div class="form-group">
                          <label class="col-lg-2">Dirección</label>
                         <div class="col-lg-10"><input type="text" required name="address" value="${employee.address}" class="form-control"/>
                        </div></div>
                        <div class="form-group">
                         <label class="col-lg-2">Departamento</label>
                            <div class="col-lg-10"><input type="text" required name="department" pattern="[A-Za-z]+" value="${employee.department}" class="form-control"/>
                            </div></div>

                        <div class="form-group">
                         <label class="col-lg-2">Fecha de Nacimiento</label>
                            <div class="col-lg-10">
                                <input type="date" name="birthdate" required min="1937-01-01" max="1999-01-01" value="${employee.birthdate}" class="form-control"/>
                            </div></div>



                        <input type="hidden" value="updateEmpleadoData" name="action"/>
                        <p align="center"><button input type="submit" class="btn btn-primary">Actualizar</button></p>







                    </form>
                </div>
            </div>
        </div>
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