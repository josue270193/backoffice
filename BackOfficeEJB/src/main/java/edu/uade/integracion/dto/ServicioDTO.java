package edu.uade.integracion.dto;

import edu.uade.integracion.dto.base.BaseDTO;
import edu.uade.integracion.entities.ServicioEntity;

public class ServicioDTO extends BaseDTO {

    private String nombre;
    private TipoServicioDTO tipo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoServicioDTO getTipo() {
        return tipo;
    }
    public void setTipo(TipoServicioDTO tipo) {
        this.tipo = tipo;
    }

    public ServicioDTO build(ServicioEntity entity) {
        if (entity != null){
            setId(entity.getId());
            setNombre(entity.getNombre());
            setTipo(new TipoServicioDTO().build(entity.getTipoServicio()));
        }
        return this;
    }
}
