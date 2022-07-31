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
		empleados.add(new Mozo(nombre, legajo, fechaDeIngreso));
	}
	
	public void registrarCocinero(String nombre, Integer legajo, Integer fechaDeIngreso,Integer aniosExperiencia) {
		empleados.add(new Cocinero(nombre, legajo,fechaDeIngreso ,aniosExperiencia));
	}
	
	public void registrarChef(String nombre, Integer legajo, Integer fechaDeIngreso,String titulo) {
		empleados.add(new Chef(nombre, legajo,fechaDeIngreso , titulo));		
	}
	
	public void verEmpleados() {
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println(empleados.get(i));
		}
	}
	
	
	
}
