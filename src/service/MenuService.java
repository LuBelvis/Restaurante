package service;

import java.util.ArrayList;
import java.util.List;

import domain.Consumible;
import domain.Menu;
import domain.Plato;

public class MenuService {

	//	- ConsumibleService cs
	//
	//	+ MenuService(ConsumibleService) //constructor
	//
	//	+ crearMenu() //llaman a los new de las clases que necesito instanciar
	//	+ agregarConsumible(Menu, cs.crearPlato)
	//	+ borrarConsumible(Menu, Consumible)
	//	+ obtenerBebidas(Menu)
	//	+ obtenerPlatos(Menu)
	
	private ConsumibleService consumibleService;
	private List<Consumible> consumibles = new ArrayList <Consumible>();

	public MenuService(ConsumibleService consumibleService) {
		this.consumibleService = consumibleService;
	}
	
	public Menu crearMenu(String tipoMenu) {
		return new Menu (tipoMenu);
	}
	
	public void agregarConsumible(Menu menu, Consumible consumible) {
		
		Plato plato1 = consumibleService.crearPlato("Burger", 1100.0, "Hamburguesa 100% carne vacuna con papas fritas", false, false);
		Plato plato2 = consumibleService.crearPlato("VeggieBurger", 1200.0, "Hamburguesa de lentejas con calabaza fritas", true, false);
		Plato plato3 =consumibleService.crearPlato("Fideos", 900.0, "Fideos con bolognesa", false, false);
		Plato plato4 =consumibleService.crearPlato("CeliBurger", 1300.0, "Hamburguesa 100% carne vacuna con papas fritas en pan de papa", false, true);
		Plato plato5 =consumibleService.crearPlato("FideosVeggie", 950.0, "Fideos con salsa de tomate", true, false);
		Plato plato6 =consumibleService.crearPlato("FideosCeliacos", 980.0, "Fideos de arroz con salsa de tomate", false, true);
		Plato plato7 =consumibleService.crearPlato("Salad", 1050.0, "Ensalada Griega", true, true);
		Plato plato8 =consumibleService.crearPlato("TunaSalad", 1150.0, "Ensalada Atún", false, true);
		
		consumibles.add(plato1);
		consumibles.add(plato2);
		consumibles.add(plato3);
		consumibles.add(plato4);
		consumibles.add(plato5);
		consumibles.add(plato6);
		consumibles.add(plato7);
		consumibles.add(plato8);

	}
}
