package javaucjc.ejercicios.carreracoches.pojos;

import java.util.Random;

public class CocheCarreras {
	
    private String escuderia;
    private String motor;
    private int numero;
    private Piloto piloto;
    private double velocidad;
    private int avance;
    
	public CocheCarreras(String escuderia, String motor, int numero, Piloto piloto, double velocidad) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
	}

	public CocheCarreras(String escuderia, String motor, int numero, double velocidad) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.velocidad = velocidad;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getAvance() {
		return avance;
	}

	public void setAvance(int avance) {
		this.avance = avance;
	}
    
	/**
	 * Indica el modo de avance de cada coche
	 */
	public void correr() {
		int valorAleatorio = new Random().nextInt(100);
		//valorAleatorio = Math.random()*10
		int valor = valorAleatorio + (int)this.velocidad + this.piloto.getExperiencia();
		System.out.println("El coche "+this.getNumero() + " ha avanzado " + valor);
		
		this.avance += valor;
		System.out.println("El coche "+this.getNumero() + " lleva avanzado " + this.avance);
	}
    
}







