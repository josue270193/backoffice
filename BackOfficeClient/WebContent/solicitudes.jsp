<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/favicon.ico">

    <title>Solicitudes</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
    
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    
    <script src="js/popper.min.js"></script>
    
    <script src="js/bootstrap.js"></script>
    
    <script src="js/solicitudes.js"></script>
  </head>

  <body>

    <div class="container">
   		
   	<h2>Solicitudes</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Numero</th>
                  <th>Tipo</th>
                  <th>Estado</th>
                  <th>Detalle</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>Hotelera</td>
                  <td>Pendiente</td>
                  <td>
                  	<button type="button" class="btn btn-primary" 
                  	data-toggle="modal" 
                  	data-target="#detalleModal" 
                  	data-numero="1" 
                  	data-tipo="Hotelera" 
                  	data-estado="Pendiente" 
                  	data-detalle="No cuentan con el formulario 19833">Ver</button>
                  </td>
                </tr>
				<tr>
                  <td>2</td>
                  <td>Hotelera</td>
                  <td>Pendiente</td>
                  <td>
                  	<button type="button" class="btn btn-primary" 
                  	data-toggle="modal" 
                  	data-target="#detalleModal" 
                  	data-numero="2" 
                  	data-tipo="Hotelera" 
                  	data-estado="Pendiente" 
                  	data-detalle="Sin observaciones">Ver</button>
                  </td>
                </tr>
                <tr>
                  <td>3</td>
                  <td>Hotelera</td>
                  <td>Pendiente</td>
                  <td>
                  	<button type="button" class="btn btn-primary" 
                  	data-toggle="modal" 
                  	data-target="#detalleModal" 
                  	data-numero="3" 
                  	data-tipo="Hotelera" 
                  	data-estado="Pendiente" 
                  	data-detalle="No esta habilitado para operar">Ver</button>
                  </td>
                </tr>
                <tr>
                  <td>4</td>
                  <td>Hotelera</td>
                  <td>Pendiente</td>
                  <td>
                  	<button type="button" class="btn btn-primary" 
                  	data-toggle="modal" 
                  	data-target="#detalleModal" 
                  	data-numero="4" 
                  	data-tipo="Hotelera" 
                  	data-estado="Pendiente" 
                  	data-detalle="Sin observaciones">Ver</button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>	
          
          
      <div class="modal fade" id="detalleModal" tabindex="-1" role="dialog" aria-labelledby="detalleModalEtiqueta" aria-hidden="true">
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
   	
      
      <div class="row">
      	<div class="col-lg-4">
      		<p><a class="btn btn-primary" href="panel.jsp" role="button">Ir al panel principal</a></p>
      	</div>
      </div>
      
      <!-- Site footer -->
      <footer class="footer">
        <p>&copy; Módulo BackOffice 2017</p>
      </footer>
      
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
