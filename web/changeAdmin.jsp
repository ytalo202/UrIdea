<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Alerta</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#myModal").modal('show');
        });
    </script>
</head>
<body>

<div id="myModal" class="modal fade" class="embed-responsive">
    <form action="v" method="post">


        <input type="hidden" name="idEmployee" value="${employee.id}"
                <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
        />
        <input type="hidden" name="idCompany" value="${employee.company.id}"
                <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
        />
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Confirmation</h4>
                </div>
                <div class="modal-body">
                    <p>Do you want to save changes you made to document before closing?</p>
                    <p class="text-warning"><small>If you don't save, your changes will be lost.</small></p>
                </div>
                <div class="modal-footer">


                    <button type="button" class="btn btn-default" >
                        <a href="v?action=regresar">
                            Cancelar</a></button>
                    <input type="hidden" value="updatechangeAdmin" name="action"/>
                    <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- Buttons -->

</body>
</html>