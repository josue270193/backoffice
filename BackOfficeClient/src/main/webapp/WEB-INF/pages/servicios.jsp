<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.uade.integracion.dto.ServicioDTO" %>

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
                    <button class="btn btn-block btn-outline-success">+ Agregar</button>
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

            <footer class="footer">
                <p>&copy; Modulo BackOffice 2017</p>
            </footer>
        </div>
        <jsp:include page="base/footer.jsp"/>
    </body>
</html>
