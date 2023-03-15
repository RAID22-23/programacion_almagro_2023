package javaucjc.ejercicios.condicionales;

import java.util.Scanner;

/*
 * Declarar variable de tipo String para representar el nombre de un mes
 * A partir del mes indicar la estación del año
 */
public class EjercicioCondicionales {

	public static void main(String[] args) {
		
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el nombre de un mes: ");
		mes = scan.nextLine();
		System.out.println("Mes introducido: "+mes);
		
		
		//Realizamos con el if
		String estacion = "";
		String mesFebrero = "Febrero";
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase(mesFebrero) 
				|| mes.equalsIgnoreCase("Marzo")) {
			estacion = "Invierno";
		}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") 
				|| mes.equalsIgnoreCase("Junio")) {
			estacion = "Primavera";
		}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") 
				|| mes.equalsIgnoreCase("Septiembre")) {
			estacion = "Verano";
		}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") 
				|| mes.equalsIgnoreCase("Diciembre")) {
			estacion = "Otoño";
		}
		else {
			estacion = "erronea";
		}
		System.out.println("La estacion del mes "+mes + " es "+ estacion);
		
		
		//Switch
		switch (mes.toLowerCase()) {
			case "enero": 
			case "febrero":
			case "marzo":System.out.println("Invierno");break;
			case "abril":
			case "mayo":
			case "junio":System.out.println("Primavera");break;
			case "julio":
			case "agosto":
			case "septiembre":System.out.println("Verano");break;
			case "octubre":
			case "noviembre":
			case "diciembre":System.out.println("Otoño");break;
			default : System.out.println("Te has equivocado");
		}
		
		
	}

}
















