package com.singleton.model;

import java.io.FileNotFoundException;

public class Empleado {

	private String nombre;

	private static Empleado instanciaEmpleado = null;

	private Empleado() {

	}

	public static Empleado getInstance() {
		if (instanciaEmpleado == null) {
			return instanciaEmpleado = new Empleado();

		} else {
			return instanciaEmpleado;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}
}
