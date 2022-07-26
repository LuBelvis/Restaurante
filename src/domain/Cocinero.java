package domain;

public class Cocinero extends Empleado{

	private Integer aniosExperiencia;
	
	public Cocinero (String nombre, Integer legajo, Integer fechaDeIngreso,Integer aniosExperiencia) {
		super(nombre, legajo, fechaDeIngreso);
		this.aniosExperiencia = aniosExperiencia;
	}

	public Integer getAniosExperiencia() {
		return aniosExperiencia;
	}

	
}
