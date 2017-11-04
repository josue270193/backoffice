package edu.uade.integracion.dto;

import edu.uade.integracion.dto.base.BaseDTO;

import java.util.List;

public class TipoServicioDTO extends BaseDTO {

    private String nombre;
    private List<ServicioDTO> servicios;

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
}
