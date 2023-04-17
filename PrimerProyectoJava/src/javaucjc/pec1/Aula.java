package javaucjc.pec1;

public class Aula {
	
	private int numero;
	private int planta;
	private Alumno [] asientos;
	
	public Aula(int numero, int planta) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.asientos = new Alumno[3];
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public Alumno [] getAsientos() {
		return asientos;
	}
	public void setAsientos(Alumno [] asientos) {
		this.asientos = asientos;
	}
	
    public int comprobarAsientoLibre() {
        for (int i = 0; i < this.asientos.length; i++) {
            if (this.asientos[i] == null) {
                return i;
            }
        }
        return -1;
    }

}
