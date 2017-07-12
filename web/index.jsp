<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<html lang="en">
<head>
    <jsp:include page="bootstrap.jsp"/>



    <title>W3.CSS Template</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Monserrat">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">



    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Monserrat", Extra-Bold}
        body, html {
            height: 100%;
            line-height: 2.0;

        }


        .w3-bar .w3-button {
            padding: 16px;
        }

        .container {
            padding: 80px 120px;
        }
        .person {
            border: 10px solid transparent;
            margin-bottom: 25px;
            width: 80%;
            height: 80%;
            opacity: 0.7;
        }
        .person:hover {
            border-color: #D00C2D;
        }
        .carousel-inner img {


            width: 100%; /* Set width to 100% */
            margin: auto;


        }
        .carousel-caption h3{

        }

        @media (max-width: 600px) {
            .carousel-caption {
                display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
            }
        }

    </style>


</head>

<body>
<b:jumbotron>



<div class="navbar navbar-default navbar-fixed-top">


    <div class="w3-top">
        <div align="center" class="w3-bar w3-white w3-card-2" id="myNavbar">
            <a href="#home" class="w3-bar-item w3-button w3-wide">
                <img src="image/logo.jpg"  width="80" height="30"></a>
            <!-- Right-sided navbar links -->
            <div class="w3-right w3-hide-small">


                <a href="index.jsp" class="w3-bar-item w3-button"><i class="fa fa-home" aria-hidden="true" ></i> HOME</a>
                <a href="Listado.jsp" class="w3-bar-item w3-button">ABOUT</a>
                <a href="register.jsp" class="w3-bar-item w3-button"> SIGN UP</a>
                <a href="login.jsp" class="w3-bar-item w3-button"><i class="fa fa-user"></i> LOGIN</a>
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
    <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button
    w3-large w3-padding-16">Close ×</a>
    <a href="index.jsp" onclick="w3_close()" class="w3-bar-item w3-button">HOME</a>
    <a href="#team" onclick="w3_close()" class="w3-bar-item w3-button">ABOUT</a>
    <a href="" onclick="w3_close()" class="w3-bar-item w3-button">WORK</a>
    <a href="register.jsp" onclick="w3_close()" class="w3-bar-item w3-button">LOGIN IN</a>
    <a href="login.jsp" onclick="w3_close()" class="w3-bar-item w3-button">LOGIN</a>
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

            <div class="carousel-caption">

                <h1 >Bienvenidos a Evap </h1 >
                <br>
                <br>
                <h1>La Primera Plataforma de Evaluación de Personal </h1>
                <br>
                <br>
                <br>
                <br>
                <br>
                <p>Los mejores Profesionales a tu alcance .</p>
                <br>

            </div>
        </div>

        <div class="item" class="container">
            <img src="image/evaluar1.png" alt="Chicago" width="100%" height="100%">
            <div class="carousel-caption">
                <br>
                <h1 >La plataforma de evaluacion de personal </h1>
                <br>
                <br>
                <br>
                <br>
                <p>Somos la primera Empresa orientada a satisfacer las necesidades de personal</p>
                <br>
                <br>
            </div>
        </div>


        <div class="item" class="container" >
            <img src="image/asesor.jpg" alt="Los Angeles" width="100%" height="100%">
            <div class="carousel-caption">
                <br>
                <br>
                <h1 >Los Mejor manera de alcanzar los objetivos de tu organizacion</h1>
                <br>
                <br>
                <br>
                <br>
                <p >Mediante esta plataforma podras encontrar deficiente</p>
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

    <!-- Container (The Band Section) -->

    <div class="container">
        <h3 class="text-center">Contact</h3>
        <p class="text-center"><em>We love our fans!</em></p>

        <div class="row">
            <div class="col-md-4">
                <p>Fan? Drop a note.</p>
                <p><span class="glyphicon glyphicon-map-marker"></span>Chicago, US</p>
                <p><span class="glyphicon glyphicon-phone"></span>Phone: +00 1515151515</p>
                <p><span class="glyphicon glyphicon-envelope"></span>Email: mail@mail.com</p>
            </div>
            <div class="col-md-8">
                <div class="row">
                    <div class="col-sm-6 form-group">
                        <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
                    </div>
                    <div class="col-sm-6 form-group">
                        <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
                    </div>
                </div>
                <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
                <br>
                <div class="row">
                    <div class="col-md-12 form-group">
                        <button class="btn pull-right" type="submit">Send</button>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <script>

            //////////////////////////77777777


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



        </b:jumbotron>

</body>
</html>

