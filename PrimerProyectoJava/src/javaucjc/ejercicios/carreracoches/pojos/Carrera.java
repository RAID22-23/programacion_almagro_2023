package javaucjc.ejercicios.carreracoches.pojos;

public class Carrera {
	private String nombre;
    private String circuito;
    private CocheCarreras[] parrilaSalida;
    private int distancia;
    
    
    public Carrera(String nombre, String circuito, int distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.distancia = distancia;
	}

	public Carrera(String nombre, String circuito, CocheCarreras[] parrilaSalida, int distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrilaSalida = parrilaSalida;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public CocheCarreras[] getParrilaSalida() {
		return parrilaSalida;
	}

	public void setParrilaSalida(CocheCarreras[] parrilaSalida) {
		this.parrilaSalida = parrilaSalida;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public void iniciarCarrera() {
		
		boolean hayGanador = false;
		
		while (!hayGanador) {
			for (CocheCarreras cocheCarreras : parrilaSalida) {
				cocheCarreras.correr();
				if(cocheCarreras.getAvance()>this.distancia) {
					System.out.println("El coche "+cocheCarreras.getNumero() +" ha ganado");
					hayGanador = true;
					break;
				}
			}
		}
		System.out.println("La carrera ha finalizado");
    }
}





