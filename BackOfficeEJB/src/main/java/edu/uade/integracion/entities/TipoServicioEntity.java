package edu.uade.integracion.entities;

import edu.uade.integracion.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TIPO_SERVICIOS")
public class TipoServicioEntity extends BaseEntity {

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "tipoServicio")
    private List<ServicioEntity> servicios;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ServicioEntity> getServicios() {
        return servicios;
    }
    public void setServicios(List<ServicioEntity> servicios) {
        this.servicios = servicios;
    }
}
