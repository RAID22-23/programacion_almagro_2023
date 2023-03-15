package javaucjc.ejercicios.condicionales.bucles;

import java.util.Scanner;

import javaucjc.utils.Utilidades;

public class MenuFunciones {

	public static void main(String[] args) {

		int opcion=0;
		do {
			Utilidades.pintarMenu("Opcion1;Opcion2;Opcion3;Salir",";");
			opcion = Integer.parseInt(
					Utilidades.pideDatos("Elige una opcion"));
			
			switch (opcion) {
			
				case 1: 
					Utilidades.validarEmail();break;
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
	

}




