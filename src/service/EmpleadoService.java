package service;

import java.util.ArrayList;
import java.util.List;

import domain.Chef;
import domain.Cocinero;
import domain.Empleado;
import domain.Mozo;

public class EmpleadoService {

	private static EmpleadoService instance;
	private List<Empleado> empleados = new ArrayList<Empleado>();

	private EmpleadoService() {
	}

	public static EmpleadoService getInstance() {
		if (instance == null) {
			instance = new EmpleadoService();
		}

		return instance;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public Mozo registrarMozo(String nombre, Integer legajo, Integer fechaDeIngreso) {

		Mozo empleado = new Mozo(nombre, legajo, fechaDeIngreso);

		empleados.add(empleado);

		return empleado;
	}

	public Cocinero registrarCocinero(String nombre, Integer legajo, Integer fechaDeIngreso, Integer aniosExperiencia) {

		Cocinero cocinero = new Cocinero(nombre, legajo, fechaDeIngreso, aniosExperiencia);

		empleados.add(cocinero);

		return cocinero;
	}

	public Chef registrarChef(String nombre, Integer legajo, Integer fechaDeIngreso, String titulo) {

		Chef chef = new Chef(nombre, legajo, fechaDeIngreso, titulo);

		empleados.add(chef);

		return chef;
	}

	public Empleado buscarEmpleadoPorLegajo(Integer legajo) {
		Empleado resultado = null;

		for (Empleado empleado : empleados) {

			if (empleado.getLegajo() == legajo) {

				resultado = empleado;
			}
		}

		return resultado;
	}

	//no creo que lo use
	public void verEmpleados() {

		for (Empleado empleado : empleados) {

			System.out.println(empleado);
		}
	}

}
