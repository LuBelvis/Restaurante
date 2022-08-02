package service;

import domain.Chef;
import domain.Cocinero;
import domain.Empleado;
import domain.Mozo;
import domain.Salon;

public class EmpleadoService {


	public Mozo registrarMozo(String nombre, Integer legajo, Integer fechaDeIngreso) {
		Salon.getEmpleados().add(new Mozo(nombre, legajo, fechaDeIngreso));
		return new Mozo (nombre, legajo, fechaDeIngreso);
	}
	
	public Cocinero registrarCocinero(String nombre, Integer legajo, Integer fechaDeIngreso,Integer aniosExperiencia) {
		Salon.getEmpleados().add(new Cocinero(nombre, legajo,fechaDeIngreso ,aniosExperiencia));
		return new Cocinero (nombre, legajo,fechaDeIngreso ,aniosExperiencia);
	}
	
	public Chef registrarChef(String nombre, Integer legajo, Integer fechaDeIngreso,String titulo) {
		Salon.getEmpleados().add(new Chef(nombre, legajo,fechaDeIngreso , titulo));		
		return new Chef(nombre, legajo,fechaDeIngreso , titulo);	
	}
	
	public void verEmpleados() {
		for (int i = 0; i < Salon.getEmpleados().size(); i++) {
			System.out.println(Salon.getEmpleados().get(i));
		}
	}
	
	
	
}
