package javaucjc.ejercicios.arrays;

public class Aula {

	public static void main(String[] args) {
		
		Asignatura asignatura1Alumno1 = new Asignatura("Programación", 7.0);
		Asignatura asignatura2Alumno1 = new Asignatura("Matemáticas", 6.0);
		
		Asignatura [] asignaturasAlumno1 = {asignatura1Alumno1,asignatura2Alumno1};
		
		Alumno alumno1 = new Alumno("A1","X1", asignaturasAlumno1 );
		
		
		Asignatura asignatura1Alumno2 = new Asignatura("Programación", 6.0);
		Asignatura asignatura2Alumno2 = new Asignatura("Matemáticas", 2.0);
		
		Asignatura [] asignaturasAlumno2 = {asignatura1Alumno2,asignatura2Alumno2};
		
		Alumno alumno2 = new Alumno("A2","X2");
		alumno2.setAsignaturas(asignaturasAlumno2);
		
		
		//Creo el aula con los alumnos
		Alumno [] alumnos = {alumno1,alumno2}; 
		
		//System.out.println(alumnos[1].getAsignaturas()[1].getNota());
		
		System.out.println("Hay "+alumnos.length+" alumnos en el aula");
		
		//Mostramos nombre de cada alumno y nombre y nota de cada asignatura
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
			Asignatura[] asignaturasAlumno = alumno.getAsignaturas();
			for (Asignatura asignatura : asignaturasAlumno) {
				System.out.println("\t"+asignatura.getNombre() + 
						", nota: "+asignatura.getNota());
			}
			
		}

		//Calculamos nota media de todos los alumnos
		double notasAlumnos = 0;
		int totalAsignaturas = 0;
		for (Alumno alumno : alumnos) {
			Asignatura[] asignaturasAlumno = alumno.getAsignaturas();
			int numAsignaturasAlumno = asignaturasAlumno.length;
			totalAsignaturas += numAsignaturasAlumno;
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumnos+=asignatura.getNota();
			}
		}
		System.out.println("La nota media de todos los alumnos es "+
				notasAlumnos/totalAsignaturas);
		
		
		//Indicar que alumno tiene la nota media más alta
		
		double notaMediaMasAlta = 0;
		Alumno alumnoNotaMediaMasAlta=null;
		for (Alumno alumno : alumnos) {
			double notasAlumno = 0;
			Asignatura[] asignaturasAlumno = alumno.getAsignaturas();
			int numAsignaturasAlumno = asignaturasAlumno.length;
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumno+=asignatura.getNota();
			}
			double mediaAlumno = notasAlumno/numAsignaturasAlumno;

			if (mediaAlumno>notaMediaMasAlta) {

				notaMediaMasAlta = mediaAlumno;
				alumnoNotaMediaMasAlta = alumno;
				
			}
			
		}
		System.out.println("El alumno con la media mas alta es " + 
				alumnoNotaMediaMasAlta.getNombre() + " con un " +notaMediaMasAlta);
		
		
	}

}
















