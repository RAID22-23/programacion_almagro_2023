package javaucjc.pec1;

import javaucjc.utils.Utilidades;

public class UtilsColegio {

	public static Alumno [] generaAlumnos(int numAlumnos) {
		Alumno [] alumnos = new Alumno[numAlumnos];
		
		for (int i = 0; i < alumnos.length; i++) {
		
			String nombre = Utilidades.pideDatos("Introduce nombre");
			String apellidos = Utilidades.pideDatos("Introduce apellidos");
			String dni = Utilidades.pideDatos("Introduce dni");;
			Alumno alumno = new Alumno(nombre,apellidos,dni);
			alumnos[i] = alumno;
		}
		
		return alumnos;
	}

}
