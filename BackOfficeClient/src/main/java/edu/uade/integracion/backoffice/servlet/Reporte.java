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
import edu.uade.integracion.beans.LogBean;
import edu.uade.integracion.dto.LogDTO;

public class Reporte extends ServletBase {

	private static final long serialVersionUID = 1L;

	@EJB
    private LogBean logBean;
	
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);

        PrintWriter out = response.getWriter();
        List<LogDTO> logs = logBean.obtenerTodos();
        
        request.setAttribute("lista", logs);
        
        RequestDispatcher rd = request.getRequestDispatcher(resolverJSP("reportes.jsp"));        
        rd.include(request, response);

        out.close();
    }
}
