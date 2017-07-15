<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 11/07/2017
  Time: 18:06
  To change this template use File | Settings | File Templates.

--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>

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
                <h1>Formulario Login</h1>
                <div class="mydescription">
                    <p> </p>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                <div class="myform-top">
                    <div class="myform-top-left">
                        <h3>Ingresa a nuestro sitio.</h3>
                        <p>Digita tu correo eletrónico y contraseña:</p>
                    </div>
                    <div class="myform-top-right">
                        <i class="fa fa-key"></i>
                    </div>
                </div>
                <div class="myform-bottom">

                    <%--

     Estoooo
   --%>
                    <form role="form" action="validateEmployee" method="post" class="">
                        <div class="form-group">
                            <input type="text" name="txtemail"
                                   placeholder="Correo Eletrónico..."
                                   class="form-control" id="form-username">
                        </div>
                        <div class="form-group">

                            <input type="password" name="txtpassword" placeholder="Contraseña..."
                                   class="form-control" id="form-password">


                        </div>
                        <input type="hidden" value="menu" name="action"/>
                        <button input type="submit" class="mybtn">Entrar</button>
                    </form>


                </div>
            </div>
        </div>



    </div>
</div>


<script src="js/bootstrap.min.js"></script>
</body>

</html>
