package domain;

import java.util.ArrayList;
import java.util.List;

public class Comanda {

	private Integer id;
	private Menu menu;
	private Mesa mesa;
	private Mozo mozo;
	private Cocinero cocinero;
	private FormaPago formaPago;
	private List<Consumible> consumibles = new ArrayList<Consumible>();

	public Comanda(Integer id, Menu menu, Mesa mesa, Mozo mozo, Cocinero cocinero, FormaPago formaPago) {
		this.id = id;
		this.menu = menu;
		this.mesa = mesa;
		this.mozo = mozo;
		this.cocinero = cocinero;
		this.formaPago = formaPago;
	}

	public Integer getId() {
		return id;
	}

	public Menu getMenu() {
		return menu;
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

	public List<Consumible> getConsumibles() {
		return consumibles;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public void setConsumibles(List<Consumible> consumibles) {
		this.consumibles = consumibles;
	}

	public void addConsumible(Consumible consumible) {
		consumibles.add(consumible);
	}
}
