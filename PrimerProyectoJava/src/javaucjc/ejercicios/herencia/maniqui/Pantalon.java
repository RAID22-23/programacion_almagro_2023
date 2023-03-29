package javaucjc.ejercicios.herencia.maniqui;

public class Pantalon extends Ropa {
	private Boton boton;

	public Pantalon(String color, String talla, double precio) {
		super(color, talla, precio);
		// TODO Auto-generated constructor stub
	}

	public Pantalon(String color, String talla, double precio, Boton boton) {
		super(color, talla, precio);
		this.boton = boton;
	}
	
	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}

	public void muestraDatos() {
		System.out.println("Color "+getColor());
	}

	
	
}
