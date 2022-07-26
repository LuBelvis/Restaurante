package domain;

public class Chef extends Empleado{

	private String titulo;
	
	public Chef (String nombre, Integer legajo, Integer fechaDeIngreso,String titulo) {
		super(nombre, legajo, fechaDeIngreso);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	

}
