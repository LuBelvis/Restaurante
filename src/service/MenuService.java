package service;

import java.util.ArrayList;
import java.util.List;

import domain.Consumible;
import domain.Menu;
import domain.Plato;
import domain.TipoMenu;
import domain.Bebida;

public class MenuService {

	private static MenuService instance;
	private ConsumibleService consumibleService = ConsumibleService.getInstance();
	private List<Menu> menues = new ArrayList<Menu>();

	private MenuService() {
	}

	public static MenuService getInstance() {
		if (instance == null) {
			instance = new MenuService();
		}
		return instance;
	}

	public List<Menu> getMenues() {
		return menues;
	}

	public void crearMenu(Integer idMenu,TipoMenu tipoMenu) {

		menues.add(new Menu(idMenu, tipoMenu));
	}

	public void agregarConsumibleAlMenu(Integer idMenu, String nombre) {

		Consumible consumible = consumibleService.buscarConsumiblePorNombre(nombre);
		Menu menu = buscarMenuPorId(idMenu);
		
		menu.addConsumible(consumible);
	
	}

	public void borrarConsumible(Integer idMenu, String nombre) {

		Consumible consumible = consumibleService.buscarConsumiblePorNombre(nombre);

		Menu menu = buscarMenuPorId(idMenu);

		menu.getConsumibles().remove(consumible);
	}

	public List<Consumible> obtenerPlatos(Integer idMenu) {

		Menu menu = buscarMenuPorId(idMenu);

		List<Consumible> platos = new ArrayList<Consumible>();

		for (Consumible plato : menu.getConsumibles()) {

			if (plato instanceof Plato) {

				platos.add(plato);
			}
		}
		return platos;
	}

	public List<Consumible> obtenerBebidas(Integer idMenu) {

		Menu menu = buscarMenuPorId(idMenu);

		List<Consumible> bebidas = new ArrayList<Consumible>();

		for (Consumible bebida : menu.getConsumibles()) {

			if (bebida instanceof Bebida) {

				bebidas.add(bebida);
			}
		}
		return bebidas;
	}

	
	public Menu buscarMenuPorId(Integer idMenu) {

		Menu resultado = null;

		for (Menu menu : menues) {

			if (menu.getIdMenu() == idMenu) {

				resultado = menu;
			}
		}

		return resultado;
	}

}
