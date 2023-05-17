package javaucjc.pec2;

public class EmpleadoClinica extends Persona implements Fichable{
	
	private int id;
	private int experiencia; //Años de experiencia
	private String turno;
	
	public EmpleadoClinica(String nombre, String apellido, String dni, int id, int experiencia, String turno) {
		super(nombre, apellido, dni);
		this.id = id;
		this.experiencia = experiencia;
		this.turno = turno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	@Override 
	public void fichar() {
		System.out.println("El empleado " + this.getNombre() + " con id "+id+ " está fichando");
	}
	
	@Override
	public void comer() {
		System.out.println("El empleado "+getNombre()+" esta comiendo en la cafetería");
	}

}
