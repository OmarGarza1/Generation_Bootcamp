package com.practica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Telefonos {

	@Id
	@Column
	private String idTelefono;
	@Column
	private String telefono;
	@Column
	private String horario;

	public Telefonos() {

	}

	public Telefonos(String idTelefono, String telefono, String horario) {
		this.idTelefono = idTelefono;
		this.telefono = telefono;
		this.horario = horario;
	}

	public String getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(String idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Telefonos [idTelefono=" + idTelefono + ", telefono=" + telefono + ", horario=" + horario + "]";
	}
	
	

}
