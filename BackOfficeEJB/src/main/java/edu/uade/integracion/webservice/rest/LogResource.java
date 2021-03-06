package edu.uade.integracion.webservice.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.uade.integracion.beans.LogBean;
import edu.uade.integracion.dto.LogDTO;

@Stateless
@Path("/")
public class LogResource {

    @EJB
    private LogBean logBean;

    @POST
    @Path("/RegistrarLog")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    public LogDTO crearSolicitud(LogDTO log) {

        LogDTO dto = logBean.registrarLog(log);
        return dto;
    }
}
