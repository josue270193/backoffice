package edu.uade.integracion.beans;

import edu.uade.integracion.dto.ServicioDTO;
import edu.uade.integracion.dto.TipoServicioDTO;
import edu.uade.integracion.entities.ServicioEntity;
import edu.uade.integracion.entities.TipoServicioEntity;
import edu.uade.integracion.interfaces.IServicio;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Stateless
@LocalBean
public class ServicioBean implements IServicio {

    @PersistenceContext(unitName = "puBO")
    private EntityManager entityManager;

    @Override
    public List<TipoServicioDTO> obtenerTipoServiciosTodos() {
        List<TipoServicioDTO> resultado = new ArrayList<>();

        Query query = entityManager.createQuery("SELECT object(t) FROM TipoServicioEntity t");
        List<TipoServicioEntity> lista = query.getResultList();

        for(TipoServicioEntity entity : lista){
            resultado.add(new TipoServicioDTO().build(entity));
        }

        return resultado;
    }

    @Override
    public List<ServicioDTO> obtenerServiciosTodos() {
        List<ServicioDTO> resultado = new ArrayList<>();

        Query query = entityManager.createQuery("SELECT object(s) FROM ServicioEntity s");
        List<ServicioEntity> lista = query.getResultList();

        for(ServicioEntity entity : lista){
            resultado.add(new ServicioDTO().build(entity));
        }

        return resultado;
    }

    @Override
    public List<ServicioDTO> obtenerServiciosPorTipoServicioNombre(String nombre) {
        List<ServicioDTO> resultado = new ArrayList<>();

        Query query = entityManager.createQuery("SELECT object(s) FROM ServicioEntity s WHERE s.tipoServicio.nombre = :nombre");
        query.setParameter("nombre", nombre);
        List<ServicioEntity> lista = query.getResultList();

        for(ServicioEntity entity : lista){
            resultado.add(new ServicioDTO().build(entity));
        }

        return resultado;
    }

    @Override
    public List<ServicioDTO> obtenerServiciosPorTipoServicioId(Long id) {
        List<ServicioDTO> resultado = new ArrayList<>();

        Query query = entityManager.createQuery("SELECT object(s) FROM ServicioEntity s WHERE s.tipoServicio.id = :id");
        query.setParameter("id", id);
        List<ServicioEntity> lista = query.getResultList();

        for(ServicioEntity entity : lista){
            resultado.add(new ServicioDTO().build(entity));
        }

        return resultado;
    }
}
