<script>
    window.location.replace(getPath() + "Account/cerrar");
</script>
<script>
    window.location.replace(getPath() + "Account/cerrar");
</script>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>Iniciar Sesión</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=yes">
    <link rel="shortcut icon" href="image/logo.jpg" />

    <link href="https://portalestudiante.utp.edu.pe/Content/bootstrap.css" rel="stylesheet"/>

    <link href="https://portalestudiante.utp.edu.pe/Content/bootstrap-responsive.css" rel="stylesheet"/>

    <script src="https://portalestudiante.utp.edu.pe/Scripts/jquery-1.9.1.js"></script>

    <script src="https://portalestudiante.utp.edu.pe/Content/jquery-ui/jquery-ui.js"></script>

    <script src="https://portalestudiante.utp.edu.pe/Scripts/ScriptGeneral.js"></script>


    <link rel="stylesheet" href="css/styleLogin.css">

    <script>
        $(document).ready(function () {
            $("#LoginUTP").load(getPath() + "Account/Login?log=UTP", function () {



                if ($("#valida").val() == "HT6jEddVlik,") {
                    $("#Error").replaceWith("<label id='lblError'   color:white;' class='text-danger' >Usuario o contraseña incorrecta</label>");
                }
                else if ($("#valida").val() == "87w_uR1cAec,") {
                    $("#Error").replaceWith("<label id='lblError'  color:white;' class='text-danger' >Usuario no permitido. Por favor comuníquese con Mesa de ayuda.</label>");
                }



                if (navigator.appVersion.indexOf('Trident') >= 1) {

                    $("#tableloginPartial").removeClass("tablecell");
                    $("#tableloginPartial").addClass("tablecellIE");

                    $("#divLogin").removeClass("tdLoginTitulo");
                    $("#divLogin").addClass("tdLoginTituloIE");



                    $("#tcActDir").removeClass("TxtUsuario");
                    $("#tcActDir").addClass("TxtUsuarioIE");

                    $("#tcActPas").removeClass("TxtUsuario");
                    $("#tcActPas").addClass("TxtUsuarioIE");


                    $("#cCaptcha").removeClass("TxtCssCaptcha");
                    $("#cCaptcha").addClass("TxtCssCaptchaIE");


                    $("#dCaptcha").addClass("dCaptchaModIE");




                }


            });





        });

        function Limpiar() {
            $("#tcActDir").val("").empty();
            $("#tcActPas").val("").empty();
            $("#cCaptcha").val("").empty();
        }



    </script>
    <style>
        #spanimg {
            font-size: 13px;
            color: white;
        }

        #idLinea {
            height: 10px !important;
        }

        .navbar-inverse {
            border-color: white !important;
        }

        .navbar-inverse {
            background-color: #FFFFFF;
            border-color: #080808;
        }

        .text-danger {
            color: white !important;
        }
    </style>
</head>
<body style="border: 1px groove;">
<input id="valida" name="valida" type="hidden" value="0" />

<header class="hidden-xs">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <img src="image/logo.jpg" width="120" height="160" class="img-responsive" alt="Inicio">
            </div>
            <nav class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><span class="TituloHeader"></span></li>
                </ul>
            </nav>
        </div>
    </div>
</header>

<div class="visible-xs">
    <div class="row">
        <div class="col-xs-11" style="margin: 8px 0px">
            <img src="image/logo.jpg" width="70" height="110" style="width:20%;margin:0 auto;"  class="img-responsive" alt="Inicio">
        </div></div>
</div>

