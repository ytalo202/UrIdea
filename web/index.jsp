<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<html lang="en">
<head>
    <!-- Theme Made By www.w3schools.com - No Copyright -->
    <title>Evap</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


    <script src="js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Monserrat">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">




    <style>



        .carousel-inner img {


            width: 100%; /* Set width to 100% */
            margin: auto;
        }


        h3, h4 {
            margin: 10px 0 30px 0;
            letter-spacing: 10px;
            font-size: 20px;
            color: #111;
        }
        .person {

            margin-bottom: 25px;
            width: 50%;
            height: 30%;

        }


        @import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700,300);
        @import url(https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css);
        ul,li{
            padding:0;
            margin:0;
        }
        li{
            list-style-type:none;
        }



        footer { background-color:#0c1a1e; min-height:350px; font-family: 'Open Sans', sans-serif; }
        .footer-col { margin-top:50px; }
        .logofooter { margin-bottom:10px; font-size:25px; color:#fff; font-weight:700;}

        .footer-col p { color:#fff; font-size:12px; font-family: 'Open Sans', sans-serif; margin-bottom:15px;}
        .footer-col p i { width:20px; color:#999;}

        .footer-ul { list-style-type:none;  padding-left:0; margin-left:2px;}
        .footer-ul li { line-height:29px; font-size:12px;}
        .footer-ul li a { color:#a0a3a4; transition: color 0.2s linear 0s, background 0.2s linear 0s; }
        .footer-ul i { margin-right:10px;}
        .footer-ul li a:hover {transition: color 0.2s linear 0s, background 0.2s linear 0s; color:#ff670f; }

        .copyright { min-height:40px; background-color:#000000;}
        .copyright p { text-align:left; color:#FFF; padding:10px 0; margin-bottom:0;}
        .heading7 { font-size:21px; font-weight:700; color:#d9d6d6; margin-bottom:22px;}
        .post p { font-size:12px; color:#FFF; line-height:20px;}
        .post p span { display:block; color:#8f8f8f;}
        .bottom_ul { list-style-type:none; float:right; margin-bottom:0;}
        .bottom_ul li { float:left; line-height:40px;}
        .bottom_ul li:after { content:"/"; color:#FFF; margin-right:8px; margin-left:8px;}
        .bottom_ul li a { color:#FFF;  font-size:12px;}
        .social-icon {
            width: 30px;
            height: 30px;
            font-size: 15px;
            background-color: blue;
            color: #fff;
            text-align: center;
            margin-right: 10px;
            padding-top: 7px;
            border-radius: 50%;
        }
        .footer-social li{
            float:left;
        }
        .linked-in{
            background-color:#007bb6;
        }
        .facebook{
            background-color:#3b5998;
        }
        .twitter{
            background-color:#1da1f2;
        }
        .google{
            background-color:#f63e28;
        }
        .form-control {
            border-radius: 0;
        }

    </style>
</head>
<body>


<div class="navbar navbar-default navbar-fixed-top">


    <div class="w3-top">
        <div align="left" class="w3-bar w3-white w3-card-2" id="myNavbar">



            <a href="#dem" data-toggle="collapse" class="w3-bar-item w3-button w3-wide">
                <img src="image/logo.jpg"  width="80" height="30">
            </a>

            <font size="3" color="black">${requestScope.validaciones}</font>
            <div id="dem" class="collapse">

                <form action="search" method="post" class="w3-bar-item w3-button w3-wide"
                      style="height:38px" style="width:80px">

                    <input title="Necesita un Código Numérico mayor a 0"  placeholder="Código de la Compañía" type="number" min="1" name="cod" size="10" REQUIRED style="height:30px">

                    <input type="hidden"  value="Buscar" name="action">
                    <input type="submit" value="Buscar" size="5"  style="height:30px">
                </form>
                </div>


            <!-- Right-sided navbar links -->
            <div class="w3-right w3-hide-small">


                <a href="pagos.jsp" class="w3-bar-item w3-button">
                    <i class="fa fa-home" aria-hidden="true" ></i> Inicio</a>
                <a href="Listado.jsp" class="w3-bar-item w3-button">Nosotros</a>

                <a href="CompEmail.jsp" class="w3-bar-item w3-button"> Registrarse</a>
                <a href="login.jsp" class="w3-bar-item w3-button"><i class="fa fa-user"></i>Ingresar</a>
            </div>
            <!-- Hide right-floated links on small screens and replace them with a menu icon -->

            <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
                <i class="fa fa-bars"></i>
            </a>

        </div>
    </div>
</div>

</nav>




<!-- Sidebar on small screens when clicking the menu icon -->
<nav class="w3-sidebar w3-bar-block w3-black w3-card-2 w3-animate-left
  w3-hide-medium w3-hide-large" style="display:none" id="mySidebar">
    <p> </p>
    <p> </p>
    <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button
    w3-large w3-padding-16">Close ×</a>
    <a href="index.jsp" onclick="w3_close()" class="w3-bar-item w3-button">Inicio</a>
    <a href="#team" onclick="w3_close()" class="w3-bar-item w3-button">Nosotros</a>

    <a href="register.jsp" onclick="w3_close()" class="w3-bar-item w3-button">Registrese</a>
    <a href="login.jsp" onclick="w3_close()" class="w3-bar-item w3-button">Ingresar</a>
</nav>





<!-- Sidebar on small screens when clicking the menu icon -->

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox"  >
        <div class="item active" class="container">

            <img src="image/header.jpg" alt="New York" width="100%" height="100%">

            <div class="carousel-caption" >

                <h1 >Bienvenidos a Evap </h1 >
                <br>
                <br>
                <h1>La Primera Plataforma de Evaluación de Personal </h1>
                <br>
                <br>
                <br>
                <br>
                <br>
                <h2>Los mejores Profesionales a tu alcance .</h2>
                <br>

            </div>
        </div>

        <div class="item" class="container">
            <img src="image/asesor2.jpg" alt="Chicago" width="100%" height="100%">
            <div class="carousel-caption">
                <br>
                <h1 >La plataforma de evaluacion de personal </h1>
                <br>
                <br>
                <br>
                <br>
                <h2>Somos la primera Empresa orientada a satisfacer las necesidades de personal</h2>
                <br>
                <br>
            </div>
        </div>


        <div class="item" class="container" >
            <img src="image/empresas3.jpg" alt="Los Angeles" width="100%" height="100%">
            <div class="carousel-caption">
                <br>
                <br>
                <h1 >Los Mejor manera de alcanzar los objetivos de tu organizacion</h1>
                <br>
                <br>
                <br>
                <br>
                <h2 >Mediante esta plataforma podras encontrar deficiente</h2>
                <br>
                <br>
            </div>
        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

<br>
<br>
<div id="band" class="container text-center">
    <h3>EVALUACION  DE PERSONAL DE 360°</h3>
    <p><em>Importancia</em></p>
    <p>
        La evaluación de 360 grados es una herramienta extraordinaria para medir las competencias blandas
        de los líderes de una organización, ya que considera a todos aquellos puestos que tienen relación
        directa con el evaluado (pares, clientes internos, colaboradores y jefes), solicitando retroalimentación
        sobre su desempeño en las competencias clave
        del puesto. Se llama evaluación de 360 grados o evaluación integral ya que considera todas las
        relaciones representativas que tiene el líder o evaluado a su alrededor.</p>
    <br>
    <div class="row">
        <div class="col-sm-4">
            <p class="text-center"><strong>¿Porque evaluar?</strong></p><br>
            <a href="#demo" data-toggle="collapse">
                <img src="http://etalentprofile.com/images/e_talent_profile/evaluacion-360-imagen.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
            </a>
            <div id="demo" class="collapse">
                <p>Hacer promociones de puesto.</p>
                <p>Hacer planes de capacitación o detección de necesidades de capacitación.</p>
                <p>Desarrollo del personal para puestos de mayores responsabilidades.</p>
            </div>
        </div>
        <div class="col-sm-4">
            <p class="text-center"><strong>El Resultado Proporciona</strong></p><br>
            <a href="#demo2" data-toggle="collapse">
                <img src="http://stratega-rrhh.com/2016/wp-content/uploads/2017/02/para-lic-fer.png" class="img-circle person" alt="Random Name" width="255" height="255">
            </a>
            <div id="demo2" class="collapse">
                <p>Las Debilidades  </p>
                <p>Cualidades</p>
                <p>Habilidades,aptitudes</p>
            </div>
        </div>
        <div class="col-sm-4">
            <p class="text-center"><strong>Grupo de Competencias evaluadas </strong></p><br>
            <a href="#demo3" data-toggle="collapse">
                <img src="http://humansmart.com.mx/imagesnew2/0/0/0/1/1/3/7/2/5/5/345%20x%20230%20evaluacion360.png" class="img-circle person" alt="Random Name" width="255" height="255">
            </a>
            <div id="demo3" class="collapse">
                <p>Competencias Profesionales</p>
                <p>Competencias Generales</p>
                <p>Competencias Estrategicas</p>
            </div>
        </div>
    </div>
</div>



























<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-sm-6 footer-col">
                <div class="logofooter"> <img src="image/logo.jpg" width="70" height="50"></div>
                <p>La Plataforma Evap, es una plataforma web,encargada de evaluar a personal de
                    distintas empresas,teniendo su sede central en Lima-Perú.</p>
                <p><i class="fa fa-map-pin"></i> #228, Lima, Perú</p>
                <p><i class="fa fa-phone"></i> Telefono (Perú) : +01 9999 999 999</p>
                <p><i class="fa fa-envelope"></i> E-mail : Evap@gmail.com.com</p>

            </div>
            <div class="col-md-3 col-sm-6 footer-col">
                <h6 class="heading7">Sobre Nosotros</h6>
                <ul class="footer-ul">
                    <li><a href="#"> Carrera</a></li>
                    <li><a href="#"> Politicas de privacidad</a></li>
                    <li><a href="#"> Terminos y condiciones</a></li>
                    <li><a href="#"> Clientes</a></li>
                    <li><a href="#"> Ranking</a></li>
                    <li><a href="#"> Case Studies</a></li>
                    <li><a href="#"> Preguntas Frecuentes</a></li>
                </ul>
            </div>
            <div class="col-md-3 col-sm-6 footer-col">
                <h6 class="heading7">Ultima Publicación</h6>
                <div class="post">
                    <p>Se publico en Facebook ,el ultimo taller vivencial de la plataforma web  <span>Agosto 3,2017</span></p>
                    <p>Se transmmitio por Youtube ,la nueva forma de evaluar las competencias de personal <span>Agosto 4,2017</span></p>
                    <p>Se publico los descuentos que se estan haciendo por este mes  <span>Agosto 5,2017</span></p>
                </div>
            </div>
            <div class="col-md-3 col-sm-6 footer-col">
                <h6 class="heading7">Siguenos</h6>
                <ul class="footer-social">
                    <li><i class="fa fa-linkedin social-icon linked-in" aria-hidden="true"></i></li>
                    <li><i class="fa fa-facebook social-icon facebook" aria-hidden="true"></i></li>
                    <li><i class="fa fa-twitter social-icon twitter" aria-hidden="true"></i></li>
                    <li><i class="fa fa-google-plus social-icon google" aria-hidden="true"></i></li>
                </ul>
            </div>
        </div>
    </div>
</footer>
<!--footer start from here-->

<div class="copyright">
    <div class="container">
        <div class="col-md-6">
            <p>© 2016 -.Derechos reservados</p>
        </div>
        <div class="col-md-6">
            <ul class="bottom_ul">
                <li><a href="#">Ayuda</a></li>
                <li><a href="#">Preguntas Frecuentes</a></li>
                <li><a href="#">Blog</a></li>

            </ul>
        </div>
    </div>
</div>




<script>




    var mySidebar = document.getElementById("mySidebar");

    function w3_open() {
        if (mySidebar.style.display === 'block') {
            mySidebar.style.display = 'none';
        } else {
            mySidebar.style.display = 'block';
        }
    }

    // Close the sidebar with the close button
    function w3_close() {
        mySidebar.style.display = "none";
    }

</script>


</body>
</html>