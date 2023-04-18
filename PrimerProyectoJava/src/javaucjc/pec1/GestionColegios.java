package javaucjc.pec1;

public class GestionColegios {


	public static void main(String[] args) {
		
		Alumno [] alumnos = UtilsColegio.generaAlumnos(2);
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		

	}

}
