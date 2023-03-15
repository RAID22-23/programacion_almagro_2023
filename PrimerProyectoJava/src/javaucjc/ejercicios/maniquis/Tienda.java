package javaucjc.ejercicios.maniquis;

public class Tienda {
	
	private String nombre;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public static void main(String[] args) {
		Tienda tienda = new Tienda("tienda1");
		tienda.abrirTienda();

	}
	
	public void abrirTienda () {
		//Crear los maniquis
		
		Maniqui [] maniquis = crearManiquis();
		pintaPrecioRopaManiqui(maniquis);
		
	}
	
	
	//metódo que indica el precio de la ropa de cada maniqui
	private void pintaPrecioRopaManiqui(Maniqui[] maniquis) {
		
		for (Maniqui maniqui : maniquis) {
			double total = 0;
			
			if (maniqui.getCamisa()!=null) {
				total += maniqui.getCamisa().getPrecio();
			}
			if (maniqui.getPantalon()!=null) {
				total += maniqui.getPantalon().getPrecio();
			}
			if (maniqui.getVestido()!=null) {
				total += maniqui.getVestido().getPrecio();
			}

			System.out.println("El total del maniqui "+ maniqui.getId() + " es " +total);
		}
		
		
	}
	
	
	
	
	
	
	
	
	private Maniqui[] crearManiquis() {
		Boton boton1 = new Boton("Blanco1","Redondo","Peqeño");
		Boton boton2 = new Boton("Blanco2","Redondo","Peqeño");
		Boton boton3 = new Boton("Blanco3","Redondo","Peqeño");
		Boton boton4 = new Boton("Blanco4","Redondo","Peqeño");
		Boton boton5 = new Boton("Blanco5","Redondo","Peqeño");
		
		//Se crea con los objetos ya definidos
		Boton[] botones_manual = {boton1,boton2,boton3,boton4};
		
		
		//Dinámica
		Boton boton = null;
		Boton [] botones = new Boton [4];
		for (int i=0; i<4 ; i++ ) {
			boton = new Boton("Blanco"+(i+1),"Redondo","Peqeño");
			botones[i] = boton;
			
			
		}
		
		Camisa camisa = new Camisa("Blanco","L",40);
		camisa.setBotones(botones_manual);
		
		Pantalon pantalon = new Pantalon("Vaquero","L",50,boton5);
		
		Vestido vestido = new Vestido("Verde","M",60);
		
		
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2);
		
		
		maniqui1.vestir(vestido);
		maniqui1.vestir(camisa,pantalon);
		
		maniqui2.vestir(vestido);
		
		Maniqui[] maniquis = {maniqui1, maniqui2};
		
		return maniquis;
	}
	
	
	
	private void precioManiquis(Maniqui[] maniquis) {
		
		
		
	}
	
	
}
