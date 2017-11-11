package edu.uade.integracion.webservice.rest;

import edu.uade.integracion.beans.ServicioBean;
import edu.uade.integracion.dto.ServicioDTO;
import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.TipoServicioDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

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
    @Path("/GetTipoServicios")
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
