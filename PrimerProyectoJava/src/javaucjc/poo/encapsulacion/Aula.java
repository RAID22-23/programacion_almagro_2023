package javaucjc.poo.encapsulacion;

public class Aula {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Alumno1","Apellido1",8.9);
		//alumno1.nombre = "Juan";
		alumno1.setNombre("Angel");
		alumno1.estudiar();
		System.out.println(alumno1.getNombre());
		
		Alumno alumno2 = new Alumno("Alumno2","Apellido1");
		alumno2.estudiar();
		
		
		Asignatura asignatura1 = new Asignatura("Programación",7.0);
		Asignatura asignatura2 = new Asignatura("Programación",8.0);
		
		Alumno alumno3 = new Alumno("Alumno3","Apellido3",9.0,asignatura1);
		
		alumno2.setAsignaturaAlumno(asignatura2);
		
		
		System.out.println(alumno2.getAsignaturaAlumno().getNota());
//		System.out.println(alumno2.getAsignaturaAlumno());
//		System.out.println(alumno2.getAsignaturaAlumno());
//		System.out.println(alumno3.getAsignaturaAlumno());
//		System.out.println(alumno1.getAsignaturaAlumno());
		System.out.println(alumno1.getAsignaturaAlumno().getNota());
		
	}

}








