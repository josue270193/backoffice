package edu.uade.integracion.backoffice.webservice.rest;

import edu.uade.integracion.beans.ServicioBean;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class ServicioResource {

    @EJB
    private ServicioBean servicioBean;

    @GET
    @Path("/GetServicios")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerTodoServicios() {

        String output = "1 " + servicioBean.obtenerTodoServicios();

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/GetTipoServicios")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerTodoTipoServicios() {

        String output = "2";

        return Response.status(200).entity(output).build();

    }

    @POST
    @Path("/GetServiciosPorTipo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg(
            @PathParam("param") String msg
    ) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }
}
