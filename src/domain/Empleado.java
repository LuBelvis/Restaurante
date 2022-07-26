package domain;

public abstract class Empleado {

	protected String nombre;
	protected Integer legajo;
	protected Integer fechaDeIngreso;
	
	public Empleado(String nombre, Integer legajo, Integer fechaDeIngreso) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public Integer getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	
	
}
