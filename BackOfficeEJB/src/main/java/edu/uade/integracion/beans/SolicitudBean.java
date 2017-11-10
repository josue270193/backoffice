package edu.uade.integracion.beans;

import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.entities.SolicitudEntity;
import edu.uade.integracion.interfaces.ISolicitud;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class SolicitudBean implements ISolicitud {

    @PersistenceContext(unitName = "puBO")
    private EntityManager entityManager;

    @Override
    public SolicitudDTO crearSolicitud(SolicitudDTO solicitud) {
        try {
            SolicitudEntity entity = new SolicitudEntity();
            entity.setDetalle(solicitud.getDetalle());
            entity.setTipo(solicitud.getTipo());
            entity.setEstado(EstadoSolicitudEnum.PENDIENTE);

            entityManager.persist(entity);
            entityManager.flush();
            return new SolicitudDTO().build(entity);
        } catch (Exception e){

            // ENVIO ERROR
            e.printStackTrace();
        }
        return null;
    }
}
