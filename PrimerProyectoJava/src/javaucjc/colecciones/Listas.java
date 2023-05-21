package javaucjc.colecciones;

import java.util.ArrayList;
import java.util.List;

import javaucjc.ejercicios.herencia.zoologico.Elefante;

public class Listas {

	public static void main(String[] args) {
		
		List lista1 = new ArrayList ();
		
		String mensaje = "Hola";
		
		System.out.println(Math.random());
		lista1.add("Hola");
		lista1.add(2);
	
		Elefante e = new Elefante("","",3);
		lista1.add(e);
		
		
		for (Object object : lista1) {
			
			if (object instanceof Elefante) {
				Elefante elefante = (Elefante)object;
				elefante.getNombre();
				((Elefante)object).getNombre();
			}
		}
		
		
	}

}







