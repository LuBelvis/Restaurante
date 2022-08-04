package domain;

public class Cocinero extends Empleado{

	private Integer aniosExperiencia;
	private Boolean tienePedido;
	
	public Cocinero (String nombre, Integer legajo, Integer fechaDeIngreso,Integer aniosExperiencia) {
		super(nombre, legajo, fechaDeIngreso);
		this.aniosExperiencia = aniosExperiencia;
		this.tienePedido = false;
	}

	public Integer getAniosExperiencia() {
		return aniosExperiencia;
	}

	public Boolean getTienePedido() {
		return tienePedido;
	}

	public void setTienePedido(Boolean tienePedido) {
		this.tienePedido = tienePedido;
	}


	
}
