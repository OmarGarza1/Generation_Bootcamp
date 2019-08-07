package com.mvcpractica9ajax.model;

/**
 * 
 * Esta clase matemáticas me sirve para demostrar el paso de parametros por el método post mediante Ajax
 * Es el ejercicio 10 de practicas mvc.
 * @author Omar
 * @version 1.0
 * @since 06 Agosto 2019
 * 
 *
 */

public class Matematicas {
/**
 * 
 * El presente método calcula la potencia de un numero tomando como su base y su potencia. La
 * Idea es calcular una potencia de tipo entero.
 * @param base Es la base de la potencia
 * @param potencia Es el exponente de la potencia
 * @return Es la potencia de tipo entero calculada
 * 
 */
	public static int calcularPotencia(int base, int potencia) {

		return (int) Math.pow(base, potencia);
	}

}
