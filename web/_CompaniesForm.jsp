<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<html lang="es">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Menu</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
                        <a href="index.jsp"><i class="fa fa-fw fa-power-off"></i> Cerrar Sesión</a>
                    </li>
                </ul>
            </li>




        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li >
                    <a href="v?action=regresar"><i class="fa fa-fw fa-dashboard"></i> Menú</a>
                </li>
                <li class="active">
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



            <!-- Page Heading -->


            <!-- /.row -->
            <div class="my-content " >

                <div class="container" >
                    <div class="row">
                        <div class="col-sm-12" >
                            <h1 align="center"><img src="http://icon-icons.com/icons2/402/PNG/512/edit-validated_40458.png" width="80" height="80"></h1>
                            <div class="mydescription">
                                <p> </p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 myform-cont" >

                            <div class="myform-bottom">


                                <form class="form-horizontal " action="v" method="post" role="form" >

                                    <div class="form-group"><input type="hidden" name="idCompany"
                                                                   value="${company.id}" placeholder="Country..."
                                                                   class="form-control"  required>

                                    </div>

                                    <div class="form-group " ><label class="col-lg-2" >Contraseña</label>
                                        <div class="col-lg-10"> <input type="password"  name="password" required
                                                                       value="${company.password}"  class="form-control" ></div></div>


                                    <div class="form-group">
                                        <label class="col-lg-2">Nombre</label>
                                        <div class="col-lg-10">    <input type="text"  name="nameCompany" required
                                                                          value="${company.nameCompany}"
                                                                          placeholder="Location-City..." class="form-control" >
                                        </div>


                                    </div>


                                    <div class="form-group">
                                        <label class="col-lg-2" >Descripcion</label>  <div class="col-lg-10">

                                            <textarea name="description" required
                                                      cols="60" rows="10" class="form-control col-xs-12">${company.description}</textarea>



                                    </div></div>


                                    <div class="form-group">
                                        <input type="hidden"  name="companyState" value="${company.companyState}" placeholder="Location-City..." class="form-control" >
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-2">Direccion</label><div class="col-lg-10">
                                        <input type="text"  required name="address" value="${company.address}" placeholder="Location-City..." class="form-control" >
                                    </div></div>

                                    <div class="form-group">
                                        <label class="col-lg-2">Teléfono</label><div class="col-lg-10">
                                        <input type="number" min="1000000" max="999999999" required  name="phoneNumber" value="${company.phoneNumber}" placeholder="Location-City..." class="form-control" >
                                    </div></div>
                                    <div class="form-group">
                                        <input type="hidden"  name="id_email_address" value="${company.emailAdress.id}" placeholder="Location-City..." class="form-control" >
                                    </div>


                                    <input type="hidden" value="update" name="action"/>


                                    <p align="center"> <button type="submit" class="btn btn-primary">Actualizar</button></p>





                                </form>



                            </div>
                        </div>
                    </div>
                </div>

            </div>








            <!-- /.row -->



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


