package javaucjc.ejercicios.condicionales.bucles;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int opcion=0;
		do {
			System.out.println("1. Validar email");
			System.out.println("2. Pintar cuadrado");
			System.out.println("3. Mostrar datos");
			System.out.println("4. Salir");

			System.out.println("Elige una opcion");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			System.out.println(opcion);
			
			switch (opcion) {
			
				case 1: 
					Menu menu = new Menu();
					menu.validarEmail();break;
				case 2: pintaCuadrado(5);break;
				case 3: System.out.println("Opcion 3");break;
				case 4: System.out.println("Adios!");break;
				default: System.out.println("Opción incorrecta");
				
			}
			
			

		} while (opcion != 4);

	}
	
	public static void pintaCuadrado(int size) {
		for (int i=0; i<size;i++) {//Filas
			for (int j=0; j<size;j++) {//Columnas
				if (i==0 || i==size-1) {
					System.out.print("*\t");
				}else {
					if (j==0|| j==size-1) {
						System.out.print("*\t");
					}else {
						System.out.print(" \t");
					}
				}
			}
			//System.out.print("\n");
			System.out.println();
		}
		
	}
	
	public void validarEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un email");
		String email = scan.nextLine();
		
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




