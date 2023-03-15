package javaucjc.poo;

public class Universidad {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.nombre = "Mariad";
		
		Persona persona2 = persona1;
		persona2.nombre = "Maria";
		persona2.correr();
		
		System.out.println(persona1.nombre);
		
		Persona persona3 = new Persona();
		persona3.nombre="Eva";
		System.out.println(persona3.nombre);
		persona3.correr();
		
		persona2 = persona3;
		
		persona3=null;
		System.out.println(persona2.edad);
		

	}

}



