package com.algoritmospractica4.application;

import java.util.Scanner;

import com.algoritmospractica4.model.OperacionesMatematicas;

public class AlgoritmosPracticaApplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		OperacionesMatematicas objOperaciones = new OperacionesMatematicas();

		System.out.println("Ingrese el valor1");
		double val1 = scan.nextDouble();
		System.out.println("Ingrese el valor2");
		double val2 = scan.nextDouble();

		objOperaciones.setNumero1(val1);
		objOperaciones.setNumero2(val2);

		System.out.println("La suma es :" + objOperaciones.suma());

	}

}
