package javaucjc.pec2;

import java.util.List;

public class Clinica {
	private String nombreClinica;
	private String direccion;
	private Doctor medico;
	private Enfermero enfermero;
	private List<Paciente> pacientesSala;

	public Clinica(String nombreClinica, String direccion, Doctor medico, Enfermero enfermero) {
		super();
		this.nombreClinica = nombreClinica;
		this.direccion = direccion;
		this.medico = medico;
		this.enfermero = enfermero;
	}

	public String getNombreClinica() {
		return nombreClinica;
	}

	public void setNombreClinica(String nombreClinica) {
		this.nombreClinica = nombreClinica;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Doctor getMedico() {
		return medico;
	}

	public void setMedico(Doctor medico) {
		this.medico = medico;
	}

	public Enfermero getEnfermero() {
		return enfermero;
	}

	public void setEnfermero(Enfermero enfermero) {
		this.enfermero = enfermero;
	}

	public List<Paciente> getPacientesSala() {
		return pacientesSala;
	}

	public void setPacientesSala(List<Paciente> pacientesSala) {
		this.pacientesSala = pacientesSala;
	}

	// Metodo para fichar empleados
	public void ficharEmpleados() {

		EmpleadoClinica[] empleados = { medico, enfermero };

		System.out.println("==========");
		for (EmpleadoClinica empleado : empleados) {
			fichar(empleado);
		}
	}
	
	private void fichar (Fichable empleado) {
		empleado.fichar();
	}

	// Metodo para atender pacientes
	public void atenderPacientes() {

		int j = 0;

		for (int i = 0; i < pacientesSala.size(); i++) {
			System.out.println("==========");
			System.out.println("El paciente " + pacientesSala.get(j).getNombre() + " será atendido por el enfermero "
					+ enfermero.getNombre());
			Paciente p = pacientesSala.get(j);
			enfermero.examinar(p);

			System.out.println("El paciente " + pacientesSala.get(j).getNombre() + " ahora será atendido por el medico "
					+ medico.getNombre());
			Boolean resultado = medico.atender(p);

			if (resultado = true) {
				j++;
				continue;
			} else {
				pacientesSala.remove(j);
			}

		}
	}

	// Metodo para poner a todos a comer

	public void comerAll() {
		System.out.println("============");
		System.out.println("Personal");
		comer(medico);
		comer(enfermero);

		System.out.println("==============");
		System.out.println("Pacientes");
		for (Paciente paciente : pacientesSala) {
			comer(paciente);
		}

	}
	
	private void comer(Persona persona) {
		persona.comer();
	}

}
