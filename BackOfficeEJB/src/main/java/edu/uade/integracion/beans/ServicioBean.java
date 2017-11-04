package edu.uade.integracion.beans;

import edu.uade.integracion.interfaces.IServicio;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@LocalBean
public class ServicioBean implements IServicio {

    @PersistenceContext(unitName = "puBO")
    private EntityManager entityManager;

    @Override
    public String obtenerTodoServicios() {
        Query query = entityManager.createQuery("FROM ServicioEntity s");
        List lista = query.getResultList();
        return "lista " + lista.size();
    }
}
