package edu.uade.integracion.webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SolicitudResource {

    @WebMethod
    public String prestadorAutorizado(String json) {
        return json;
    }
}
