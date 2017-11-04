package edu.uade.integracion.entities;

import edu.uade.integracion.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "SERVICIOS")
public class ServicioEntity extends BaseEntity{

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "TIPO_SERVICIO", nullable = false)
    private TipoServicioEntity tipoServicio;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoServicioEntity getTipoServicio() {
        return tipoServicio;
    }
    public void setTipoServicio(TipoServicioEntity tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
