package javaucjc.ejercicios.interfaces;

public class TestInterfaces {

	public static void main(String[] args) {
		Persona persona = new Persona("1A","N1");
		Empleado empleado = new Empleado (1,6);
		Ordenador ordenador = new Ordenador("Marca","Modelo");

		Insertable [] objetos = {persona,empleado,ordenador};
		
		TestInterfaces ti = new TestInterfaces();
		ti.insertar(objetos);
	}
	
	public void insertar (Insertable [] objetos) {
		
		for (Insertable objeto : objetos) {
			objeto.insert();
		}
		
	}

}
