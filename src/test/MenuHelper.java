package test;

import domain.TipoMenu;
import service.MenuService;

public class MenuHelper {
	
	public static void crearMenuNuevo (MenuService menuService) {
		menuService.crearMenu(1, TipoMenu.ALMUERZO);
		menuService.agregarConsumibleAlMenu(1, "Burger");
		menuService.agregarConsumibleAlMenu(1, "FideosVeggie");
		menuService.agregarConsumibleAlMenu(1, "Salad");
		menuService.agregarConsumibleAlMenu(1, "Agua");
		menuService.agregarConsumibleAlMenu(1, "Vino de la casa");
		menuService.agregarConsumibleAlMenu(1, "Gaseosa");
		
		menuService.crearMenu(2, TipoMenu.EJECUTIVO);
		menuService.agregarConsumibleAlMenu(2, "VeggieBurger");
		menuService.agregarConsumibleAlMenu(2, "Fideos");
		menuService.agregarConsumibleAlMenu(2, "TunaSalad");
		menuService.agregarConsumibleAlMenu(2, "Agua Mineral");
		menuService.agregarConsumibleAlMenu(2, "Vino Blanco");
		menuService.agregarConsumibleAlMenu(2, "Cerveza");
		
		menuService.crearMenu(3, TipoMenu.CENA);
		menuService.agregarConsumibleAlMenu(3, "CeliBurger");
		menuService.agregarConsumibleAlMenu(3, "FideosCeliacos");
		menuService.agregarConsumibleAlMenu(3, "Burger");
		menuService.agregarConsumibleAlMenu(3, "Salad");
		menuService.agregarConsumibleAlMenu(3, "Agua");
		menuService.agregarConsumibleAlMenu(3, "Vino de la casa");
		menuService.agregarConsumibleAlMenu(3, "Gaseosa");
		menuService.agregarConsumibleAlMenu(3, "Cerveza");

	}
}
