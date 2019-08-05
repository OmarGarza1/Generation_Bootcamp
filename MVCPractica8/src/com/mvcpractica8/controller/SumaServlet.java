package com.mvcpractica8.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumaServlet
 */
@WebServlet("/SumaServlet")
public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int mensaje = Integer.parseInt(request.getParameter("number1"));
		int mensaje2 = Integer.parseInt(request.getParameter("number2"));
		int res = mensaje + mensaje2;
		response.getWriter().append("La suma es: " + res);
			
	}

}
