package edu.uade.integracion.backoffice.servlet;

import edu.uade.integracion.backoffice.servlet.base.ServletBase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Reporte extends ServletBase {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);

        PrintWriter out = response.getWriter();

        RequestDispatcher rd = request.getRequestDispatcher(resolverJSP("reportes.jsp"));
        rd.include(request, response);

        out.close();
    }
}
