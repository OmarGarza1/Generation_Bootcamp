package com.singleton.model;

public class Empleado {

	private static Empleado instanciaEmpleado = null;

	private Empleado() {

	}

	public static Empleado getInstancia() {
		if (instanciaEmpleado == null) {
			instanciaEmpleado = new Empleado();

		}
		return instanciaEmpleado;
	}
}
