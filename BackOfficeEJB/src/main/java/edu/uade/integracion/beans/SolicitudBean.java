package edu.uade.integracion.beans;

import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.entities.SolicitudEntity;
import edu.uade.integracion.interfaces.ILog;
import edu.uade.integracion.interfaces.ISolicitud;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<SolicitudDTO> obtenerTodos() {
        List<SolicitudDTO> resultado = new ArrayList<>();

        Query query = entityManager.createQuery("SELECT object(s) FROM SolicitudEntity s");
        List<SolicitudEntity> lista = query.getResultList();

        for(SolicitudEntity entity : lista){
            resultado.add(new SolicitudDTO().build(entity));
        }

        return resultado;
    }

    @Override
    public SolicitudDTO aprobarSolicitud(Long idSolicitud) {
        return cambiarEstadoSolicitud(idSolicitud, EstadoSolicitudEnum.APROBADO);
    }

    @Override
    public SolicitudDTO rechazarSolicitud(Long idSolicitud) {
        return cambiarEstadoSolicitud(idSolicitud, EstadoSolicitudEnum.RECHAZADO);
    }

    @Override
    public SolicitudDTO cambiarEstadoSolicitud(Long idSolicitud, EstadoSolicitudEnum estado) {
        if (idSolicitud != null && estado != null){
            try {
                Query query = entityManager.createQuery("SELECT object(s) FROM SolicitudEntity s WHERE s.id = :id");
                query.setParameter("id", idSolicitud);
                SolicitudEntity entity = (SolicitudEntity) query.getSingleResult();

                if (entity != null) {
                    entity.setEstado(estado);

                    entityManager.merge(entity);
                    entityManager.flush();

                    logBean.registrarLog(ILog.ORIGEN_BO, ILog.ORIGEN_BO, ILog.SERVICIO_CAMBIO_ESTADO_SOLICITUD, "ID: " +idSolicitud + " - ESTADO:"+ estado.toString());

                    return new SolicitudDTO().build(entity);
                }
            } catch (Exception e){
                logBean.registrarLog(ILog.ORIGEN_BO, ILog.ORIGEN_BO, ILog.SERVICIO_CAMBIO_ESTADO_SOLICITUD, e.toString());
            }
        }
        return null;
    }
}
