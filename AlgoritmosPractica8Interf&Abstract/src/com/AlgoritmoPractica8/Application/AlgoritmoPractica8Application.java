package com.AlgoritmoPractica8.Application;

import com.AlgoritmoPractica8.Model.Auto;
import com.AlgoritmoPractica8.Model.Avion;
import com.AlgoritmoPractica8.Model.Vehiculo;

public class AlgoritmoPractica8Application 
{
	public static void main(String[] args) 
	{
		
		Vehiculo miVehiculo = new Auto();
		Vehiculo miSegundoVehiculo = new Avion();
		
	
		
		//Caracteristicas  del auto
		Auto miAuto = new Auto();
		miAuto.SetMaxFuel(200);
		miAuto.SetMaxNmoPasajeros(4);
		miAuto.SetVelocidad(200);
		miAuto.SetModelo(2010);
		System.out.println(miAuto.toString());
		
		//Caracteristicas  del avion
		Avion miAvion = new Avion();
		miAvion.SetMaxFuel(1000);
		miAvion.SetMaxNmoPasajeros(50);
		miAvion.SetVelocidad(6000);
		miAvion.SetnroDeMotores(5);
		miAvion.SetMaxAltitud(10000);
		System.out.println(miAvion.toString());
		
		
	}
}
