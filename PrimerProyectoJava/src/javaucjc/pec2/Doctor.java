package javaucjc.pec2;

import java.util.Random;

public class Doctor  extends EmpleadoClinica{

	private String especialidad;

	public Doctor(String nombre, String apellido, String dni, int id, int experiencia, String turno,
			String especialidad) {
		super(nombre, apellido, dni, id, experiencia, turno);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	 //Creamos el metodo atender
	public boolean atender() {
		 //Crearemos la variable enfermoPaciente que determina si el paciente esta enfermo o no
		boolean  enfermoPaciente = false;
		
		Random random = new Random();
		
		boolean decision = random.nextBoolean();
		
		enfermoPaciente = decision;
			
		if(enfermoPaciente == true) {
			System.out.println("El paciente esta enfermo debe ser ingresado");
		}else{
			System.out.println("El paciente no esta enfermo, se puede ir");
			
		}
		
		return enfermoPaciente; //Devolvemos el valor booleano
	}
	

}
