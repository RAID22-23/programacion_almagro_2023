package javaucjc.utils;

import java.util.Scanner;

public class Utilidades {

	/**
	 * Método para pintar un menú por defecto
	 */
	public static void pintarMenu() {
//		System.out.println("1. Validar email");
//		System.out.println("2. Pintar cuadrado");
//		System.out.println("3. Mostrar datos");
//		System.out.println("4. Salir");
//		
		pintarMenu("1. Validar email|2. Pintar cuadrado|3. Mostrar datos|4. Salir");
	}
	
	public static void pintarMenu(String menu) {
		pintarMenu(menu, "\\|");
	}
	
	public static void pintarMenu(String menu, String caracter) {
		String [] opciones = menu.split(caracter);
		pintarMenu(opciones);
	}
	
	public static void pintarMenu(String[] menu) {
		for (String opcion : menu) {
			System.out.println(opcion);
		}
	}
	
	
	public static String pideDatos(String mensaje) {
		String resultado = "";
		
		System.out.println(mensaje);
		Scanner scan = new Scanner(System.in);
		resultado = scan.nextLine();
		
		return resultado;
		
	}
	

	public static void validarEmail() {
		String email = pideDatos("Introduce un email");
		
		email = email.trim();
		String mensajeError = "";
		
		//Validamos el email
		//El email debe contener solo una @
		if (email.indexOf("@")==-1) {
			mensajeError += "El email no tiene arroba. ";
		}else if (email.indexOf("@")!=email.lastIndexOf("@")) {
			mensajeError += "El email no puede tener más de una arroba. ";
		}else {
			//Después de la @ tiene que haber al menos un punto
			String dominio = email.substring(email.indexOf("@")+1);
			if (dominio.indexOf(".")==-1) {
				mensajeError += "Después de la @ debe haber al menos un punto. ";
			}else {
			
				int diferencia = dominio.length() - (dominio.lastIndexOf(".")+1);
				if (diferencia<2 || diferencia>6) {
					mensajeError += "Después del último punto solo puede haber "
							+ "entre 2 y 6 caracteres. ";
				}
			}
		}
		
		//El email no puede tener espacios en blanco
		if (email.contains(" ")) {
			mensajeError += "El email no puede tener espacios en blanco. ";
		}
		
		
		
		
		//Compruebo si ha habido errores
		if (mensajeError.equals("")) {
			System.out.println("El email "+ email +" es correcto");
		}else {
			System.out.println("El email "+ email 
					+" no es correcto "+ mensajeError);
		}
	}
	
	
}
