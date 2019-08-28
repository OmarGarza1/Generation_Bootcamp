package com.practica.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practica.model.Clientes;
import com.practica.model.Telefonos;

@WebServlet("/CreateClientServlet")
public class CreateClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json charset='utf-8'");
		PrintWriter salida = response.getWriter();
		//salida.append("Estamos en el servlet");
		Configuration cfg = new Configuration();
		SessionFactory miFactory = cfg.configure().buildSessionFactory();
		Session miSesion = miFactory.openSession();
		
		Set<Telefonos> misTelefonos = new HashSet<Telefonos>();
		Telefonos miTelefono = new Telefonos("16","16","Night");
		misTelefonos.add(miTelefono);
		Clientes miCliente = new Clientes(request.getParameter("txtIdCliente"), request.getParameter("txtNombreCliente"), request.getParameter("txtDomicilioCliente"), null);
		miSesion.beginTransaction();
		//System.out.println(miCliente.toString());
		miSesion.save(miCliente);
		miSesion.getTransaction();
		miSesion.close();
		salida.close();
	}

}