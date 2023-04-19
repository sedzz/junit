package org.cuatrovientos.cadena;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {

	@Test
	public void longitud() {
		Cadena target = new Cadena();
		int expected = 7;
		int actual = target.longitud("manzana");
		assertEquals("Fail in Longitud Cadena", expected, actual);
	}
	
	@Test
	public void longitud1() {
		Cadena target = new Cadena();
		int expected = 7;
		int actual = target.longitud("");
		assertEquals("Fail in Longitud Cadena", expected, actual);
	}
	
	@Test
	public void vocales() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("manzana");
		assertEquals("Fail Vocales Cadena", expected, actual);
	}
	@Test
	public void vocales1() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("");
		assertEquals("Fail Vocales Cadena", expected, actual);
	}
	@Test
	public void reverse() {
		Cadena target = new Cadena();
		String expected = "anaznam";
		String actual = target.invertir("manzana");
		assertEquals("Fail Reverse Cadena", expected, actual);
	}
	@Test
	public void reverse1() {
		Cadena target = new Cadena();
		String expected = "anaznam";
		String actual = target.invertir("");
		assertEquals("Fail Reverse Cadena", expected, actual);
	}
	@Test
	public void contar() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.contarLetra("manzana", 'a');
		assertEquals("Fail ContarLetra Cadena", expected, actual);
	}
	@Test
	public void contar1() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.contarLetra("", 'a');
		assertEquals("Fail ContarLetra Cadena", expected, actual);
	}
	
	
	

}