<div class="cont">
    <div class="demo">
        <div class="login">
            <div class="login__form">
                <div id="LoginUTP">


                    <form action="validateEmployee" method="post">
                        <div id="loginForm" style="display:table-row-group;vertical-align: middle;border-color: inherit; ">
                            <remove name="FormsAuthentication"></remove>
                            <add name="FormAuthentication" type="System.web.security.FormsAutenticationModule"></add>
                            <table id="tableloginPartial" class="tablecell" style="text-align:center;width:400px;">

                                <tr>

                                    <td height="1" style="text-align:left;"></td>
                                </tr>
                                <tr>
                                    <td id="divLogin" class="tdLoginTitulo" height="20" style="text-align: center;">
                                        <h2 id="TextoLogin" class="hidden-xs">Ingresa a tu Cuenta</h2>
                                        <h2 class="visible-xs">Ingresa tu cuenta</h2>

                                    </td>
                                </tr>
                                <tr class="hidden-xs">
                                    <td id="idlinea" height="40" valign="top"></td>

                                </tr>
                                <tr>
                                    <td height="8" style="text-align: left"><font color="white">${requestScope.validaciones}</font>
                                    </td>
                                </tr>

                                <tr>
                                    <td class="tdLogin" style="text-align: center;">
                                        <input class="TxtUsuario" id="tcActDir" name="txtemail" REQUIRED placeholder="Correo..." type="text" value>

                                    </td>
                                </tr>

                                <tr>
                                    <td class="tdLogin" style="text-align: center;">

                                        <input class="TxtUsuario" id="tcActPas" name="txtpassword" REQUIRED placeholder="Contraseña..." type="password" value>

                                    </td>
                                </tr>



                                <tr>
                                    <td align="center" class="tdbutton">
                                        <input type="hidden" value="menu" name="action"/>
                                        <input  style="width:250px;" type="submit" value="Ingresar" class="button">
                                        <input id="LimpiarUser" type="button" onclick="Limpiar()" style="width: 250px;" value="Limpiar" class="buttonLimpiar">
                                        <br>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </form>

                </div>
            </div>
        </div>

    </div>
</div>
<br><br>








<footer class="footer  hidden-xs">
    <div id="footer-inner" class="col-xs-12 form-inline">

        <div class="col-md-6">
            <div class="form-group-lg">
                <p class="idp" style="margin-top: 10px;">
                    <a style="margin-left: 0px!important; font-family: helvetica;">Servicio de Atención al Usuario</a>
                </p>
                <p class="idp">
                    <img alt="" src="https://portalestudiante.utp.edu.pe/Images/mb_phone.png" style="height:25px; width:25px; position:absolute; bottom: 10px;">
                    <a>&nbsp;01 3159600&nbsp;   &nbsp;&nbsp;&nbsp;&nbsp;opción 2, &nbsp;opción 1</a>
                    <a>evap.com.pe</a>
                </p>
            </div>
        </div>

        <div class="col-md-6" style="padding-left: 0px;">
            <div class=" form-group-lg" style="border-left: 1px groove;">
                <p class="idp" style=" margin-top: 10px;">
                    <a style="margin-left: 0px!important;  font-family: helvetica;">Mesa de Ayuda</a>
                </p>
                <p class="idp">
                    <img alt="" src="https://portalestudiante.utp.edu.pe/Images/mb_phone.png" style="height:25px; width:25px; position:absolute; bottom: 10px;">
                    <a> &nbsp;01 3159600</a>
                    <a>mesadeayuda.evap.com.pe</a>
                </p>
            </div>
        </div>


    </div>

    <div class="col-xs-12 form-inline">
        <p class="idp" style=" margin-top: 10px; font-size: 11px!important; ">
            <a style="margin-left: 0px!important;">Evap -</a>
            <a href="/Home/PoliticasDePrivacidad" target=" _blank"
               style="margin-left: 0px!important;">
                Políticas de Privacidad -</a><a href="/Home/TerminosDeUso" target="_blank" style="margin-left: 0px!important;"> Términos y Condiciones</a>
        </p>
    </div>
</footer>

<div class="row visible-xs">

    <div class="row">
        <div class="col-xs-11">
            <img style="margin:0 auto;" class="img-responsive" src="https://portalestudiante.utp.edu.pe/Images/responsive/UTP_Movil_3.png" />
        </div>
    </div>

    <div class="row">
        <div class="col-xs-5">
            <a href="https://itunes.apple.com/fj/app/utp/id1065104276?mt=8" target="_blank"><img style="margin:0 auto;" class="img-responsive"
                                                                                                 src="https://portalestudiante.utp.edu.pe/Images/responsive/App_Store.png" /></a>
        </div>
        <div class="col-xs-5">
            <a href="https://play.google.com/store/apps/details?id=com.vidautp.projects.utpmovil"
               target="_blank"><img style="margin:0 auto;" class="img-responsive" src="https://portalestudiante.utp.edu.pe/Images/responsive/Google_Play.png" /></a>
        </div>

    </div>



</div>

</body>
</html>



