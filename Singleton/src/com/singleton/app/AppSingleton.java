package com.singleton.app;

import com.singleton.model.Empleado;

public class AppSingleton {

	public static void main(String[] args) {

		System.out.println("Objeto 1---------------");
		Empleado miEmpleado = Empleado.getInstance();
		miEmpleado.setNombre("Omar");
		System.out.println("Nombre:" + miEmpleado.getNombre());
		
		System.out.println("Objeto 2---------------");
		Empleado miEmpleado2 = Empleado.getInstance();
		miEmpleado.setNombre("Lalo");
		System.out.println("Nombre:" + miEmpleado2.getNombre());
		
		System.out.println("Objeto 1 y 2 ---------------");
		System.out.println("Nombre:" + miEmpleado.getNombre());
		System.out.println("Nombre:" + miEmpleado2.getNombre());
		

	}
}
