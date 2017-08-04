
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

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

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
                    <a href="TypeEmployeeValidation?action=regresar"><i class="fa fa-fw fa-dashboard"></i> Menú</a>
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

<h1>Evaluacion</h1>


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
            <p>promedio: <c:out value="${evaluation.avg_grade}"/></p>
            <p>Fecha: <c:out value=" ${evaluation.date}"/></p>
        </div>


    </c:forEach>

</div>


</body>
</html>



<p align="center">Nombre : <c:out value="${employee.name} "/></p>
<p align="center">Apellido Paterno : <c:out value="${employee.firstLastName} "/></p>
<p align="center">Apellido Materno : <c:out value="${employee.secondLastName}"/></p>
<br>

<p align="center">Trabaja Para : <c:out value="${employee.company.nameCompany}"/></p>
<br>

<p align="center">Su Correo :<c:out value="${employee.emailAddress.emailData} "/></p>
<br>
<p align="center">Residencia <c:out value="${employee.department}"/></p>

<br>

<p align="center">Dni : <c:out value="${employee.dni} -> "/></p>
<br>

<p align="center">Direccion de Domicilio<c:out value="${employee.address} -> "/></p>
<br>

<p align="center">Cumpleaños : <c:out value="${employee.birthdate} -> "/></p>
<br>

<p align="center">Telefono : <c:out value="${employee.phoneNumber}"/></p>
<br>

<p align="center">Celular : <c:out value="${employee.cellPhoneNumber}"/></p>
<br>

<p>Area : <c:out value="${employee.area.nameArea}"/></p>




</c:forEach>

<h1>Evaluacion</h1>
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


    <h1>Promedio General</h1>
    <c:out value="${evaluation.avg_grade}"/>

    <a href="v?action=EvaluationHistorial&idEmployee=
<c:out value="${evaluation.idUserEmployee.id}"/>&idArea=<c:out value="${evaluation.idUserEmployee.area.id}"/>">
        Ver Historial de Evaluaciones
    </a>

</c:forEach>



<h1>Cv</h1>
<c:forEach var="cv" items="${service.findAllCvsByIdEmployee((employee.id))}">

    <p>
        <c:out value="${cv.description}"/>

    </p>
</c:forEach>


------------------


<h1>Perfil</h1>
<c:forEach var="employee" items="${service.findAllEmployeeById(employee.id)}">

    <p>Nombre </p>
    <c:out value="${employee.name} "/>
    <c:out value="${employee.firstLastName} "/>
    <c:out value="${employee.secondLastName}"/>
    <br>
    <p>Trabaja Para </p>
    <c:out value="${employee.company.nameCompany} -> "/>
    <br>
    <p>Su Correo </p>
    <c:out value="${employee.emailAddress.emailData} -> "/>
    <br>
    <p>Recidencia </p>
    <c:out value="${employee.department}"/>
    <br>
    <p>Dni </p>
    <c:out value="${employee.dni} -> "/>
    <br>
    <p>Direccion de Domicilio </p>
    <c:out value="${employee.address} -> "/>
    <br>
    <p>Cumpleaños </p>
    <c:out value="${employee.birthdate} -> "/>
    <br>
    <p>Telefono
        <c:out value="${employee.phoneNumber}"/></p>
    <br>
    <p>Celular
        <c:out value="${employee.cellPhoneNumber}"/></p>
    <br>
    <p>Area
        <c:out value="${employee.area.nameArea}"/></p>




</c:forEach>

<h1>Evaluacion</h1>
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


    <h1>Promedio General</h1>
    <c:out value="${evaluation.avg_grade}"/>

    <a href="TypeEmployeeValidation?action=EvaluationHistorial&idEmployee=
<c:out value="${evaluation.idUserEmployee.id}"/>&idArea=<c:out value="${evaluation.idUserEmployee.area.id}"/>">
        Ver Historial de Evaluaciones
    </a>

</c:forEach>



<h1>Cv</h1>
<c:forEach var="cv" items="${service.findAllCvsByIdEmployee((employee.id))}">

    <p>
        <c:out value="${cv.description}"/>

    </p>
</c:forEach>