package edu.uade.integracion.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import edu.uade.integracion.dto.base.BaseDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.dto.enumerado.TipoSolicitudEnum;
import edu.uade.integracion.serializable.EstadoSolicitudEnumDeserializer;
import edu.uade.integracion.serializable.EstadoSolicitudEnumSerializer;
import edu.uade.integracion.serializable.TipoSolicitudEnumDeserializer;
import edu.uade.integracion.serializable.TipoSolicitudEnumSerializer;

public class SolicitudDTO extends BaseDTO {

    private String detalle;

    @JsonSerialize(using = TipoSolicitudEnumSerializer.class)
    @JsonDeserialize(using = TipoSolicitudEnumDeserializer.class)
    private TipoSolicitudEnum tipo;

    @JsonSerialize(using = EstadoSolicitudEnumSerializer.class)
    @JsonDeserialize(using = EstadoSolicitudEnumDeserializer.class)
    private EstadoSolicitudEnum estado;

    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoSolicitudEnum getTipo() {
        return tipo;
    }
    public void setTipo(TipoSolicitudEnum tipo) {
        this.tipo = tipo;
    }

    public EstadoSolicitudEnum getEstado() {
        return estado;
    }
    public void setEstado(EstadoSolicitudEnum estado) {
        this.estado = estado;
    }
}
