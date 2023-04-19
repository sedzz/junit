package org.cuatrovientos.cadena;


public class Cadena {
	
	public Cadena() {}
	
	public int longitud(String cadena) {
		return cadena.length();
	}	
	public int vocales(String cadena) {
	    char vocales[] = {'a', 'e', 'i', 'o', 'u'};
	    char[] letras = cadena.toCharArray();
	    int suma = 0;
	    for (int i = 0; i < cadena.length(); i++) {
	        for (int j = 0; j < vocales.length; j++) {
	            if (letras[i] == vocales[j]) {
	                suma++;
	            }
	        }
	    }
	    return suma;
	}
	
	public String invertir(String cadena) {
		String invertido = new StringBuilder(cadena).reverse().toString();
		return invertido;
	}
	
	public int contarLetra(String cadena, char caracter) {
		char[] letras = cadena.toCharArray();
		int suma = 0;
		for(int i = 0; i<cadena.length();i++) {
			if(letras[i] == caracter) {
				suma++;
			}
		}
		return suma;
	}
}
