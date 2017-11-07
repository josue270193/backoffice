package edu.uade.integracion.dto.enumerado;

public enum EstadoSolicitudEnum {

    APROBADO("Aprobado"),
    RECHAZADO("Rechazado"),
    PENDIENTE("Pendiente")
    ;

    private String clave;

    EstadoSolicitudEnum(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }
}
