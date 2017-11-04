package edu.uade.integracion.backoffice.webservice.rest;

import edu.uade.integracion.beans.ServicioBean;
import edu.uade.integracion.dto.ServicioDTO;
import edu.uade.integracion.dto.TipoServicioDTO;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
public class ServicioResource {

    @EJB
    private ServicioBean servicioBean;

    @GET
    @Path("/GetServicios")
    @Produces(APPLICATION_JSON)
    public List<ServicioDTO> obtenerTodoServicios() {

        List<ServicioDTO> lista = new ArrayList<>();

        ServicioDTO servicioDTO = new ServicioDTO();
        servicioDTO.setId(1l);
        servicioDTO.setNombre("NOMBRE");


        lista.add(servicioDTO);

//        return Response.status(200).entity(lista).build();
        return lista;

    }

    @GET
    @Path("/GetTipoServicios")
    @Produces(APPLICATION_JSON)
    public Response obtenerTodoTipoServicios() {

        String output = "{}";

        return Response.status(200).entity(output).build();

    }

    @POST
    @Path("/GetServiciosPorTipo")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    public List<ServicioDTO> obtenerServiciosPorTipo(TipoServicioDTO tipoServicioDTO) {

//        String output = "{}";
//
//        return Response.status(200).entity(output).build();
        List<ServicioDTO> lista = new ArrayList<>();

        ServicioDTO servicioDTO = new ServicioDTO();
        servicioDTO.setId(1l);
        servicioDTO.setNombre("NOMBRE");


        lista.add(servicioDTO);

        return lista;
    }
}
