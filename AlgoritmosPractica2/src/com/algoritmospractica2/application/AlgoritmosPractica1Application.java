package com.algoritmospractica2.application;

public class AlgoritmosPractica1Application 
{

	public static void main(String[] args) 
	{
		//saludo();
		//saludoConNombre("Omar");
		System.out.println("La suma es " + sumaNumeros(5,8));
	}
	
	public static void saludo() 
	{
		System.out.println("Hola Mundo");
	}
	
	public static void saludoConNombre(String nombre) 
	{
		System.out.println("Hola " + nombre);
	}

	public static int sumaNumeros(int numero, int numero2) 
	{
		int suma =0;
		suma = numero + numero2;
		
		return suma;
	}
}
