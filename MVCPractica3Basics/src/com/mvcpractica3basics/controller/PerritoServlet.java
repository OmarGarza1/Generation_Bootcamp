package com.mvcpractica3basics.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvcpractica3basics.model.Perrito;

@WebServlet("/PerritoServlet")
public class PerritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("txtNombre");
		int tamano = Integer.parseInt(request.getParameter("txtTamano"));
		int edad = Integer.parseInt(request.getParameter("txtEdad"));
		String perso = request.getParameter("txtPerso");

		Perrito objPerru = new Perrito();

		objPerru.setNombre(nombre);
		objPerru.setTamano(tamano);
		objPerru.setEdad(edad);
		objPerru.setPersonalidad(perso);
		
		response.setContentType("application/json");
		PrintWriter salida = response.getWriter();
		salida.append("{"
				+ "\"nombre\":\"" + objPerru.getNombre() + "\","
				+ "\"edad\":" +objPerru.getEdad() + ","
				+ "\"Tamano\":" +objPerru.getTamano() + ","
				+ "\"Personalidad\":\"" +objPerru.getPersonalidad() 
				+ "\"}");
		salida.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
