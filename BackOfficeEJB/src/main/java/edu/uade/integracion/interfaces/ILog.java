package edu.uade.integracion.interfaces;

import java.util.List;

import edu.uade.integracion.dto.LogDTO;

public interface ILog {

    String ORIGEN_BO = "BackOffice";
    String SERVICIO_CREAR_SOLICITUD = "Crear Solicitud";
    String SERVICIO_REGISTRAR_LOG = "Registrar Log";
    String SERVICIO_CAMBIO_ESTADO_SOLICITUD = "Cambiar Estado Solicitud";
    String SERVICIO_AGREGAR_SERVICIO = "Agregar Servicio";

    LogDTO registrarLog(LogDTO log);
    LogDTO registrarLog(String platadormaEnvia, String plataformaRecibe, String servicio, String observacion);
    List<LogDTO> obtenerTodos();
}
