package javaucjc.strings;

import javaucjc.ejercicios.arrays.Alumno;

public class PruebaStrings {

	public static void main(String[] args) {
		String nombre = "Caperucita Roja";
		
		nombre = nombre.toUpperCase();
		
		System.out.println(nombre);

		String lobo1 ="Lobo";
		String lobo2 ="Lobo";
		
		System.out.println(lobo1==lobo2);
		
		lobo2 = nombre.toLowerCase();
		
		System.out.println(lobo1);
		System.out.println(lobo2);
		
		
		System.out.println(nombre.endsWith("JA"));
		
		
		System.out.println(nombre.indexOf("A"));
		System.out.println(nombre.lastIndexOf("A"));
		
		System.out.println("   asd    asdasd    ".trim());
		System.out.println("   asd    asdasd    ".replace(" ",""));
		//"CAPERUCITA ROJA"
		System.out.println(nombre.substring(3));
		System.out.println(nombre.substring(3,7));
		
		int posicion=nombre.indexOf(" ");
		System.out.println(nombre.substring(posicion).trim());
		
		String cadena = "N1;A1;DNI1;23;MADRID";
		
		String [] valores = cadena.split(";");
		
		for (String valor : valores) {
			System.out.println(valor);
		}
		
		
	}

}




