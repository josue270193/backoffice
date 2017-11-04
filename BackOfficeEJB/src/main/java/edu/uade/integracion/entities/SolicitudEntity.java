package edu.uade.integracion.entities;

import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.dto.enumerado.TipoSolicitudEnum;
import edu.uade.integracion.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "SOLICITUDES")
public class SolicitudEntity extends BaseEntity {

    @Column(name = "DETALLE", nullable = false)
    private String detalle;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "TIPO", nullable = false)
    private TipoSolicitudEnum tipo;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ESTADO", nullable = false)
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
