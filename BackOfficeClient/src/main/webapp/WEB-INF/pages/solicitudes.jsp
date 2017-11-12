<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="edu.uade.integracion.dto.SolicitudDTO" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="author" content="Grupo BO">
        <meta name="description" content="">
        <link href="img/favicon.ico" rel="shortcut icon">

        <title>Solicitudes</title>
        <jsp:include page="base/header.jsp"/>
    </head>

    <body>
        <div class="container">

            <div class="row">
                <div class="col-4">
                    <h1>Solicitudes</h1>
                </div>
                <div class="col-4">
                    <a class="btn btn-block btn-outline-info" href="Panel" role="button">Ir al panel principal</a>
                </div>
            </div>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Tipo</th>
                            <th>Detalle</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<SolicitudDTO> lista = (List<SolicitudDTO>) request.getAttribute("lista");
                            for (SolicitudDTO dto : lista) {
                        %>
                        <tr>
                            <td>
                                <%= dto.getTipo().getNombre() %>
                            </td>
                            <td>
                                <%= dto.getNombre() %>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>


            <div class="modal fade" id="detalleModal" tabindex="-1" role="dialog" aria-labelledby="detalleModalEtiqueta"
                 aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="detalleModalEtiqueta">Detalles para el nro de solicitud </h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <form>
                                <div class="form-group">
                                    <label for="tipo-solicitud-modal" class="col-form-label">Tipo:</label>
                                    <input type="text" class="form-control" id="tipo-solicitud-modal">
                                </div>
                                <div class="form-group">
                                    <label for="estado-solicitud-modal" class="col-form-label">Estado:</label>
                                    <input type="text" class="form-control" id="estado-solicitud-modal">
                                </div>
                                <div class="form-group">
                                    <label for="detalle-solicitud-modal" class="col-form-label">Detalle:</label>
                                    <textarea class="form-control" id="detalle-solicitud-modal"></textarea>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Desaprobar</button>
                            <button type="button" class="btn btn-primary">Aprobar</button>
                        </div>
                    </div>
                </div>
            </div>

            <footer class="footer">
                <p>&copy; Modulo BackOffice 2017</p>
            </footer>
        </div>
        <jsp:include page="base/footer.jsp"/>
    </body>
</html>
