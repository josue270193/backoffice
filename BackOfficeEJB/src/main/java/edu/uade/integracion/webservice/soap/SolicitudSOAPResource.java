package edu.uade.integracion.webservice.soap;

import edu.uade.integracion.beans.SolicitudBean;
import edu.uade.integracion.dto.SolicitudDTO;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;
import edu.uade.integracion.dto.enumerado.TipoSolicitudEnum;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Stateless
@WebService(name = "Solicitud", portName = "SolicitudPort")
@SOAPBinding()
public class SolicitudSOAPResource {

    @EJB
    private SolicitudBean solicitudBean;

    @WebMethod
    public SolicitudDTO getPrestadorAutorizado(Long id) {

        SolicitudDTO dto = new SolicitudDTO();
        dto.setId(id);
        dto.setTipo(TipoSolicitudEnum.AGENCIA);
        dto.setEstado(EstadoSolicitudEnum.APROBADO);
        dto.setDetalle("DETALLE");

        return dto;
    }
}
