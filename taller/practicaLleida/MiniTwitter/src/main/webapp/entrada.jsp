<%-- 
    Document   : entrada
    Created on : 20-jun-2017, 19:17:04
    Author     : khepherer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Entrada al sistema</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
        crossorigin="anonymous"></script>
<!--        <script type="text/javascript">
            function f(){
                var nodo = document.getElementById("usuarioId");
                var numero = parseInt(nodo.innerHTML);
                console.log($('#usuarioId').html());
                console.log(parseInt($('#usuarioId').html()));
                alert(numero);
            }
        </script>-->
    </head>
    <body>
        <span id="usuarioId" hidden>${usuario.id}</span>
        <div class="container">
            <h2>Bienvenid@ a MiniTwitter, ${usuario.id}, ${usuario.nombre}, ${usuario.clave}</h2>
            <div class="list-group">
                <a href="#" class="list-group-item">Tus tweets</a>
                <a href="#" class="list-group-item">Nuevo Tweet</a>
                <a href="index.html" class="list-group-item">Volver</a>
            </div> 
        </div>
    </body>
</html>
