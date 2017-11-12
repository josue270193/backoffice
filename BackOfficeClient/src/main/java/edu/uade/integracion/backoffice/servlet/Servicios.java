package edu.uade.integracion.backoffice.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.uade.integracion.backoffice.servlet.base.ServletBase;
import edu.uade.integracion.beans.ServicioBean;
import edu.uade.integracion.dto.LogDTO;
import edu.uade.integracion.dto.ServicioDTO;
import edu.uade.integracion.dto.TipoServicioDTO;

public class Servicios extends ServletBase {

	private static final long serialVersionUID = 1L;

    @EJB
    private ServicioBean servicioBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);

        PrintWriter out = response.getWriter();

        List<ServicioDTO> servicios = servicioBean.obtenerServiciosTodos();
        servicios.sort(Comparator.comparing(o -> o.getTipo().getId()));
        request.setAttribute("lista", servicios);

        RequestDispatcher rd = request.getRequestDispatcher(resolverJSP("servicios.jsp"));
        rd.include(request, response);

        out.close();
    }
}
