package domain;

public class Bebida extends Consumible {

	private Double tamanioCc;
	private Boolean alcoholSi;
	
	
	public Bebida(String nombre, Double precio, Double tamanioCc) {
		super(nombre, precio);
		this.tamanioCc = tamanioCc;
	}
	
	public Double getTamanioCc() {
		return tamanioCc;
	}
	
	public Boolean getAlcoholSi() {
		return alcoholSi;
	}

	public void setAlcoholSi(Boolean alcoholSi) {
		this.alcoholSi = alcoholSi;
	}

	public boolean isAlcohol() {
		return (alcoholSi != null) ? alcoholSi : false; //no sé si está bien..?
	}
	
}
