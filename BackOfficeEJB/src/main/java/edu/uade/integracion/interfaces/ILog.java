package edu.uade.integracion.interfaces;

import edu.uade.integracion.dto.LogDTO;

public interface ILog {

    String ORIGEN_BO = "BackOffice";
    String SERVICIO_CREAR_SOLICITUD = "Crear Solicitud";
    String SERVICIO_REGISTRAR_LOG = "Registrar Log";

    LogDTO registrarLog(LogDTO log);
    LogDTO registrarLog(String platadormaEnvia, String plataformaRecibe, String servicio, String observacion);

}
