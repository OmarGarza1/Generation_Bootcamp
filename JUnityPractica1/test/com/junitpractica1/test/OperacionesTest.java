package com.junitpractica1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junitpractica1.model.Operaciones;

public class OperacionesTest {

	@Test
	public void test() {
	Operaciones objOperaciones = new Operaciones();

	int resultadoReal;
	int resultadoEsperado = 20;

	resultadoReal=objOperaciones.sumaEnteros(10,10);

	assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}

	@Test
	public void test2() {
		Operaciones objOperaciones2 = new Operaciones();
		double resultadoReal2;
		double resultadoEsperado2 = 20.001;

		resultadoReal2 = objOperaciones2.sumaDobles(10.0, 10.0);

		assertEquals(resultadoEsperado2, resultadoReal2, 0.01);
	}
}
