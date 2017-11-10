package edu.uade.integracion.dto;

import edu.uade.integracion.dto.base.BaseDTO;
import edu.uade.integracion.entities.TipoServicioEntity;

import java.util.ArrayList;
import java.util.List;

public class TipoServicioDTO extends BaseDTO {

    private String nombre;
    private List<ServicioDTO> servicios;

    public TipoServicioDTO() {
        servicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ServicioDTO> getServicios() {
        return servicios;
    }
    public void setServicios(List<ServicioDTO> servicios) {
        this.servicios = servicios;
    }

    public TipoServicioDTO build(TipoServicioEntity entity) {
        if (entity != null){
            setId(entity.getId());
            setNombre(entity.getNombre());
        }
        return this;
    }
}
