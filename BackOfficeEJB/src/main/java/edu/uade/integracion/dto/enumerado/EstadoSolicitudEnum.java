package edu.uade.integracion.dto.enumerado;

public enum EstadoSolicitudEnum {

    APROVADO("Aprobado"),
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
