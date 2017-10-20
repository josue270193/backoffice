package com.tpo.backoffice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("inputEmail");
		String p=request.getParameter("inputPassword");
		
		System.out.print("email: " + n);
		System.out.print("pass: " + p);
		
		if(n.equalsIgnoreCase("user@gmail.com") && p.equalsIgnoreCase("12345")){
			//RequestDispatcher rd=request.getRequestDispatcher("Panel");
			//rd.forward(request,response);
			
			response.sendRedirect("panel.jsp");
		}else{
			out.print("Email o password incorrecto");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request,response);
		}
		
		out.close();
	}

}
