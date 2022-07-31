package test;

import domain.Menu;
import service.MenuService;

public class MenuHelper {

	public static Menu crearMenuEjecutivo(MenuService menuService) {
		return menuService.crearMenu("ejecutivo");
	}
	
	public static Menu crearMenuAlmuerzo(MenuService menuService) {
		return menuService.crearMenu("almuerzo");
	}
	
	public static Menu crearMenuCena(MenuService menuService) {
		return menuService.crearMenu("cena");
	}
}
