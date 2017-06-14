<%-- 
    Document   : personas
    Created on : 14-jun-2017, 14:27:04
    Author     : dpalomar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de personas</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h2>Todas las personas</h2>
            <ul class="list-group">
                <c:forEach items="${personas}" var="persona">
                    <li class="list-group-item">Nombre: ${persona.nombre} <span class="badge">Id: ${persona.id}</span></li>
                </c:forEach>
            </ul>
        </div>
    </body>
</html>
