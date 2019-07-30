package com.AlgoritmosPractica11.Applicacion;

import java.util.Scanner;

public class AlgoritmosPractica11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numerador;
		double denominador;

		double resultado;

		System.out.println("Introduce el numerdor: ");
		numerador = scan.nextDouble();

		System.out.println("Introduce el denominador");
		denominador = scan.nextDouble();

		scan.close();

		try 
		{
			resultado = numerador / denominador;
			System.out.println("El resultado de la division es : " + resultado);
		} catch (ArithmeticException e)
		{
			System.out.println("Error, division by zero");

		} finally 
		{

		}

	}

}
