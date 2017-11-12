package edu.uade.integracion.dto.enumerado;

public enum EstadoSolicitudEnum {

    PENDIENTE("Pendiente"),
    APROBADO("Aprobado"),
    RECHAZADO("Rechazado")
    ;

    private String clave;

    EstadoSolicitudEnum(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }
}
