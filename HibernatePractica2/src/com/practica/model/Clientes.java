package com.practica.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Clientes {

	@Id
	private String idCliente;
	@Column
	private String nombreCliente;
	@Column
	private String domicilio;
	@Id
	private ArrayList<Telefonos> listaTelefono;

	public Clientes() {

	}

	public Clientes(String idCliente, String nombreCliente, String domicilio, ArrayList<Telefonos> listaTelefono) {
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.domicilio = domicilio;
		this.listaTelefono = listaTelefono;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", domicilio=" + domicilio
				+ ", idTelefono=" + listaTelefono + "]";
	}

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "idTelefono")
	public ArrayList<Telefonos> getListaTelefono() {
		return listaTelefono;
	}

	public void setListaTelefono(ArrayList<Telefonos> listaTelefono) {
		this.listaTelefono = listaTelefono;
	}

}
