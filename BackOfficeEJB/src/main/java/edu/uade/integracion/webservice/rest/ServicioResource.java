package edu.uade.integracion.webservice.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.uade.integracion.beans.ServicioBean;
import edu.uade.integracion.dto.ServicioDTO;
import edu.uade.integracion.dto.TipoServicioDTO;

@Stateless
@Path("/")
public class ServicioResource {

    @EJB
    private ServicioBean servicioBean;

    @GET
    @Path("/GetServicios")
    @Produces(APPLICATION_JSON)
    public List<ServicioDTO> obtenerTodoServicios() {

        List<ServicioDTO> lista = servicioBean.obtenerServiciosTodos();
        return lista;
    }

    @GET
    @Path("/GetTiposServicios")
    @Produces(APPLICATION_JSON)
    public List<TipoServicioDTO> obtenerTodoTipoServicios() {

        List<TipoServicioDTO> lista = servicioBean.obtenerTipoServiciosTodos();
        return lista;
    }

    @POST
    @Path("/GetServiciosPorTipo")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    public List<ServicioDTO> obtenerServiciosPorTipo(TipoServicioDTO tipoServicioDTO) {

        if (tipoServicioDTO != null){
            List<ServicioDTO> lista;

            if (tipoServicioDTO.getNombre() != null){
                lista = servicioBean.obtenerServiciosPorTipoServicioNombre(tipoServicioDTO.getNombre());
            } else if (tipoServicioDTO.getId() != null) {
                lista = servicioBean.obtenerServiciosPorTipoServicioId(tipoServicioDTO.getId());
            } else {
                lista = new ArrayList<>();
            }
            return lista;
        } else {
            return obtenerTodoServicios();
        }
    }
}
