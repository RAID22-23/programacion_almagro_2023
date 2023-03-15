package javaucjc.metodos;

public class MetodosEstaticos {
	
	static String dato = "dato1";
	
	public static void metodo1 () {
		System.out.println("Metodo1 estático");
		metodo2();
		
	}
	
	public static void metodo2 () {
		dato = "Hola";
		System.out.println("Metodo2 estático");
	}
	
	public void metodo3() {
		metodo3(0);
		System.out.println("Metodo2 no estático");
	}

	public void metodo3(int num) {
		if (num==0) {
			metodo1();
		}else {
			System.out.println(num);
		}
		
	}
//	
//	public void metodo3(String texto) {
//		System.out.println(texto);
//	}
	
}





