package edu.uade.integracion.beans;

import edu.uade.integracion.dto.LogDTO;
import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.entities.LogEntity;
import edu.uade.integracion.entities.SolicitudEntity;
import edu.uade.integracion.interfaces.ILog;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import java.util.Date;

@Stateless
@LocalBean
public class LogBean implements ILog {

    @PersistenceContext(unitName = "puBO")
    private EntityManager entityManager;

    @Override
    public LogDTO registrarLog(LogDTO log) {
        if (log != null){
            return registrarLog(log.getPlataformaEnvia(), log.getPlataformaRecibe(), log.getServicio(), log.getObservacion());
        }
        return null;
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    @Override
    public LogDTO registrarLog(String platadormaEnvia, String plataformaRecibe, String servicio, String observacion) {
        try {
            LogEntity entity = new LogEntity();
            entity.setFecha(new Date());
            entity.setPlataformaEnvia(platadormaEnvia);
            entity.setPlataformaRecibe(plataformaRecibe);
            entity.setServicio(servicio);
            entity.setObservacion(observacion);

            entityManager.persist(entity);
            entityManager.flush();

            return new LogDTO().build(entity);
        } catch (Exception e){
            registrarLog(ILog.ORIGEN_BO, ILog.ORIGEN_BO, ILog.SERVICIO_REGISTRAR_LOG, e.toString());
        }
        return null;
    }

}
