package com.crud.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.model.Producto;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idProducto = request.getParameter("txtID");
		String nombreProducto = request.getParameter("txtName");
		double precioProducto = Double.parseDouble(request.getParameter("txtPrice"));
		int existencias = Integer.parseInt(request.getParameter("txtExist"));

		Producto objProducto = new Producto();

		objProducto.setIdProducto(idProducto);
		objProducto.setNombreProducto(nombreProducto);
		objProducto.setPrecioProducto(precioProducto);
		objProducto.setExistencias(existencias);

		// pasos para conectar con la base de datos
		// Paso 1 - Declarar las variables de acceso
		String user = "root";
		String pass = "root";
		String urlServidor = "jdbc:mysql://localhost:3306/greencho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sentenciaSQL = "";

		// Paso 2 - Declarar los objetos de conexcion
		Connection conn = null;
		Statement stmnt = null;
		int nRegistros = 0;

		try {
			// Paso 3 - Incializar el driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

			// Paso 4 - Abrir la conexion
			conn = DriverManager.getConnection(urlServidor, user, pass);
			stmnt = conn.createStatement();

			// Paso 5 - Preparar el comando SQL a ejecutar
			sentenciaSQL = "UPDATE productos SET nombreProducto = '" + objProducto.getNombreProducto() 
					+ "', precioProducto = " + objProducto.getPrecioProducto()
					+ ",  existencias = " + objProducto.getExistencias() 
					+ " WHERE idProducto = '" + objProducto.getIdProducto()  + "';";

			// Paso 6 - ejecutar el comando SQL en la BD
			nRegistros = stmnt.executeUpdate(sentenciaSQL);

			if (nRegistros > 0) {
				response.getWriter().print("Si se modifico el registro");
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
