<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.uade.integracion.dto.ServicioDTO" %>
<%@ page import="edu.uade.integracion.dto.TipoServicioDTO" %>
<%@ page import="edu.uade.integracion.backoffice.servlet.Servicios" %>

<!DOCTYPE html>
<html lang="es">
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

            <div class="row">
                <div class="col-4">
                    <h1>Servicios</h1>
                </div>
                <div class="col-4">
                    <a class="btn btn-block btn-outline-info" href="Panel" role="button">Ir al panel principal</a>
                </div>
                <div class="col-4">
                    <button class="btn btn-block btn-outline-success" data-toggle="modal" data-target="#modalAgregar">+ Agregar</button>
                </div>
            </div>

            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>Tipo</th>
                            <th>Servicio</th>
                        </tr>
                    </thead>
                    <tbody>
                    <%
                        List<ServicioDTO> lista = (List<ServicioDTO>) request.getAttribute("lista");
                        for (ServicioDTO dto : lista) {
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

            <div class="modal fade" id="modalAgregar" tabindex="-1" role="dialog" aria-labelledby="modalAgregarLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content">
                        <div class="modal-header bg-dark text-white">
                            <h5 class="modal-title" id="modalAgregarLabel">Agregar Servicio</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">


                            <form>
                                <div class="form-group">
                                    <label for="campoTipo">Tipo Servicio</label>
                                    <select class="form-control" id="campoTipo">
                                        <option value="-1">Seleccione un tipo</option>
                                        <%
                                            List<TipoServicioDTO> listaServicio = (List<TipoServicioDTO>) request.getAttribute("listaServicio");
                                            for (TipoServicioDTO dto : listaServicio) {
                                                out.println("<option value=" + dto.getId() + ">");
                                                out.println(dto.getNombre());
                                                out.println("</option>");
                                            }
                                        %>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="campoNombre">Nombre</label>
                                    <input type="text" class="form-control" id="campoNombre" placeholder="Nombre del Servicio">
                                </div>
                            </form>

                        </div>
                        <div class="modal-footer">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-4">
                                        <button type="button" class="btn btn-block btn-outline-danger" data-dismiss="modal">Cancelar</button>
                                    </div>
                                    <div class="col-4">
                                    </div>
                                    <div class="col-4">
                                        <button type="button" class="btn btn-block btn-outline-success" onclick="agregarServicio();">Agregar</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <footer class="footer">
                <p>&copy; Modulo BackOffice 2017</p>
            </footer>
        </div>
        <jsp:include page="base/footer.jsp"/>
        <script type="application/javascript">
            var accionesAgregarServicio = "<%= Servicios.ACCION_AGREGAR_SERVICIO %>";

            function agregarServicio() {
                var nombre = $("#campoNombre").val();
                var tipo = $("#campoTipo").val();

                if (!tipo || tipo <= 0){
                    alert("Debe seleccionar un Tipo");
                    return false;
                }
                if (!nombre){
                    alert("Debe completar el Nombre");
                    return false;
                }

                var elementos = {
                    accion : accionesAgregarServicio,
                    tipo : tipo,
                    nombre : nombre
                };

                $.post("/Servicios", elementos)
                    .done(function( data ) {
                        alert("Accion enviada");
                    })
                    .fail(function() {
                        alert("Error en la accion");
                    })
                    .always(function() {
                        window.location.reload();
                    });


                return false;
            }

            $(document).ready({

            });
        </script>
    </body>
</html>
