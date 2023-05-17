package javaucjc.pec2;

public class Paciente extends Persona{

	private String sintomas;

	public Paciente(String nombre, String apellido, String dni, String sintomas) {
		super(nombre, apellido, dni);
		this.sintomas = sintomas;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	@Override
	public void comer() {
		System.out.println("El paciente "+ this.getNombre() 
			+" esta comiendo la calle");
	}

	@Override
	public String toString() {
		return "Paciente [sintomas=" + sintomas + ", getSintomas()=" + getSintomas() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getDni()=" + getDni() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
