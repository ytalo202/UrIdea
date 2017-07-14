<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 13/07/2017
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>



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
                <h1>Rellene sus Datos y elija el Tipo Pago</h1>
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
                        <p>Nombre y Dirección en Particular</p>
                    </div>
                </div>
                <div class="myform-bottom">


                    <form role="form" action="paym" method="post" >


                        <div class="form-group">
                            <input type="text" name="country" placeholder="Country..." class="form-control"  required>

                        </div>

                        <div class="form-group">
                            <input type="text" name="location" placeholder="Location-City..." class="form-control" >
                        </div>

                        <div class="row">
                            <div class="col-md-6">

                                <input type="text" name="name" placeholder="Nombres..." class="form-control">
                            </div>

                        <div class="col-md-6">


                                <input type="text" name="last_name" placeholder="Apelidos..." class="form-control" >
                            </div>
                    </div>
                        <br>

                        <div class="form-group">
                            <input type="text" name="id_companies" placeholder="Codigo de Compañia..." class="form-control" >

                        </div>
                        <div class="form-group">
                            <input type="text" name="id_payment_type" placeholder="Codigo de tipo de Pago..." class="form-control" >

                        </div>
                        <div class="form-group">
                            <input type="text" name="payment_date" placeholder="Fecha de Pago..." class="form-control" >

                        </div>
                        <div class="form-group">
                            <input type="text" name="payment_amount" placeholder="Monto de Pago..." class="form-control">

                        </div>



                        <div class="form-group">
                            <input type="text" name="first_address" placeholder="primera direccion..." class="form-control" >

                        </div>
                        <div class="form-group">
                            <input type="text" name="second_address" placeholder="segunda direccion..." class="form-control">

                        </div>

                        <div class="form-group">
                            <input type="text" name="code_zip" placeholder="Direccion postal..." class="form-control" >
                        </div>

                        <div>
                            <input type="text" name="cell_phone_number" placeholder="Telefono..." class="form-control" >
                        </div>
                        <p align="left">Metodo de pago</p>
                        <p>Tarjeta de debito o de credito</p>

                        <div class="form" align="center">
                            <table form="table">
                            <td><input type="text" name="card_number" placeholder="Numero de tarjeta..." class="form-control" >
                            </td><td align="center"><img src="image/visas.jpg" width="120" height="45">  </td>
</table>
                        </div>

                        <p>Fecha de vencimiento</p>

                        <div class="row">

                            <div class="col-sm-6">

                                    <input type="text" name="expiry_day" placeholder="Mes ..." class="form-control" >
                                </div>

                            <div class=" col-sm-6">


                                    <input type="text" name="expiry_month" placeholder="Año..." class="form-control" >
                                </div>
                        </div>
                        <p>Codigo de Seguridad</p>
                        <div class="form" align="center">
                            <table form="table">
                                <td><input type="text" name="security_code" placeholder="CVC..." class="form-control" >
                                </td><td align="center"><img src="image/question.png" width="30" height="30" >  </td>
                            </table>
                        </div>
                        <br>
                        <input type="hidden" value="create" name="action"/>
                        <input type="submit" >

                    </form>
                </form>
            </div>
        </div>
    </div>
</div>
</div>

<script src="js/bootstrap.min.js"></script>
</body>

</html>