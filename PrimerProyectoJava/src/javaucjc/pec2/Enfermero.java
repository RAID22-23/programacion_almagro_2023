package javaucjc.pec2;

public class Enfermero extends EmpleadoClinica{
	
	private int planta;

	public Enfermero(String nombre, String apellido, String dni, int id, int experiencia, String turno, int planta) {
		super(nombre, apellido, dni, id, experiencia, turno);
		this.planta = planta;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}
	 //Creamos un metodo examinar
	public void examinar(Paciente p) {
		System.out.println("El enfermero " + this.getNombre() + " esta atendiendo al paciente " + p.getNombre() + " con los siguientes "
				+ "sintomas: " + p.getSintomas() );
		
	}
	
	
	
}
