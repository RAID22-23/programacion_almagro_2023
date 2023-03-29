package javaucjc.ejercicios.herencia.maniqui;

public class Camisa extends Ropa {
	private Boton [] botones;
	
	public Camisa(String color, String talla, double precio) {
		super(color, talla, precio);
		// TODO Auto-generated constructor stub
	}

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

	
}
