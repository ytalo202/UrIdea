<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 15/07/2017
  Time: 2:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2 align="center">Evaluation</h2>
    <form class="form-horizontal" action="/action_page.php">
        <div class="form-group">
            <label class="control-label col-sm-2" >Codigo de Evaluador:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Evaluator" name="id_evaluator">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" >Codigo del Empleado</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Codigo de Usuario empleado" name="id_user_employee">
            </div>
        </div>
        <div class="form-group">

            <label class="control-label col-sm-2" >Codigo del Compañia</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Codigo de Compañia" name="id_company">
            </div>

        </div>
        <div class="form-group">

            <label class="control-label col-sm-2" >Fecha de Evaluación</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Fecha de evaluacion" name="evaluation_date">
            </div>

        </div>

        <div class="form-group">

            <label class="control-label col-sm-2" >Calificación</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Calificación" name="grade">
            </div>

        </div>


        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
