<?php
session_start();

if(isset($_POST['submit']))
{
    $username = "carlos";
    $password ="123abc";
    if ( (isset($_POST['nombre']))&&(isset($_POST['password']) ))   {
        $nombre = $_POST['nombre'];
        $pass = $_POST['password'];

    }else{

        header("location: login.jsp");

    }
} else{
    header("location: login.jsp");
}

?>