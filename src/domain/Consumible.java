package domain;

public abstract class Consumible {

	protected String nombre;
	protected Double precio;
	
	public Consumible(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}
	
	
	
}
