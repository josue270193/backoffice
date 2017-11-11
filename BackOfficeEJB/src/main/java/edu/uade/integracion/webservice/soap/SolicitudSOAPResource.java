package edu.uade.integracion.webservice.soap;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;

import edu.uade.integracion.beans.SolicitudBean;
import edu.uade.integracion.dto.SolicitudDTO;

@Stateless
@WebService(name = "PrestadorAutorizado", portName = "SolicitudPort")
@SOAPBinding()
public class SolicitudSOAPResource {

    @EJB
    private SolicitudBean solicitudBean;

    @WebMethod
    public @WebResult(name="solicitud") SolicitudDTO getPrestadorAutorizado(
    		@WebParam(name="id") @XmlElement(required = true) Long id
	) {
    	SolicitudDTO dto = null;
    	if (id != null){
    		dto = solicitudBean.obtenerSolicitudPorId(id);
    	}
    	return dto;
    }
}
