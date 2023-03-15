package javaucjc.poo.encapsulacion;

public class Asignatura {
	//Variables instancia
	private String nombre;
	private double nota;
	
	//Constructores
	public Asignatura(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
	

}
