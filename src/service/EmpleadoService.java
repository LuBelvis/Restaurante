package service;

import java.util.ArrayList;
import java.util.List;

import domain.Chef;
import domain.Cocinero;
import domain.Empleado;
import domain.Mozo;

public class EmpleadoService {

	private List<Empleado> empleados = new ArrayList<Empleado>();

	public void registrarMozo(String nombre, Integer legajo, Integer fechaDeIngreso) {
		empleados.add(new Mozo("Sandro", 360, 20150425));
		empleados.add(new Mozo("Camila", 532, 20200730));
	}
	
	public void registrarCocinero(String nombre, Integer legajo, Integer fechaDeIngreso,Integer aniosExperiencia) {
		empleados.add(new Cocinero("Germán", 450, 20180502,5));
		empleados.add(new Cocinero("Damián", 722, 20210810,3));
	}
	
	public void registrarChef(String nombre, Integer legajo, Integer fechaDeIngreso,String titulo) {
		empleados.add(new Chef("Francis", 123, 20141020, "chef internacional"));
		
	}
	
	public void verEmpleados() {
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println(empleados.get(i));
		}
	}
}
