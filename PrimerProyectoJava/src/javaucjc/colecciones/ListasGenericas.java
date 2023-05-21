package javaucjc.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javaucjc.ejercicios.interfaces.Ordenador;

public class ListasGenericas {

	public static void main(String[] args) {
		
		List<Ordenador> ordenadores = new ArrayList<Ordenador>();
		Set<Ordenador> ordenadoresSet = new HashSet<Ordenador>();
		
		Ordenador ordenador1 = new Ordenador("O1", "O1");
		ordenadores.add(ordenador1);
		
		Ordenador computadora1 = new Ordenador("O2", "O2");
		ordenadores.add(computadora1);
		ordenadores.add(ordenador1);
		ordenadores.add(ordenador1);
		ordenadores.add(ordenador1);
		ordenadores.add(ordenador1);
		ordenadores.remove(ordenador1);
		System.out.println(ordenadores.size());
		
		ordenadoresSet.add(ordenador1);
		ordenadoresSet.add(ordenador1);
		ordenadoresSet.add(ordenador1);
		ordenadoresSet.add(ordenador1);
		//ordenadoresSet.add(0,computadora1);
		
		System.out.println(ordenadoresSet.size());
		

		
		for (Ordenador ordenador : ordenadores) {
			System.out.println(ordenador.getMarca());
		}
		System.out.println("==========================");
		
		
		ordenadores.add(0, new Ordenador("O3", "O3"));
		for (Ordenador ordenador : ordenadores) {
			System.out.println(ordenador.getMarca());
		}
		
		
		System.out.println("==========================");
		

		

	}
	
	

}



