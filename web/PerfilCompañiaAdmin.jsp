<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
<jsp:include page="bootstrap.jsp"/>
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
            color: #e2e2e2;
            background-color: #ac2925;
            text-align: center;
            vertical-align: middle;
        }


    </style>



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





    <c:forEach var="company" items="${service.ListCompanyById(company.id)}">


        <h1>Compañia <c:out value="${company.nameCompany}"/></h1>

        <p>Correo: <c:out value="${company.emailAdress.emailData}"/></p>
        <p>Direccion: <c:out value="${company.address}"/></p>
        <p>Numero Telefonico: <c:out value="${company.phoneNumber}"/></p>
        <p>Descripxion: <c:out value="${company.description}"/></p>

        <a href="v?action=edit">
            Editar Datos
        </a>

    </c:forEach>



    <h2>Empleados Administradores</h2>

    <table>

        <tr>

            <th>Nombre Completo</th>
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
                <td><c:out value="${employee.name} "/><c:out value="${employee.firstLastName} "/>
                    <c:out value="${employee.secondLastName}"/></td>
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







    <h2>Empleados Ordinarios</h2>
    <table>

        <tr>

            <th>Nombre Completo</th>
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
            <td><c:out value="${employee.name} "/><c:out value="${employee.firstLastName} "/>
                <c:out value="${employee.secondLastName}"/></td>
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