package edu.uade.integracion.backoffice.webservice.soap;

import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.dto.enumerado.TipoSolicitudEnum;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class SolicitudResource {

    @WebMethod
    public SolicitudDTO prestadorAutorizado(Long id) {

        SolicitudDTO dto = new SolicitudDTO();
        dto.setId(id);
        dto.setTipo(TipoSolicitudEnum.AGENCIA);
        dto.setEstado(EstadoSolicitudEnum.APROBADO);
        dto.setDetalle("DETALLE");

        return dto;
    }
}
