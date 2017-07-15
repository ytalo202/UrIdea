<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yoshinon
  Date: 5/07/2017
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
                <h1>Lista de Administradores</h1>
                <div class="mydescription">
                    <p> </p>
                </div>
            </div>
        </div>


                    <jsp:useBean id="service" class="dbUrIdea.services.HRService"/>
                    <c:forEach var="employee" items="${service.employees}">
                    <script type="text/javascript">


                     var cod ="${employee.company.id}";
                        var tipe ="${employee.employeeType}";
                     var t =0;

                        if(cod == "${company.id}" &&tipe ==1){
                            t=t+1;
                       document.write(t+'.- ');
                            document.write('<c:out value="${employee.name}"/>');

                        document.write(' ');
                        document.write('<c:out value="${employee.dni}"/>');
                        document.write(' ');
                        document.write('<c:out value="${employee.emailAddress.emailData}"/>');
                        document.write(' ');
                        document.write('<c:out value="${employee.phoneNumber}"/>');
                        document.write('<br>');


                        }
                    </script>
                    </c:forEach>


        <form role="form" >



            <button type="button"
                    class="btn btn-default btn-lg btn-block">
                <a href="v?action=out">Cerrar Cuenta</a></button>





        </form>

        </table>
    </div>
</div>


<script src="js/bootstrap.min.js"></script>

</body>
</html>
