package edu.uade.integracion.beans;

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

}
