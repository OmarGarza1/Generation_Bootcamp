package com.AlgoritmoPractica8.Model;

public class Avion extends Vehiculo {

	private double maxAltitud;
	private int nroDeMotores;
	 
	public void Ascender(double ratio) {}
	public void Descender(double ratio) {}
	
	public double GetMaxAltitud() 
	{
		return maxAltitud;
	}
	
	public void SetMaxAltitud(double maxAltitud) 
	{
		this.maxAltitud = maxAltitud;
	}
	
	public int GetnroDeMotores() 
	{
		return nroDeMotores;
	}
	
	public void SetnroDeMotores(int nroDeMotores) 
	{
		this.nroDeMotores = nroDeMotores;
	}

	@Override
	public String toString() 
	{
		return super.toString() +  " Max Altitud: "+ maxAltitud + " Numero de Motores " + nroDeMotores;
	}
	@Override
	public void acelerar(double ratio) {
		// TODO Auto-generated method stub
		
	}


}
