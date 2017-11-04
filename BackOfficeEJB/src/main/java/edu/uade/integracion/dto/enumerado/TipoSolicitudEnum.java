package edu.uade.integracion.dto.enumerado;

public enum TipoSolicitudEnum {

    HOTELERA("Hotelera"),
    AGENCIA("Agencia")
    ;

    private String clave;

    TipoSolicitudEnum(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }
}
