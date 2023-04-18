package javaucjc.ejercicios.herencia.zoologico;

import java.util.Iterator;

public class Zoologico {
	
	public static void main(String[] args) {
		//Animal animal1 = new Animal("N1","T1");
		
		
		Elefante elefante = new Elefante("Dumbo","Asiatico",2);
//		elefante.desplazar();
//		elefante.programarJava();
		
		Animal elefante2 = new Elefante("Dumbo2","Asiatico",3);
		elefante2.desplazar();
		//elefante2.programarJava();
		
		Serpiente serpiente1 = new Serpiente("Serpiente1","Víbora",3);
		
		if (elefante2 instanceof Elefante) {
			Elefante elefante3 = (Elefante)elefante2;
			elefante3.programarJava();
		}

		
		Vaca vaca1 = new Vaca ("V1","Lechera",2);
		
		System.out.println("FIN");
		
		
		Animal [] animales = {elefante2,vaca1,serpiente1};
		
		Zoologico zoo  = new Zoologico();
		zoo.alimentarAnimales(animales);
		
	}
	
	
	public void alimentarAnimales (Animal [] animales) {
		
		for (Animal animal : animales) {
			animal.comer();
			if (animal instanceof Elefante) {
				Elefante elefante3 = (Elefante)animal;
				elefante3.programarJava();
			}
		}
		
	}

}

