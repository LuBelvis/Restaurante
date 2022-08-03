package test;

import service.ConsumibleService;

public class ConsumibleHelper {
	
	public static void crearConsumiblePlato(ConsumibleService consumibleService) {
		consumibleService.crearPlato("Burger", 1100.0, "Hamburguesa 100% carne vacuna con papas fritas", false, false);
		consumibleService.crearPlato("VeggieBurger", 1200.0, "Hamburguesa de lentejas con calabaza fritas", true, false);
		consumibleService.crearPlato("Fideos", 900.0, "Fideos con bolognesa", false, false);
		consumibleService.crearPlato("CeliBurger", 1300.0, "Hamburguesa 100% carne vacuna con papas fritas en pan de papa", false, true);
		consumibleService.crearPlato("FideosVeggie", 950.0, "Fideos con salsa de tomate", true, false);
		consumibleService.crearPlato("FideosCeliacos", 980.0, "Fideos de arroz con salsa de tomate", false, true);
		consumibleService.crearPlato("Salad", 1050.0, "Ensalada Griega", true, true);
		consumibleService.crearPlato("TunaSalad", 1150.0, "Ensalada Atún", false, true);
		
	}
	
	public static void crearConsumibleBebida(ConsumibleService consumibleService) {
		consumibleService.crearBebida("Agua", 100.0, 500.0,false);
		consumibleService.crearBebida("Agua Mineral", 120.0, 1000.0,false);
		consumibleService.crearBebida("Vino de la casa", 550.0, 500.0,true);
		consumibleService.crearBebida("Vino Patero", 700.0, 1000.0,true);
		consumibleService.crearBebida("Cerveza", 400.0, 1000.0,true);
		consumibleService.crearBebida("Gaseosa", 350.0, 500.0,false);
	
	}	
}
