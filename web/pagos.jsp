<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 13/07/2017
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <div role="form" action="" method="post" class="">


                        <div class="form-group">
                            <input type="text" name="country" placeholder="Country..." class="form-control" id="country">

                        </div>

                        <div class="form-group">
                            <input type="text" name="location" placeholder="Location-City..." class="form-control" id="location">
                        </div>

                        <div class="row">
                            <div class="col-md-6">

                                <input type="text" name="name" placeholder="Nombres..." class="form-control" id="name">
                            </div>

                        <div class="col-md-6">


                                <input type="text" name="last_name" placeholder="Apelidos..." class="form-control" id="last_name">
                            </div>
                    </div>
                        <br>

                        <div class="form-group">
                            <input type="text" name="id_companies" placeholder="Codigo de Compañia..." class="form-control" id="id_companies">

                        </div>
                        <div class="form-group">
                            <input type="text" name="id_payment_type" placeholder="Codigo de tipo de Pago..." class="form-control" id="id_payment_type">

                        </div>
                        <div class="form-group">
                            <input type="text" name="payment_date" placeholder="Fecha de Pago..." class="form-control" id="payment_day">

                        </div>
                        <div class="form-group">
                            <input type="text" name="payment_amount" placeholder="Monto de Pago..." class="form-control" id="payment_amount">

                        </div>



                        <div class="form-group">
                            <input type="text" name="first_address" placeholder="primera direccion..." class="form-control" id="first_address">

                        </div>
                        <div class="form-group">
                            <input type="text" name="second_address" placeholder="segunda direccion..." class="form-control" id="second_address">

                        </div>

                        <div class="form-group">
                            <input type="text" name="code_zip" placeholder="Direccion postal..." class="form-control" id="code_zip">
                        </div>

                        <div>
                            <input type="text" name="cell_phone_number" placeholder="Telefono..." class="form-control" id="cell_phone_number">
                        </div>
                        <p align="left">Metodo de pago</p>
                        <p>Tarjeta de debito o de credito</p>

                        <div class="form" align="center">
                            <table form="table">
                            <td><input type="text" name="card_number" placeholder="Numero de tarjeta..." class="form-control" id="card_number">
                            </td><td align="center"><img src="image/visas.jpg" width="120" height="45">  </td>
</table>
                        </div>

                        <p>Fecha de vencimiento</p>

                        <div class="row">

                            <div class="col-sm-6">

                                    <input type="text" name="expiry_day" placeholder="Mes ..." class="form-control" id="expiry_day">
                                </div>

                            <div class=" col-sm-6">


                                    <input type="text" name="expiry_month" placeholder="Año..." class="form-control" id="expiry_month">
                                </div>
                        </div>
                        <p>Codigo de Seguridad</p>
                        <div class="form" align="center">
                            <table form="table">
                                <td><input type="text" name="security_code" placeholder="CVC..." class="form-control" id="security_code">
                                </td><td align="center"><img src="image/question.png" width="30" height="30">  </td>
                            </table>
                        </div>






                        <div class="form-group col-lg-12">
                            <input type="checkbox" />Acepto los términos y condiciones
                        </div>
                        <button type="submit" class="mybtn">Aceptar y Crear</button>
                    </form>
                </div>
            </div>
        </div>



    </div>
</div>


<script src="js/bootstrap.min.js"></script>
</body>

</html>