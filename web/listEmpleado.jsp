


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

    <title>Listado</title>


    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"> <!--Iconos-->
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500" rel="stylesheet">



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

<body style="background-image:url(http://img.freepik.com/free-vector/modern-medical-background_1035-8989.jpg?size=338&ext=jpg)" class="home">

<div id="wrapper" >

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
            <a class="navbar-brand" href="index.html"><img src="image/logo.jpg" width="70" height="30"></a>
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
                        <a href="#"><i class="fa fa-fw fa-envelope"></i>Mensaje</a>
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

<h1 align="center">Lista Empleados</h1>




<div align="center">
<form   action="v" method="post" >
    <select name="idArea"  onchange="this.form.submit()">
        <option value="0">Elija una Opcion</option>
        <option value="1">Informatica</option>
        <option value="2">Marketing</option>
        <option value="3">Produccion</option>
        <option value="4">Administracion</option>
        <option value="5">Practicantes</option>
        <option value="6">Todas las Areas</option>
    </select>
    <input type="hidden" value="listTypeArea" name="action">

</form>
</div>
            <section class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"></h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered">
                                        <tr>

                                            <th>Nombre</th>

                                            <th>Tipo de Empleado</th>
                                            <th>Dni</th>
                                            <th>Correo Electrónico</th>
                                            <th>Área</th>
                                            <th>Promover a Admin</th>
                                            <th>Perfil</th>
                                            <th>Cambiar de Area</th>
                                        </tr>
<c:forEach var="employee" items="${service.findAdmin(2,company.id)}">
<tr>
    <td><c:out value="${employee.name}"/></td>

    <td> <c:out value="${employee.employeeType}"/></td>
    <td>  <c:out value="${employee.dni}"/></td>
    <td><c:out value="${employee.emailAddress.emailData}"/></td>
    <td><c:out value="${employee.area.nameArea}"/></td>


       <td><a href="v?action=editTypeAdmin&idEmployee=<c:out value="${employee.id}"/>">
           <img src="https://userscontent2.emaze.com/images/26a5e505-30d9-4e65-aafe-1e6943cb2c0b/9dfd4e2547adb3530209ae02a0623a44.png" width="20px" height="20px" alt="Cambiar a Administrador" class="img-responsive">
       </a></td>

      <td> <a href="v?action=Perfil&idEmployee=<c:out value="${employee.id}"/>">
          <img src="https://userscontent2.emaze.com/images/26a5e505-30d9-4e65-aafe-1e6943cb2c0b/9dfd4e2547adb3530209ae02a0623a44.png" width="20px" height="20px" alt="Cambiar a Administrador" class="img-responsive">
      </a></td>
    <td align="center">
        <a href="v?action=editChangeArea&idEmployee=
<c:out value="${employee.id}" />" >
            <img src="https://userscontent2.emaze.com/images/26a5e505-30d9-4e65-aafe-1e6943cb2c0b/9dfd4e2547adb3530209ae02a0623a44.png" width="20px" height="20px" alt="Cambiar a Empleado" class="img-responsive">
        </a>
    </td>

</c:forEach>
</tr>


                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <p align="center"><a href="v?action=regresar">

            Regresar</a></p>















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

