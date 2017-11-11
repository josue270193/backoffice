package edu.uade.integracion.dto;

import edu.uade.integracion.dto.base.BaseDTO;
import edu.uade.integracion.entities.LogEntity;

import java.util.Date;

public class LogDTO extends BaseDTO {

    private String plataformaEnvia;
    private String plataformaRecibe;
    private Date fecha;
    private String servicio;
    private String observacion;

    public String getPlataformaEnvia() {
        return plataformaEnvia;
    }
    public void setPlataformaEnvia(String plataformaEnvia) {
        this.plataformaEnvia = plataformaEnvia;
    }

    public String getPlataformaRecibe() {
        return plataformaRecibe;
    }
    public void setPlataformaRecibe(String plataformaRecibe) {
        this.plataformaRecibe = plataformaRecibe;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public LogDTO build(LogEntity entity) {
        if (entity != null){
            setId(entity.getId());
            setFecha(entity.getFecha());
            setServicio(entity.getServicio());
            setPlataformaRecibe(entity.getPlataformaRecibe());
            setPlataformaEnvia(entity.getPlataformaEnvia());
        }
        return this;
    }
}
