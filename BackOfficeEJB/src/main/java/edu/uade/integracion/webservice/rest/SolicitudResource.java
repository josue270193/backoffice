package edu.uade.integracion.webservice.rest;

import edu.uade.integracion.beans.SolicitudBean;
import edu.uade.integracion.dto.SolicitudDTO;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
public class SolicitudResource {

    @EJB
    private SolicitudBean solicitudBean;

    @POST
    @Path("/EnviarSolicitud")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    public SolicitudDTO crearSolicitud(SolicitudDTO solicitud) {

        SolicitudDTO dto = solicitudBean.crearSolicitud(solicitud);
        return dto;
    }
}
