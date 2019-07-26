package com.mvcpractica3basics.model;

public class Perrito {

	private String nombre;
	private int tamano;
	private int edad;
	private String personalidad;

	public Perrito(String nombre, int tamano, int edad, String personalidad) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.edad = edad;
		this.personalidad = personalidad;
	}

	public Perrito() {
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPersonalidad() {
		return personalidad;
	}

	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}

}
