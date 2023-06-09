package javaucjc.ejercicios.arrays;

public class Alumno {
	private String nombre;
	private String apellidos;
	private Asignatura [] asignaturas;
	
	public Alumno(String nombre, String apellidos, 
			Asignatura[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
	}
	
	public Alumno(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	
}
	