package domain;

import java.util.ArrayList;
import java.util.List;

public class Comanda {

	Menu menu;
	private List<Consumible> consumibles = new ArrayList <Consumible>();
	Mesa mesa;
	Mozo mozo;
	Cocinero cocinero;
	FormaPago formaPago;
	
	public Comanda(Menu menu, List<Consumible> consumibles, Mesa mesa, Mozo mozo, Cocinero cocinero,
			FormaPago formaPago) {
		this.menu = menu;
		this.consumibles = consumibles;
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
	
	
}
