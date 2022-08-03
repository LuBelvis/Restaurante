package domain;

public class Bebida extends Consumible {

	private Double tamanioCc;
	private Boolean alcoholSi;

	public Bebida(String nombre, Double precio, Double tamanioCc, Boolean alcoholSi) {
		super(nombre, precio);
		this.tamanioCc = tamanioCc;
		this.alcoholSi = false;
	}

	public Double getTamanioCc() {
		return tamanioCc;
	}

	public Boolean getAlcoholSi() {
		return alcoholSi;
	}

	public void setTamanioCc(Double tamanioCc) {
		this.tamanioCc = tamanioCc;
	}

	public void setAlcoholSi(Boolean alcoholSi) {
		this.alcoholSi = alcoholSi;
	}

	@Override
	public String toString() {
		return "Bebida [tamanioCc=" + tamanioCc + ", alcoholSi=" + alcoholSi + ", nombre=" + this.nombre + ", precio="
				+ precio + "]";
	}
}
