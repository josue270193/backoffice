<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="edu.uade.integracion.dto.LogDTO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="author" content="Grupo BO">
        <meta name="description" content="">
        <link href="img/favicon.ico" rel="shortcut icon">

        <title>Logs</title>
        <jsp:include page="base/header.jsp"/>
    </head>

    <body>
        <div class="container">

            <div class="row">
                <div class="col-4">
                    <h1>Logs</h1>
                </div>
                <div class="col-4">
                    <a class="btn btn-block btn-outline-info" href="Panel" role="button">Ir al panel principal</a>
                </div>
            </div>

            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>Plataforma Envia</th>
                            <th>Plataforma Recibe</th>
                            <th>Servicio</th>
                            <th>Fecha</th>
                            <th>Observacion</th>
                        </tr>
                    </thead>
                    <tbody>
                    <%
                        List<LogDTO> lista = (List<LogDTO>) request.getAttribute("lista");
                        for (LogDTO dto : lista) {
                    %>
                        <tr>
                            <td>
                                <%= dto.getPlataformaEnvia() %>
                            </td>
                            <td>
                                <%= dto.getPlataformaRecibe() %>
                            </td>
                            <td>
                                <%= dto.getServicio() %>
                            </td>
                            <td>
                                <%
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                                    out.println(sdf.format(dto.getFecha()));
                                %>
                            </td>
                            <td>
                                <%
                                    if (dto.getObservacion() != null) {
                                        out.print(dto.getObservacion());
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
    </body>
</html>
