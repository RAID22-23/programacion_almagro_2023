/**
 * 
 */
package javaucjc.pec1;


public class Colegio {
	
	private String nombre;
	private String direccion;
	private Aula [] aulas;
	
	public Colegio(String nombre, String direccion, Aula[] aulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}

	public void asignarAlumno (Alumno alumno) {
		for (Aula aula : this.aulas) {
			int asientoLibre = aula.comprobarAsientoLibre();
			if (asientoLibre!=-1) {
				Alumno [] asientos = aula.getAsientos();
				asientos[asientoLibre]= alumno;
				
				System.out.println("Alumno "+alumno.getNombre() + " asignado "+
						" al aula "+ aula.getNumero() + " en la posicion " +asientoLibre);
				break;
			}else {
				System.out.println("No hay asiento disponible para"
						+ " el alumno "+alumno.getNombre() + " en el aula "+aula.getNumero());
			}
		}
		
	}
}
