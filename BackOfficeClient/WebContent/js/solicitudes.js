$(document).ready(function(){
	$('#detalleModal').on('show.bs.modal', function (event) {
		  var button = $(event.relatedTarget) 
		  var numeroSolicitud 	= button.data('numero')
		  var tipoSolicitud 		= button.data('tipo')
		  var estadoSolicitud 	= button.data('estado')
		  var detalleSolicitud 	= button.data('detalle')
		  
		  var modal = $(this)
		  modal.find('.modal-title').text('Detalles para el nro de solicitud ' + numeroSolicitud)
		  modal.find('#tipo-solicitud-modal').val(tipoSolicitud)
		  modal.find('#estado-solicitud-modal').val(estadoSolicitud)
		  modal.find('#detalle-solicitud-modal').val(detalleSolicitud)
		  
		})
});