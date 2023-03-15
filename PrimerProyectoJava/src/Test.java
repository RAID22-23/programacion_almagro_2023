import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String valor1 = "hola";
		String valor2 = "Hola";
		String valor3 = new String ("Hola");
		
		System.out.println(valor1==valor2);
		System.out.println(valor1.equals(valor2));
		System.out.println(valor1.equalsIgnoreCase(valor2));
		System.out.println(valor1==valor3);
		System.out.println(valor1.equals(valor3));
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el nombre de un mes: ");
		String mes = scan.nextLine();
		System.out.println("Escribe tu edad: ");
		int edad = scan.nextInt();
		
		
		
		System.out.println("Mes introducido: "+mes);
		
	}

}
