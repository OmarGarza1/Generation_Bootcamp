package com.AlgoritmosPractica9.application;

import com.AlgoritmosPractica9.model.Cadenitas;

public class AlgoritmosPractica9Application {

	public static void main(String[] args) {

		String miCadenita = new String("Este es un texto de prueba para testear la clase cadena de la API de Java version 12. Por lo tanto es un test dummy que no sirve para nada");

		String miCadenita3 = new String("Este es un texto de prueba para testear la clase cadena de la API de Java version 12. Por lo tanto es un test dummy que no sirve para nada");

		String[] miCadenita2 = { "Texto 2","Texto 2","Texto 2","Texto 2" };

		miCadenita2[0] = "Hola";

		System.out.println(miCadenita2[0]);
		
		System.out.println(miCadenita.codePointCount(5, 10));
	
		// compareti
		if(miCadenita.compareTo(miCadenita3)==1)
		{
			System.out.println("Si son iguales");
		}
		
		
		//  compare to equals
		System.out.println(miCadenita.compareTo(miCadenita3));
		
		if(miCadenita.equals(miCadenita3)) 
		{	
			System.out.println("Si se puede");
		}
		
		
		// endwith startswith
		if(miCadenita.endsWith("nada"))
		{
			System.out.println("Si lo hace");
		}
		if(miCadenita.startsWith("Este"))
		{
			System.out.println("Si lo hacex2");
		}
		
		
		/* otro tipo de print
		int operador1 = 10;
		int operador2 = 20;
		int resultado = operador1+operador2;
		System.out.println("La sumatoria de "+ operador1 + " y " + operador2 + " es igual a " + resultado);
		
		System.out.println(String.format("La sumatoria de %d y %d es igual a %d", operador1, operador2, resultado));
		*/
		
		String cadenita4 = "dddd";
		
		// for each
		byte[] numeritos = cadenita4.getBytes();
		
		for (int i = 0; i < numeritos.length; i++) {
			System.out.println(numeritos[i]);
		}
		
		System.out.println("Foreach");
		for (byte b : numeritos) {
			System.out.println(b + " ");
		}
		
		
		// last index of
		System.out.println("La J mayuscula se encuentra en "+ miCadenita.lastIndexOf("e"));
	
		//empty
		if(cadenita4.isEmpty()) 
		{
			System.out.println("Vacio");
		}else 
		{
			System.out.println("No esta vacia");
		}
		
		
		// length
		System.out.println("Longitud de miCadenita es " + miCadenita.length());
		System.out.println(String.format("Longitud de la cadenita2(vector) %d", miCadenita2.length));
		
		
		/*// for each
		String[] miCadenita4 = new String[10];
				miCadenita4[0]= "Miau";
				miCadenita4[1]= "Miau2";
				miCadenita4[2]= "Miau3";
				miCadenita4[3]= "Miau4";
				miCadenita4[4]= "Miau5";
				
				for(String contenido : miCadenita4) 
				{
					System.out.println(contenido);
				}
		 */
		
				
		 // substring
		  System.out.println(Cadenitas.DameCaracterIndice(miCadenita, 25));
		  System.out.println(miCadenita.substring(10, 28));
		 
		
		// Expresiones regulares
		String cadenaaEvaluar = "miCorreo3@micorreo.com"; 
		System.out.println(cadenaaEvaluar.matches("[A-Za-z0-9]+@[A-Za-z]+.[A-Za-z]{3}"));
		
		
		
		//break
		
		
		// char to array
		char[] miCadenaChars = miCadenita.toCharArray();
		int cont = 0;
		
		for (int i = 0; i < miCadenaChars.length; i++) {
			if(miCadenaChars[i] == 'e') 
			{
				cont++;
			}
		}
		System.out.println("La cantidad de e es "+ cont);
		
		
		// upper and lower case
		System.out.println(miCadenita.toLowerCase());
		System.out.println(miCadenita.toUpperCase());
		
		
		// tipo parse 
		System.out.println(String.valueOf('M'));
		
		
		
	}

}
