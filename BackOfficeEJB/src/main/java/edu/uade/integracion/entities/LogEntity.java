package edu.uade.integracion.entities;

import edu.uade.integracion.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LOGS")
public class LogEntity extends BaseEntity {

    @Column(name = "PLATAFORMA_ENVIA")
    private String platadormaEnvia;

    @Column(name = "PLATAFORMA_RECIBE")
    private String plataformaRecibe;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "SERVICIO")
    private String servicio;

    @Column(name = "OBSERVACION", columnDefinition = "TEXT")
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
