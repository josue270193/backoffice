<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="edu.uade.integracion.dto.LogDTO" %>

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
                <th>Plataforma Envia</th>
                <th>Plataforma Recibe</th>
                <th>Servicio</th>
                <th>Fecha</th>
                <th>Observacion</th>
            </tr>
            </thead>
            <tbody>
            <%
            	for (LogDTO dto : ((List<LogDTO) request.getAttribute("lista")) ){				
            %>
            	<tr>
                	<td><%= dto.getPlataformaEnvia() %></td>
                	<td><%= dto.getPlataformaRecibe() %></td>
                	<td><%= dto.getServicio() %></td>
                	<td><%= dto.getFecha() %></td>
                	<td><%= dto.getObservacion() %></td>
            	</tr>
            <%		
            	}
            %>
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
