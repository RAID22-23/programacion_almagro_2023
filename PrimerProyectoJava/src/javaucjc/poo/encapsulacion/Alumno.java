package javaucjc.poo.encapsulacion;

public class Alumno {

	// Variables de instancia
	private String nombre;
	private String apellidos;
	private double notaMedia;
	private Asignatura asignaturaAlumno;

	public Alumno(String nombre, String apellidos, double notaMedia, 
			Asignatura asignaturaAlumno) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
		this.asignaturaAlumno = asignaturaAlumno;
	}

	public Alumno(String nombre, String apellidos, double notaMedia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
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

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public Asignatura getAsignaturaAlumno() {
		return asignaturaAlumno;
	}

	public void setAsignaturaAlumno(Asignatura asignaturaAlumno) {
		this.asignaturaAlumno = asignaturaAlumno;
	}

	// Método o función
	public void estudiar() {
		System.out.println("El alumno " + this.nombre + " " + "esta estudiando y tienen una nota de " + notaMedia);
		
		//System.out.println("Estudia" + asignaturaAlumno.getNombre());
		
		
	}
}
