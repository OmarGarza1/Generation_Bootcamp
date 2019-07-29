package com.algoritmospractica1.application;

import java.util.Scanner;

public class AlgoritmosPractica1Application {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String nombre;
		double salarioMensual;
		int nNombre;
		
		// Operacion de imprimir en pantalla
		System.out.println("Hola Mundo");
		
		// Aceptar entrada del usuario
		//System.out.println("Dame tu nombre: ");	
		//nombre = scan.nextLine();
		//System.out.println("En nombre introducido es "+ nombre);
		
	/////////////////////////////////////////////////////////////////////////////////////////
		/*
		System.out.println("Introduce tu salario mensual: ");
		salarioMensual=  scan.nextDouble();
		final double SALARIO_MENSUAL_PROMEDIO = 10000;
		
		if(salarioMensual == 0) 
		{
			System.out.println("Bien");
		}else if(salarioMensual > 0 && salarioMensual < SALARIO_MENSUAL_PROMEDIO) 
		{
			System.out.println("Salario Minimo");
		}else if(salarioMensual > SALARIO_MENSUAL_PROMEDIO) 
		{
			System.out.println("muy bueno");
		}
		*/
		/////////////////////////////////////////////////////////////////////////////////////////
		/*
		System.out.println("Cuantas veces quieres mostrar tu nombre:");
		nNombre = scan.nextInt();
		
		System.out.println("Ciclo for");
		// Ciclo for 
		for(int i = 0 ; i < nNombre; i++) 
		{
			System.out.println("Omar");
		}
		System.out.println("Ciclo while");
		// Ciclo while
		int i = 0;
		while( i < nNombre) 
		{
			System.out.println("Omar");
			i++;
		}
		System.out.println("Ciclo do while");
		// Ciclo do while
		 i = 0;
	
		do{
			System.out.println("Omar");
			i++;
		}	while( i < nNombre) ;
		
			*/
/////////////////////////////////////////////////////////////////////////////////////////

		//el mes del año
		/*
		int mes = 0;
		System.out.println("Dame un numero");
		mes = scan.nextInt();
		
		switch(mes) 
		{
		case 1: 
			System.out.println("Enero");
			break;
		case 2: 
			System.out.println("Febrero");
			break;
		case 3: 
			System.out.println("Marzo");
			break;
		case 4: 
			System.out.println("Abril");
			break;
		case 5: 
			System.out.println("Mayo");
			break;
		case 6: 
			System.out.println("Junio");
			break;
		case 7: 
			System.out.println("Julio");
			break;
		case 8: 
			System.out.println("Agosto");
			break;
		case 9: 
			System.out.println("Septiembre");
			break;
		case 10: 
			System.out.println("Octubre");
			break;
		case 11: 
			System.out.println("Noviembre");
			break;
		case 12: 
			System.out.println("Diciembre");
			break;
		default: 
			System.out.println("No reconocido");
		}
		*/
	
		int mes = 0;
		while(mes <= 0 || mes > 12) 
		{
			
			
			System.out.println("Dame un numero");
			mes = scan.nextInt();

			switch(mes) 
			{
			case 1: 
				System.out.println("Enero");
				break;
			case 2: 
				System.out.println("Febrero");
				break;
			case 3: 
				System.out.println("Marzo");
				break;
			case 4: 
				System.out.println("Abril");
				break;
			case 5: 
				System.out.println("Mayo");
				break;
			case 6: 
				System.out.println("Junio");
				break;
			case 7: 
				System.out.println("Julio");
				break;
			case 8: 
				System.out.println("Agosto");
				break;
			case 9: 
				System.out.println("Septiembre");
				break;
			case 10: 
				System.out.println("Octubre");
				break;
			case 11: 
				System.out.println("Noviembre");
				break;
			case 12: 
				System.out.println("Diciembre");
				break;
			default: 
				System.out.println("No reconocido");
			}
			
		}
		
	}
}
