package edu.uade.integracion.backoffice.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.uade.integracion.backoffice.servlet.base.ServletBase;
import edu.uade.integracion.beans.SolicitudBean;
import edu.uade.integracion.dto.SolicitudDTO;

public class Solicitudes extends ServletBase {

	private static final long serialVersionUID = 1L;

    @EJB
    private SolicitudBean solicitudBean;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);

        PrintWriter out = response.getWriter();

        List<SolicitudDTO> solicitudes = solicitudBean.obtenerTodos();
        solicitudes.sort((o1, o2) -> {
            if (o1.getEstado().compareTo(o2.getEstado()) == 0){
                return o2.getId().compareTo(o1.getId());
            } else {
                return o1.getEstado().compareTo(o2.getEstado());
            }
        });
        request.setAttribute("lista", solicitudes);

        RequestDispatcher rd = request.getRequestDispatcher(resolverJSP("solicitudes.jsp"));
        rd.include(request, response);

        out.close();
    }
}
