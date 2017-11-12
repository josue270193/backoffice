<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="es">
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
        <h1 class="display-4">Panel de control BO</h1>

        <div class="row">
            <div class="col-12">
                <a class="btn btn-lg btn-block btn-outline-primary" href="Solicitudes" role="button">Solicitudes</a>
            </div>
            <div class="col-12 mt-1">
                <a class="btn btn-lg btn-block btn-outline-primary" href="Servicios" role="button">Servicios</a>
            </div>
            <div class="col-12 mt-1">
                <a class="btn btn-lg btn-block btn-outline-primary" href="Logs" role="button">Logs</a>
            </div>
        </div>

        <div class="row mt-3">
            <div class="col-4">
                <a class="btn btn-block btn-outline-danger" href="Login" role="button">Salir</a>
            </div>
        </div>

        <footer class="footer">
            <p>&copy; Modulo BackOffice 2017</p>
        </footer>
    </div>
    <jsp:include page="base/footer.jsp"/>
    </body>
</html>
