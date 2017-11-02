<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="author" content="Grupo BO">
    <meta name="description" content="">
    <link href="img/favicon.ico" rel="shortcut icon">

    <title>Tipos de servicios</title>
    <jsp:include page="base/header.jsp"/>
</head>

<body>
<div class="container">

    <h2>Servicios</h2>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Tipo</th>
                <th>Servicio</th>
                <th>Ver</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>SPA</td>
                <td>Masajes las 24hs</td>
                <td>
                    <button type="button" class="btn btn-primary"
                            data-toggle="modal"
                            data-target="#detalleModal"
                            data-tipo="SPA"
                            data-servicio="Masajes las 24hs">Ver
                    </button>
                </td>
            </tr>
            <tr>
                <td>Aire Acondicionado</td>
                <td>Equipos split frio/calor</td>
                <td>
                    <button type="button" class="btn btn-primary"
                            data-toggle="modal"
                            data-target="#detalleModal"
                            data-tipo="Aire Acondicionado"
                            data-servicio="Equipos split frio/calor">Ver
                    </button>
                </td>
            </tr>
            <tr>
                <td>Desayuno</td>
                <td>Incluido en todas las tarifas</td>
                <td>
                    <button type="button" class="btn btn-primary"
                            data-toggle="modal"
                            data-target="#detalleModal"
                            data-tipo="Desayuno"
                            data-servicio="Incluido en todas las tarifas">Ver
                    </button>
                </td>
            </tr>
            </tbody>
        </table>
    </div>

    <div class="modal fade" id="detalleModal" tabindex="-1" role="dialog" aria-labelledby="detalleModalEtiqueta"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="detalleModalEtiqueta">Detalles del servicio </h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="form-group">
                            <label for="tipo-servicio-modal" class="col-form-label">Tipo:</label>
                            <input type="text" class="form-control" id="tipo-servicio-modal">
                        </div>
                        <div class="form-group">
                            <label for="servicio-modal" class="col-form-label">Servicio:</label>
                            <input type="text" class="form-control" id="servicio-modal">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-lg-4">
            <p><a class="btn btn-primary" href="Panel" role="button">Ir al panel principal</a></p>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; Modulo BackOffice 2017</p>
    </footer>
</div>
<jsp:include page="base/footer.jsp"/>
</body>
</html>
