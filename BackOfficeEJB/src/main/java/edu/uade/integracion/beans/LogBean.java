package edu.uade.integracion.beans;

import edu.uade.integracion.interfaces.ILog;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class LogBean implements ILog {

    @PersistenceContext(unitName = "puBO")
    private EntityManager entityManager;
}
