package com.practica.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {
	@Id
	@Column
	private String idclientes;
	@Column
	private String nombreCliente;
	@Column
	private String domicilioCliente;
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "idTelefono")
	private Set<Telefonos> listaTelefonos;

	public Clientes() {
	}

	public Clientes(String idCliente, String nombreCliente, String domicilioCliente, Set<Telefonos> listaTelefonos) {
		super();
		this.idclientes = idCliente;
		this.nombreCliente = nombreCliente;
		this.domicilioCliente = domicilioCliente;
		this.listaTelefonos = listaTelefonos;
	}

	public String getIdCliente() {
		return idclientes;
	}

	public void setIdCliente(String idclientes) {
		this.idclientes = idclientes;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDomicilioCliente() {
		return domicilioCliente;
	}

	public void setDomicilioCliente(String domicilioCliente) {
		this.domicilioCliente = domicilioCliente;
	}

	public Set<Telefonos> getListaTelefonos() {
		return listaTelefonos;
	}

	public void setListaTelefonos(Set<Telefonos> listaTelefonos) {
		this.listaTelefonos = listaTelefonos;
	}

	@Override
	public String toString() {
		return "Clientes [idclientes=" + idclientes + ", nombreCliente=" + nombreCliente + ", domicilioCliente="
				+ domicilioCliente + ", listaTelefonos=" + listaTelefonos + "]";
	}

}