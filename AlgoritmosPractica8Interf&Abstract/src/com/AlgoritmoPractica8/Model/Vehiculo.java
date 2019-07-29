package com.AlgoritmoPractica8.Model;

public abstract class Vehiculo implements Vehicleable, NavesEspacialables
{
	protected double maxFuel;
	protected int maxNmoPasajeros;
	protected double velocidad;

	public void Acelerar(double aceleracion) {
		this.velocidad = velocidad + aceleracion;
	}

	public void desacelerar(double desaceleracion) {
		this.velocidad = velocidad - desaceleracion;
	}
	
	public double GetMaxFuel() 
	{
		return maxFuel;
	}
	
	public void SetMaxFuel(double maxFuel) 
	{
		this.maxFuel = maxFuel;
	}
	
	public int GetMaxNmoPasajeros() 
	{
		return maxNmoPasajeros;
	}
	
	public void SetMaxNmoPasajeros(int maxNmoPasajeros) 
	{
		this.maxNmoPasajeros = maxNmoPasajeros;
	}
	
	public double GetVelocidad() 
	{
		return velocidad;
	}
	
	public void SetVelocidad(double velocidad) 
	{
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() 
	{
		return "MaxFuel: " + maxFuel + " Max Numero pasajeros: " + maxNmoPasajeros + " Velocidad: "+ velocidad;
	}
}
