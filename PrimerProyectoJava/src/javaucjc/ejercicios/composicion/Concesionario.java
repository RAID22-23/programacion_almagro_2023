package javaucjc.ejercicios.composicion;

public class Concesionario {

	public static void main(String[] args) {
		//Creo el coche1
		Piston piston1 = new Piston(1,"Marca1");
		Motor motor1= new Motor("MarcaMotor1",120,piston1);
		Volante volante1 = new Volante(1,"Deportivo","negro");
		
		Coche coche1 = new Coche("1111-ABC","SEAT",volante1,motor1);
		
		System.out.println(coche1.getMatricula());
		System.out.println(coche1.getVolante().getColor());
		System.out.println(coche1.getMotor().getPiston().getId());
		
		double velocidad = Math.random()*120;
		coche1.setVelocidad(velocidad);
		
		coche1.conducir();
		
		

	}

}
