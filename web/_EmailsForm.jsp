
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<html lang="es">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Pago</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"> <!--Iconos-->
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500" rel="stylesheet">
    <link rel="stylesheet" href="css/custom.css">
</head>


<body>


<div class="my-content" >
    <div class="container" >

        <div class="row">
            <div class="col-sm-12" >
                <h1>Rellene sus Datos</h1>
                <div class="mydescription">
                    <p> </p>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                <div class="myform-top">
                    <div class="myform-top-left">
                        <h3></h3>
                        <p>Email de Usuario</p>
                    </div>
                    <div class="myform-top-right">
                        <i class="fa fa-money"></i>
                    </div>
                </div>
                <div class="myform-bottom">


                    <form role="form" action="v" method="post" >


                        <div class="form-group">
                            <input type="hidden" name="idEmail" value="${company.emailAdress.id}" placeholder="Country..." class="form-control"  required>

                        </div>

                        <div class="form-group">
                        <input type="text" name="emailData" value="${company.emailAdress.emailData}" placeholder="Location-City..." class="form-control" >
                    </div>

                        <div class="form-group">
                            <input type="hidden" name="idCompany" value="${company.id}" placeholder="Location-City..." class="form-control" >
                        </div>


                        <input type="hidden" value="updateEmail" name="action"/>
                        <button input type="submit" class="mybtn">Update Email</button>



                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="js/bootstrap.min.js"></script>
</body>

</html>