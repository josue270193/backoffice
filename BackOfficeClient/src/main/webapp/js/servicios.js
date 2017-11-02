$(document).ready(function(){
	$('#detalleModal').on('show.bs.modal', function (event) {
		  var button = $(event.relatedTarget) 
		  var tipoServicio 	= button.data('tipo')
		  var servicio 		= button.data('servicio')
		  
		  var modal = $(this)
		  modal.find('#tipo-servicio-modal').val(tipoServicio)
		  modal.find('#servicio-modal').val(servicio)
		  
		})
});