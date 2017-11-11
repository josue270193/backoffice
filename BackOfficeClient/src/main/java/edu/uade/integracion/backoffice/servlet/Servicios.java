package edu.uade.integracion.backoffice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.uade.integracion.backoffice.servlet.base.ServletBase;

public class Servicios extends ServletBase {

	private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);

        PrintWriter out = response.getWriter();

        RequestDispatcher rd = request.getRequestDispatcher(resolverJSP("servicios.jsp"));
        rd.include(request, response);

        out.close();
    }
}
