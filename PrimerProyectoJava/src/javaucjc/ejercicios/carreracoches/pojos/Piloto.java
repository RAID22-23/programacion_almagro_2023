package javaucjc.ejercicios.carreracoches.pojos;

public class Piloto {
	private String nombre;
	private int experiencia;
	private String equipo;
	private int numVictorias;
	
	public Piloto(String nombre, int experiencia, String equipo, 
			int numVictorias) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.equipo = equipo;
		this.numVictorias = numVictorias;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public int getNumVictorias() {
		return numVictorias;
	}
	public void setNumVictorias(int numVictorias) {
		this.numVictorias = numVictorias;
	}
	
	
}
