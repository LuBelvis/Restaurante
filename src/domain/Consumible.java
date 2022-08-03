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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
