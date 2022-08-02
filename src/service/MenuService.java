package service;

import java.util.List;

import domain.Consumible;
import domain.Menu;

public class MenuService {

	// - ConsumibleService cs
	//
	// + MenuService(ConsumibleService) //constructor
	//
	// + crearMenu() //llaman a los new de las clases que necesito instanciar
	// + agregarConsumible(Menu, cs.crearPlato) ----ok
	// + borrarConsumible(Menu, Consumible) ---ok, creo
	// + obtenerBebidas(Menu) ----ok
	// + obtenerPlatos(Menu) ----ok

	private ConsumibleService consumibleService = new ConsumibleService();

	public Menu crearMenu(String tipoMenu, List<Consumible> consumibleService) {
		return new Menu(tipoMenu, consumibleService);
	}

	public void agregarConsumibleAlMenu(Menu menu, String nombre) {
		for (Consumible consumible : consumibleService.getConsumibles()) {
			if (consumible.getNombre().equals(nombre)) {
				consumibleService.getConsumibles().add(consumible);
			}
		}
	}

	public String borrarConsumible(String nombre) {
		for (Consumible consumible : consumibleService.getConsumibles()) {
			if (consumible.getNombre().equals(nombre)) {
				consumibleService.getConsumibles().remove(consumible);
				return "Se borró el consumible: " + nombre;
			}
		}
		return "No se encuentra el consumible: " + nombre;

	}

	public Consumible obtenerPlatos(Menu menu) {
		for (Consumible plato : menu.getConsumibles()) {
			if (plato != null) {
				return plato;
			}
		}
		return null;
	}

	public Consumible obtenerBebidas(Menu menu) {
		for (Consumible bebida : menu.getConsumibles()) {
			if (bebida != null) {
				return bebida;
			}
		}
		return null;
	}

}
