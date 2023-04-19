package javaucjc.pec1;

public class GestionColegios {


	public static void main(String[] args) {
		
		String nombreColegio="";
		String direccionColegio="";
		int numAulas = 2;
		int numAlumnos = 2;
		
		Alumno [] alumnos = UtilsColegio.generaAlumnos(numAlumnos);
		Aula [] aulas = UtilsColegio.generaAulas(numAulas);
		
		
		Colegio colegio1 = new Colegio (nombreColegio,direccionColegio,aulas);
		GestionColegios admin = new GestionColegios();
		admin.asignaAlumnos(colegio1, alumnos);

	}
	
	public void asignaAlumnos(Colegio colegio, Alumno [] alumnos) {
		for (Alumno alumno : alumnos) {
			colegio.asignarAlumno(alumno);
		}
	}

}
