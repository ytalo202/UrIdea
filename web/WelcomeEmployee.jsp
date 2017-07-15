
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>


<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Welcome Employee</title>
    <!-- CSS de Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"> <!--Iconos-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500" >
    <link rel="stylesheet" href="css/custom.css">

</head>

<body>

<div class="my-content" >
    <div class="container" >
        <div class="row">
            <div class="col-sm-12" >
                <h1> Empleado <c:out value="${employee.name}"/></h1>
                <div class="mydescription">
                    <p> </p>
                </div>
            </div>
        </div>



        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                <div class="myform-top">
                    <div class="myform-top-left">
                        <h3 >Empleado</h3>

                    </div>
                    <div class="myform-top-right">
                        <i class="fa fa-user"></i>
                    </div>
                </div>
                <div class="myform-bottom">


                    <form action="validateEmployee" method="post">

                        <input type="hidden" name="idCompany" value="${employee.id}"/>
                        <p>Welcome to Eva Web Aplication  ...</p>

                        <input type="hidden" value="servis" name="action"/>
                        <button input type="submit" class="mybtn">Next</button>
                    </form>



                </div>
            </div>
        </div>
    </div>
</div>
</div>

<!-- Enlazamos el js de Bootstrap, y otros plugins que usemos siempre al final antes de cerrar el body -->
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>