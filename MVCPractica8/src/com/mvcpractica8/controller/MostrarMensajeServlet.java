package com.mvcpractica8.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostrarMensajeServlet
 */
@WebServlet("/MostrarMensajeServlet")
public class MostrarMensajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String mensaje = request.getParameter("txtMensaje");
		response.getWriter().append("Bienvenido, tu mensaje es: " + mensaje);
		
	}

}
