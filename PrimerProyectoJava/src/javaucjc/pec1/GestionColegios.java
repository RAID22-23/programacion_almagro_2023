package javaucjc.pec1;

public class GestionColegios {


	public static void main(String[] args) {
		
		if (args.length==4) {
			String nombreColegio=args[0];
			String direccionColegio=args[1];
			int numAulas = Integer.parseInt(args[2]);
			int numAlumnos = Integer.parseInt(args[3]);
			
			Alumno [] alumnos = UtilsColegio.generaAlumnos(numAlumnos);
			Aula [] aulas = UtilsColegio.generaAulas(numAulas);
			
			
			Colegio colegio1 = new Colegio (nombreColegio,direccionColegio,aulas);
			GestionColegios admin = new GestionColegios();
			admin.asignaAlumnos(colegio1, alumnos);
		}else {
			System.out.println("Numero de parámetros incorrecto");
		}

	}
	
	public void asignaAlumnos(Colegio colegio, Alumno [] alumnos) {
		for (Alumno alumno : alumnos) {
			colegio.asignarAlumno(alumno);
		}
	}

}
