<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="author" content="Grupo BO">
    <meta name="description" content="">
    <link href="img/favicon.ico" rel="shortcut icon">

    <title>Reportes</title>
    <jsp:include page="base/header.jsp"/>
</head>

<body>
<div class="container">

    <h2>Reportes</h2>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Modulo</th>
                <th>Accion</th>
                <th>Fecha y Hora</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Oferta Hotelera</td>
                <td>Error al cargar fotos del Hotel San Juan</td>
                <td>10/10/2017 10:08HS</td>
            </tr>
            <tr>
                <td>Oferta Paquetes</td>
                <td>Error al validar datos de cliente nro 1111</td>
                <td>11/10/2017 13:08HS</td>
            </tr>
            <tr>
                <td>Oferta Hotelera</td>
                <td>Error al cargar fotos del Hotel Hyatt</td>
                <td>12/10/2017 17:08HS</td>
            </tr>
            </tbody>
        </table>
    </div>


    <div class="row">
        <div class="col-lg-4">
            <p>
                <a class="btn btn-primary" href="Panel" role="button">Ir al panel principal</a>
            </p>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; Modulo BackOffice 2017</p>
    </footer>
</div>
<jsp:include page="base/footer.jsp"/>
</body>
</html>
