package com.algoritmospractica10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlgoritmosPractica10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 1;
		char respuesta = 's';
		String res;

		do {
			try {
				System.out.println("Introduce un numero entero : ");
				num = scan.nextInt();
				System.out.println(String.format("El numero introducido es %d", num * num));
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("El error es " + e);
			} finally {
				System.out.println("Cerrado");
			}

			System.out.println("Desas calcular otro numero? (S para calcular otro numero)");
			res = scan.next();
			res = res.toLowerCase();
			respuesta = res.charAt(0);
		} while (respuesta == 's');

	}

}
