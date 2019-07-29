package com.algoritmospractica3.application;

import java.io.ObjectInputStream.GetField;

import com.algoritmospractica3.model.Alumnos;

public class algoritmosPractica3 
{

	public static void main(String[] args) 
	{
		// reservo el esPaulacio en memoria RAM
		Alumnos objOmar; 
		
		// creo, instancio a la clase
		objOmar = new Alumnos();

		Alumnos obtJuan = new Alumnos("223", "Juan", 2.5);		
		Alumnos obtPaula = new Alumnos("224", "Paula", 3.9);	
		
		
		objOmar.setCodigoAlumno("123");;
		objOmar.setNombreAlumno("OmarG");
		objOmar.setCalificacionAlumno(10.0);
		
		/*
		obtJuan.codigoAlumno = "456";
		obtJuan.nombreAlumno = "Juano";
		obtJuan.calificacionAlumno = 7.0;
		
		obtPaula.codigoAlumno = "456";
		obtPaula.nombreAlumno = "PaulaP";
		obtPaula.calificacionAlumno = 7.0;
		*/
		
		System.out.println("Codigo de Omar: " + objOmar.getCodigoAlumno());
		System.out.println("Nombre de Omar: " + objOmar.getNombreAlumno());
		System.out.println("Calificacion de Omar: "+ objOmar.getCalificacionAlumno());
		
		System.out.println("Codigo de Juan: " + obtJuan.getCodigoAlumno());
		System.out.println("Nombre de Juan: " + obtJuan.getNombreAlumno());
		System.out.println("Calificacion de Juan: "+ obtJuan.getCalificacionAlumno());
		
		System.out.println("Codigo de Paula: " + obtPaula.getCodigoAlumno());
		System.out.println("Nombre de Paula: " + obtPaula.getNombreAlumno());
		System.out.println("Calificacion de Paula: "+ obtPaula.getCalificacionAlumno());
		
	}
}
