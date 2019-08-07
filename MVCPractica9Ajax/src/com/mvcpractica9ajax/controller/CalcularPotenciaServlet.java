package com.mvcpractica9ajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcpractica9ajax.model.Matematicas;

/**
 * 
 * @author Omar
 * @version 1.0
 * @since 06 Agosto 2019
 * 
 */

/**
 * 
 * Este Servlet hace uso de la clase matemáticas para realizar el calculo de la pontencia
 *
 */
@WebServlet("/CalcularPotenciaServlet")
@MultipartConfig
public class CalcularPotenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	/**
	 * Este método cacha el valor de la base y del exponente del frontend
	 * 
	 * @param request Es el objeto request de mi servlet
	 * @param response Es el objeto response de mi servlet
	 * @return No genera ningun valor en el return porque crea la salida en el objeto response
	 * @see com.mvcpractica9ajax.model.Matematicas
	 * 
	 * 
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estamos en el Servlet");
		int base = Integer.parseInt(request.getParameter("txtBase"));
		int potencia = Integer.parseInt(request.getParameter("txtPotencia"));
		
		int respuesta = Matematicas.calcularPotencia(base, potencia);
		
		response.setContentType("text/html");
		response.getWriter().append("La potencia es:" + respuesta);
		
	}

}
