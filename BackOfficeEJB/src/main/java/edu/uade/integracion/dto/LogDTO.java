package edu.uade.integracion.dto;

import edu.uade.integracion.dto.base.BaseDTO;

import java.util.Date;

public class LogDTO extends BaseDTO {

    private String platadormaEnvia;
    private String plataformaRecibe;
    private Date fecha;
    private String servicio;
    private String observacion;

    public String getPlatadormaEnvia() {
        return platadormaEnvia;
    }
    public void setPlatadormaEnvia(String platadormaEnvia) {
        this.platadormaEnvia = platadormaEnvia;
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
}
