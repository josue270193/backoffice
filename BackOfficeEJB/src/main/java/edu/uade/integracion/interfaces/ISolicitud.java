package edu.uade.integracion.interfaces;

import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;

import java.util.List;

public interface ISolicitud {

    SolicitudDTO crearSolicitud(SolicitudDTO solicitud);
    SolicitudDTO obtenerSolicitudPorId(Long idSolicitud);
    List<SolicitudDTO> obtenerTodos();
    SolicitudDTO aprobarSolicitud(Long idSolicitud);
    SolicitudDTO rechazarSolicitud(Long idSolicitud);
    SolicitudDTO cambiarEstadoSolicitud(Long idSolicitud, EstadoSolicitudEnum estado);
}
