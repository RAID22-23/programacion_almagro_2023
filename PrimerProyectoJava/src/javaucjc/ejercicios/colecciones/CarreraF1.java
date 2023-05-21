package javaucjc.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarreraF1 {

	public static void main(String[] args) {
		
		
		CocheF1 coche1 = new CocheF1(1,"Piloto1","Escuderia1",300);
		//coche1.setPatrocinadores(null);
		//coche1.addPatrocinador("Red Bull");
		
		
		
		List<String> patrocinadores2 = new ArrayList<String>();
		patrocinadores2.add("Marca1");
		patrocinadores2.add("Red Bull");
		CocheF1 coche2 = new CocheF1(2,"Piloto2","Escuderia2", patrocinadores2,400);
		
		coche2.setPatrocinadores(Arrays.asList("NuevoPatrocinador"));
		
		
		List<String> patrocinadores3 = Arrays.asList("Red Bull","Marca2");
		CocheF1 coche3 = new CocheF1(3,"Piloto3","Escuderia3",patrocinadores3, 230);
		//coche3.getPatrocinadores().add("Marca4");

		CarreraF1 cf1 = new CarreraF1();
		
		List<CocheF1> coches = Arrays.asList(coche2,coche3,coche1);
		cf1.muestraInfoCoches(coches);
		cf1.correrCoches(coches);
		cf1.calculaVelMedia(coches);
		
	}
	
	private void muestraInfoCoches(List<CocheF1> coches) {
		for (CocheF1 cocheF1 : coches) {
			System.out.println(cocheF1);
		}
	}
	
	private void correrCoches(List<CocheF1> coches) {
		for (CocheF1 cocheF1 : coches) {
			cocheF1.correr();
		}
	}
	
	private void calculaVelMedia(List<CocheF1> coches) {
		int contador=0;
		double sumaVelocidades=0;
		for (CocheF1 cocheF1 : coches) {
			if (cocheF1.getPatrocinadores() !=null 
					&& cocheF1.getPatrocinadores().contains("Red Bull")) {
				contador++;
				sumaVelocidades += cocheF1.getVelMaxima();
			}
			
		}
		
		System.out.println("Velocidad media: "+sumaVelocidades/contador);
	}
	
	

}




