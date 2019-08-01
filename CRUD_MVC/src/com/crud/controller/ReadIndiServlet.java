package com.crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.model.Producto;

/**
 * Servlet implementation class CreateIndiServlet
 */
@WebServlet("/ReadIndiServlet")
public class ReadIndiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = "root";
		String pass = "root";

		String urlServidor = "jdbc:mysql://localhost:3306/greencho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;

		String idProducto = request.getParameter("txtID");

		Producto objProducto = new Producto();

		objProducto.setIdProducto(idProducto);

		String sentenciaSQL = "Select * from productos where idproducto = " + objProducto.getIdProducto() + ";";
		PrintWriter salida = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn = DriverManager.getConnection(urlServidor, user, pass);
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sentenciaSQL);

			while (rs.next()) {

				salida.append("<table>");
				salida.append("<th>");
				salida.append("<td>");
				salida.append("idProducto");
				salida.append("</td>");
				salida.append("<td>");
				salida.append("nombreProducto");
				salida.append("</td>");
				salida.append("<td>");
				salida.append("precioProducto");
				salida.append("</td>");
				salida.append("<td>");
				salida.append("existencias");
				salida.append("<br>");
				salida.append("</th>");

				salida.append("<tr>");
				salida.append("<td>");
				salida.append("</td>");
				salida.append("<td>");
				salida.append(rs.getString(1));
				salida.append("</td>");
				salida.append("<td>");
				salida.append(rs.getString(2));
				salida.append("</td>");
				salida.append("<td>");
				salida.append("" + rs.getDouble(3));
				salida.append("</td>");
				salida.append("<td>");
				salida.append(rs.getString(4));
				salida.append("</td>");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Paso 7 - Cerrar las conexiones.
				stmnt.close();
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
