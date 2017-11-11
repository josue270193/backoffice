package edu.uade.integracion.beans;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.entities.SolicitudEntity;
import edu.uade.integracion.interfaces.ILog;
import edu.uade.integracion.interfaces.ISolicitud;

@Stateless
@LocalBean
public class SolicitudBean implements ISolicitud {

    @PersistenceContext(unitName = "puBO")
    private EntityManager entityManager;

    @EJB
    private LogBean logBean;

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
            logBean.registrarLog(ILog.ORIGEN_BO, ILog.ORIGEN_BO, ILog.SERVICIO_CREAR_SOLICITUD, e.toString());
        }
        return null;
    }

	@Override
	public SolicitudDTO obtenerSolicitudPorId(Long idSolicitud) {
		Query query = entityManager.createQuery("SELECT object(s) FROM SolicitudEntity s WHERE s.id = :id");
		query.setParameter("id", idSolicitud);
		SolicitudEntity entity = (SolicitudEntity) query.getSingleResult();
		return new SolicitudDTO().build(entity);
	}
}
