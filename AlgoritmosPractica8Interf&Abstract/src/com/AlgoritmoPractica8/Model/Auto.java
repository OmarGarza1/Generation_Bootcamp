package com.AlgoritmoPractica8.Model;

public class Auto extends Vehiculo
{

	private int modelo;

	public void GiroIzq(Double ratio)
	{
	}

	public void GiroDer(Double ratio)
	{
	}

	public int GetModelo() 
	{
		return modelo;
	}
	
	public void SetModelo(int modelo) 
	{
		this.modelo = modelo;
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + " Modelo " + modelo;
		/*
		return "MaxFuel: " + maxFuel + " Max Numero pasajeros: " + maxNmoPasajeros +
				" Velocidad: "+ velocidad + " Modelo: "+ modelo;
				*/
	}

	@Override
	public void acelerar(double ratio) {
		// TODO Auto-generated method stub
		
	}
	
}
