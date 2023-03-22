package javaucjc.herencia;

public class ClaseHija1 extends ClasePadre {

	private int valor3 = 7;

	public ClaseHija1(String valor1, String valor2, int valor3) {
		super(valor1, valor2);
		this.valor3 = valor3;
		// TODO Auto-generated constructor stub
	}

	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}

	// Sobreescribo metodo1() del padre
	@Override
	public void metodo1() {
		System.out.println("Metodo1 desde la clase hija");
	}

	@Override
	public String toString() {
		return "ClaseHija1 [valor3=" + valor3 
				+ ", getValor1()=" + getValor1() 
				+ ", getValor2()=" + getValor2() + "]";
	}	
	
	
}




