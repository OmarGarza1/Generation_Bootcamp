package com.mvcpractica2basics.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SumaServlet")
public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		response.getWriter().append("Suma , get");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		int numero1 = Integer.parseInt(request.getParameter("txtNumero1"));
		int numero2 =  Integer.parseInt(request.getParameter("txtNumero2"));
		int suma = numero1 + numero2;
		response.setContentType("text/html");
		
		PrintWriter salida = response.getWriter();
		
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<title>");
		salida.append("Practica 2");
		salida.append("</title>");
		salida.append("</head>");
		salida.append("<body>");
		salida.append("<h2>");
		salida.append("Practica 2");
		salida.append("</h2>");
		salida.append("<p>");
		salida.append("La suma de los numeros es:" + suma);
		salida.append("</p>");
		salida.append("</body>");
		salida.append("</html>");
		
		salida.close();
	}

}
