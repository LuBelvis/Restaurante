package service;

import java.util.ArrayList;
import java.util.List;

import domain.Consumible;
import domain.Menu;
import domain.Plato;
import domain.Bebida;

public class MenuService {

	private static MenuService instance;
	private ConsumibleService consumibleService = ConsumibleService.getInstance();
	private List<Menu> menues = new ArrayList<Menu>();

	private MenuService() {
	}

	public synchronized static MenuService getInstance() {
		if (instance == null) {
			instance = new MenuService();
		}
		return instance;
	}

	public List<Menu> getMenues() {
		return menues;
	}

	public void addMenu(List<Consumible> consumibleService, String tipoMenu) {
		menues.add(new Menu(consumibleService, tipoMenu));
	}

	public void agregarConsumibleAlMenu(String tipo, String nombre) {

		Consumible consumible = consumibleService.buscarConsumiblePorNombre(nombre);
		Menu menu = buscarMenuPorTipo(tipo);

		menu.addConsumible(consumible);
	}

	public void borrarConsumible(String tipo, String nombre) {

		Consumible consumible = consumibleService.buscarConsumiblePorNombre(nombre);

		Menu menu = buscarMenuPorTipo(tipo);

		menu.getConsumibles().remove(consumible);
	}

	public List<Consumible> obtenerPlatos(String tipo) {

		Menu menu = buscarMenuPorTipo(tipo);

		List<Consumible> platos = new ArrayList<Consumible>();

		for (Consumible plato : menu.getConsumibles()) {

			if (plato instanceof Plato) {

				platos.add(plato);
			}
		}
		return platos;
	}

	public List<Consumible> obtenerBebidas(String tipo) {

		Menu menu = buscarMenuPorTipo(tipo);

		List<Consumible> bebidas = new ArrayList<Consumible>();

		for (Consumible bebida : menu.getConsumibles()) {

			if (bebida instanceof Bebida) {

				bebidas.add(bebida);
			}
		}
		return bebidas;
	}

	public Menu buscarMenuPorTipo(String tipoMenu) {

		Menu resultado = null;

		for (Menu menu : menues) {

			if (menu.getTipoMenu().equalsIgnoreCase(tipoMenu)) {

				resultado = menu;
			}
		}

		return resultado;
	}

}
