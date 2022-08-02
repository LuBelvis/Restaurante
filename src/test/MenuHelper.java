package test;

import java.util.List;

import domain.Menu;
import service.ConsumibleService;
import service.MenuService;

public class MenuHelper {

	public static Menu crearMenuEjecutivo(MenuService menuService, ConsumibleService consumibleService) {
		return menuService.crearMenu("ejecutivo", consumibleService.getConsumibles());
	}
	
	public static Menu crearMenuAlmuerzo(MenuService menuService, ConsumibleService consumibleService) {
		return menuService.crearMenu("almuerzo", consumibleService.getConsumibles());
	}
	
	public static Menu crearMenuCena(MenuService menuService, ConsumibleService consumibleService) {
		return menuService.crearMenu("cena", consumibleService.getConsumibles());
	}
}
