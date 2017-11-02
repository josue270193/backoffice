<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="author" content="Grupo BO">
    <meta name="description" content="">
    <link href="img/favicon.ico" rel="shortcut icon">

    <title>Panel Opciones</title>
    <jsp:include page="base/header.jsp"/>
</head>

<body>
<div class="container">

    <div class="jumbotron">
        <h1>Panel de control BO</h1>
        <p><a class="btn btn-lg btn-success" href="Solicitudes" role="button">Ver solicitudes</a></p>
        <p><a class="btn btn-lg btn-success" href="Servicios" role="button">Ver tipos de servicios</a></p>
        <p><a class="btn btn-lg btn-success" href="Reporte" role="button">Reportes</a></p>
    </div>

    <div class="row">
        <div class="col-lg-4">
            <p><a class="btn btn-primary" href="Login" role="button">Salir</a></p>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; Modulo BackOffice 2017</p>
    </footer>
</div>
<jsp:include page="base/footer.jsp"/>
</body>
</html>
