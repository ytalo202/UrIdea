


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
                <h1>Actualizar Datos de Empleado</h1>
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
                    <div class="myform-top-right">
                        <i class="fa fa-money"></i>
                    </div>
                </div>
                <div class="myform-bottom">

                    <form role="form" action="TypeEmployeeValidation" method="post" >

                        <div class="form-group">
                            <input type="hidden" name="id" value="${employee.id}" class="form-control"
                                    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                            />
                        </div>


                        <div class="form-group">
                            <input type="hidden" name="employee_type" value="${employee.employeeType}"
                                   class="form-control"/></div>

                        <div class="form-group">
                            <input type="text" name="password" value="${employee.password}" class="form-control"/></div>

                        <div class="form-group">
                            <input type="text" name="employee_name" value="${employee.name}" class="form-control"/></div>
                        <div class="form-group">
                            <input type="text" name="employee_first_last_name" value="${employee.firstLastName}" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <input type="text" name="employee_second_last_name" value="${employee.secondLastName}" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <input type="text" name="dni" value="${employee.dni}" class="form-control" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <input type="text" name="phone_number" value="${employee.phoneNumber}" class="form-control"/>
                        </div>
                        <div class="form-group">
                        <input type="text" name="cell_phone_number" value="${employee.cellPhoneNumber}" class="form-control"/>
                    </div>
                        <div class="form-group">
                            <input type="text" name="address" value="${employee.address}" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <input type="text" name="department" value="${employee.department}" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <input type="text" name="cell_phone_number" value="${employee.cellPhoneNumber}" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <input type="date" name="birthdate" value="${employee.birthdate}" class="form-control"/>
                        </div>



                        <input type="hidden" value="updateEmpleadoData" name="action"/>
                        <button input type="submit" class="mybtn">Update</button>







                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="js/bootstrap.min.js"></script>
</body>

</html>