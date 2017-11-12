<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="edu.uade.integracion.dto.SolicitudDTO" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.uade.integracion.backoffice.servlet.Solicitudes" %>

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
                                <%= dto.getId() %>
                            </td>
                            <td>
                                <%= dto.getTipo() %>
                            </td>
                            <td>
                                <%= dto.getDetalle() %>
                            </td>
                            <td>
                                <%
                                    if (dto.getEstado() != null){
                                        switch (dto.getEstado()){
                                            case PENDIENTE:
                                                out.println("<div class='row'>");
                                                out.println("   <div class='col-6'>");
                                                out.println("       <button type='button' class='btn btn-block btn-outline-success' onclick='accionSolicitud(0, " + dto.getId() + ");'>");
                                                out.println("           APROBAR");
                                                out.println("       </button>");
                                                out.println("   </div>");
                                                out.println("   <div class='col-6'>");
                                                out.println("       <button type='button' class='btn btn-block btn-outline-danger' onclick='accionSolicitud(1, " + dto.getId() + ");'>");
                                                out.println("           RECHAZAR");
                                                out.println("       </button>");
                                                out.println("   </div>");
                                                out.println("</div>");
                                                break;
                                            case APROBADO:
                                                out.println("<button type='button' class='btn btn-block btn-success' disabled>");
                                                out.println("   APROBADO");
                                                out.println("</button>");
                                                break;
                                            case RECHAZADO:
                                                out.println("<button type='button' class='btn btn-block btn-danger' disabled>");
                                                out.println("   RECHAZADO");
                                                out.println("</button>");
                                                break;
                                        }
                                    }
                                %>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
            <footer class="footer">
                <p>&copy; Modulo BackOffice 2017</p>
            </footer>
        </div>
        <jsp:include page="base/footer.jsp"/>
        <script type="application/javascript">
            var accionesSolicitud = "<%= Solicitudes.ACCION_SOLICITUD %>";


            function accionSolicitud(tipoAccion, idSolicitud) {
                if (idSolicitud <= 0){
                    alert("El numero de Solicitud debe ser mayor a 0");
                } else {
                    var elementos = {
                        accion : accionesSolicitud,
                        id : idSolicitud,
                        tipo : tipoAccion
                    };
                    switch (tipoAccion){
                        case 0: // APROBAR
                            break;
                        case 1: // RECHAZAR
                            break;
                        default:
                            alert ("La accion es invalida");
                            return false;
                    }

                    $.post("/Solicitudes", elementos)
                        .done(function( data ) {
                            alert("Accion enviada");
                        })
                        .fail(function() {
                            alert("Error en la accion");
                        })
                        .always(function() {
                            window.location.reload();
                        });

                }
                return false;
            }

            $(document).ready({

            });
        </script>
    </body>
</html>
