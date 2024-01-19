/**
 * 
 */
package edu.Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.PacienteDto;
import edu.Servicios.MenuImplementacion;
import edu.Servicios.MenuInterfaz;

/**
 * 
 */
public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PacienteDto paciente01 = new PacienteDto();
		
		MenuInterfaz me = new MenuImplementacion();
		
		
		System.out.println(paciente01.toString());
		
		
		System.out.println("Introduzca el nombre de la Mascota");

		paciente01.setNombrePaciente("David");
		System.out.println(paciente01.getNombrePaciente());
		
		
		List<PacienteDto> listaPacientes = new ArrayList<PacienteDto>();
		
	}

}
