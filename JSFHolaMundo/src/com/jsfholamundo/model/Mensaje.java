package com.jsfholamundo.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mensaji")
@SessionScoped
public class Mensaje {

	private String mensaje;

	public String diHola() 
	{
		return "hola";
	}
	
	public Mensaje() {

	}

	public Mensaje(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Mensaje [mensaje=" + mensaje + "]";
	}

}
