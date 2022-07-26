package domain;

public class Mesa {
	
	private Integer numero;
	private Integer cantidadComensales;
	private Boolean ocupado; //libre u ocupada
	
	public Mesa(Integer numero, Integer cantidadComensales) {
		this.numero = numero;
		this.cantidadComensales = cantidadComensales;
		this.ocupado = false;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public Integer getCantidadComensales() {
		return cantidadComensales;
	}
	
	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	public boolean isOcupado() {
		return (ocupado != null) ? ocupado : false;
	}

	@Override
	public String toString() {
		return "Mesa [numero=" + numero + ", cantidadComensales=" + cantidadComensales + ", ocupado=" + ocupado + "]";
	}

	
	
}
	

