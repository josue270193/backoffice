package edu.uade.integracion.backoffice.servlet;

import edu.uade.integracion.backoffice.servlet.base.ServletBase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends ServletBase {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);

        PrintWriter out = response.getWriter();

        String n = request.getParameter("inputEmail");
        String p = request.getParameter("inputPassword");

        RequestDispatcher rd = request.getRequestDispatcher(resolverJSP("index.jsp"));

        if (n == null && p == null) {
            rd.include(request, response);
        } else {
            if (    n.equalsIgnoreCase("admin") &&
                    p.equalsIgnoreCase("123456789")
            ) {
                ServletContext sc = getServletContext();
                sc.getRequestDispatcher("/Panel").forward(request, response);

            } else {
                out.print("Email o password incorrecto");
                rd.include(request, response);
            }
        }

        out.close();
    }
}
