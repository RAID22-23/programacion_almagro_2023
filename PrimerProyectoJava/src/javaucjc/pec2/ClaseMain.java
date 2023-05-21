package javaucjc.pec2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ClaseMain {


	public static void main(String[] args) {
		//Creamos al personal y a la clinica
		Doctor medico = new Doctor("Fernando","Alonso","123",1,33,"Mañana","Cirujano");
		Enfermero enfermero = new Enfermero("Marta","Escobar","123",1,33,"Mañana",1);
		
		ClaseMain cm = new ClaseMain();
		
		List<Paciente> pacientesSala = cm.crearPacientes();
		
		Clinica clinica1 = new Clinica("Clinica 1" ,"Calle Hispanidad", medico,enfermero);
		clinica1.setPacientesSala(pacientesSala);
		
		clinica1.ficharEmpleados();
		clinica1.comerAll();
		clinica1.atenderPacientes();
	}
	 //Creamos un metodo para crear a los pacientes
	public  List<Paciente> crearPacientes() {
		String sintoma1 = "Dolor de Cabeza";
		String sintoma2 = "Vision Borrosa";
		String sintoma3 = "Nauseas";
		String[] sintomas = {sintoma1,sintoma2,sintoma3};
		
		Random random = new Random();
		
		Paciente paciente1 = new Paciente("Paciente1","Apellido1","111A",sintomas[random.nextInt(3)]);
		Paciente paciente2 = new Paciente("Paciente2","Apellido2","111B",sintomas[random.nextInt(3)]);
		Paciente paciente3 = new Paciente("Paciente3","Apellido3","111C",sintomas[random.nextInt(3)]);
		Paciente paciente4 = new Paciente("Paciente4","Apellido4","111D",sintomas[random.nextInt(3)]);
		
		List<Paciente> pacientesSala = new ArrayList<>();
		
		pacientesSala.add(paciente1);
		pacientesSala.add(paciente2);
		pacientesSala.add(paciente3);
		pacientesSala.add(paciente4);
		
		
		System.out.println("===========");
		System.out.println("Se han creado los siguientes pacientes");;
		for (Paciente paciente : pacientesSala) {
			System.out.println(paciente.getNombre() + " " + paciente.getApellido() + " " + paciente.getDni()+ " "+ paciente.getSintomas());
		}
		
		return pacientesSala; //Devolmemos la List de clase Pacientes
	}

}
