package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Comanda {

	Menu menu;
	Mesa mesa;
	Mozo mozo;
	Cocinero cocinero;
	FormaPago formaPago;
	private List<Consumible> consumibles = new ArrayList <Consumible>();

	
	public Comanda(Menu menu, Mesa mesa, Mozo mozo, Cocinero cocinero,
			FormaPago formaPago) {
		this.menu = menu;
		this.mesa = mesa;
		this.mozo = mozo;
		this.cocinero = cocinero;
		this.formaPago = formaPago;
	}

	

	public Menu getMenu() {
		return menu;
	}

	public List<Consumible> getConsumibles() {
		return consumibles;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public Mozo getMozo() {
		return mozo;
	}

	public Cocinero getCocinero() {
		return cocinero;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}
	
	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cocinero, consumibles, formaPago, menu, mesa, mozo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comanda other = (Comanda) obj;
		return Objects.equals(cocinero, other.cocinero) && Objects.equals(consumibles, other.consumibles)
				&& formaPago == other.formaPago && Objects.equals(menu, other.menu) && Objects.equals(mesa, other.mesa)
				&& Objects.equals(mozo, other.mozo);
	}


	@Override
	public String toString() {
		return "Comanda [menu=" + menu + ", mesa=" + mesa + ", mozo=" + mozo + ", cocinero=" + cocinero + ", formaPago="
				+ formaPago + ", consumibles=" + consumibles + "]";
	}
	
}
