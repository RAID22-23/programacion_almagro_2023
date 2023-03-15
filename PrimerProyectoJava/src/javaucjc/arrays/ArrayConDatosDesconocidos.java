package javaucjc.arrays;

import java.util.Scanner;

public class ArrayConDatosDesconocidos {

	public static void main(String[] args) {
		System.out.println("Hola");
		int [][] numeros = new int[2][3];
		numeros[1][1] = 8;
		System.out.println(numeros[1][1]);
		System.out.println("Numero de filas "+ numeros.length);
		System.out.println("Numero de columnas "+ numeros[1].length);
		
		//Mostramos los datos de la matriz
		for (int i = 0; i< numeros.length; i++) {//Recorre las filas
			for (int j = 0; j<numeros[i].length ; j++) {//Recorre las columnas
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
		
		//Asignamos datos a la matriz
		for (int i = 0; i< numeros.length; i++) {//Recorre las filas
			for (int j = 0; j<numeros[i].length ; j++) {//Recorre las columnas
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce el valor de la posición ["+i+"],["+j+"]");
				numeros[i][j]=scan.nextInt();
						
			}
			
		}
		
		//Mostramos los datos de la matriz
		for (int i = 0; i< numeros.length; i++) {//Recorre las filas
			for (int j = 0; j<numeros[i].length ; j++) {//Recorre las columnas
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
		
	}

}
