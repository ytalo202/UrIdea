


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

    <title>Nuevo Empleado</title>






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
                    <li>
                        <a href="#"><i class="fa fa-fw fa-gear"></i>Configuración</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-power-off"></i>Cerrar Sesión</a>
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
                <li class="active">
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



            <!-- Page Heading -->

            <div class="my-content" >
                <div class="container" >

                    <div class="row">
                        <div class="col-sm-12" >
                            <h1 align="center"><img src="http://www.minsarsta.gob.pe/Aplicativos%20Informaticos/SES%20LAB.png"  width="80px" height="80px"></h1>
                            <div class="mydescription">

                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                            <div class="myform-bottom">
                                <form class="form-horizontal " action="v" method="post" role="form" >
                                    <input type="hidden" name="idCompany" value="${company.id}" />

                                    <div class="form-group">
                                        <label class="col-lg-2">Nombre</label>
                                        <div class="col-lg-10"><input type="text" name="employee_name"  pattern="[A-Za-z]+"   placeholder="Nombre" class="form-control" required/>
                                        </div></div>

                                    <div class="form-group">
                                        <label class="col-lg-2">Dni</label>
                                        <div class="col-lg-10"><input type="number"  min="10000000" max="99999999" name="dni"  placeholder="Dni" class="form-control" required/>
                                        </div></div>

                                    <div class="form-group">
                                        <label class="col-lg-2">Area</label>
                                        <div class="col-lg-10">

                                            <select name="idArea">
                                                <option value="1">Informatica</option>
                                                <option value="2">Marketing</option>
                                                <option value="3">Produccion</option>
                                                <option value="4">Administracion</option>
                                                <option value="5">Practicantes</option>
                                            </select>


                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2">Fecha</label>
                                        <div class="col-lg-10"><input type="date" min="1937-01-01" max="1999-01-01" name="cumple"   required/>
                                        </div></div>


                                    <div class="form-group">
                                        <label class="col-lg-2">Contraseña</label>
                                        <div class="col-lg-10"><input type="password" name="password"  placeholder="contraseña" class="form-control" required/>
                                        </div></div>

                                    <input type="hidden" value="createEmplAdmin" name="action" />
                                    <p align="center"><button input type="submit" class="btn btn-primary">Crear</button></p>
                                </form>


                            </div>
                        </div>
                    </div>
                </div>



                <!-- /.row -->



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