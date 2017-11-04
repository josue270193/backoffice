package edu.uade.integracion.webservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public class ServicioResource {

    @GET
    @Path("/GetServicios")
    public Response obtenerTodoServicios() {

        String output = "1";

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/GetTipoServicios")
    public Response obtenerTodoTipoServicios() {

        String output = "2";

        return Response.status(200).entity(output).build();

    }

    @POST
    @Path("/GetServiciosPorTipo")
    public Response getMsg(
            @PathParam("param") String msg
    ) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }
}
