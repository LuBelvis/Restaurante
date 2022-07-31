package test;

import domain.Consumible;
import service.ConsumibleService;

public class ConsumibleHelper {
	
	public static Consumible crearConsumiblePlato(ConsumibleService consumibleService) {
		Consumible consumible = null;
		consumibleService.crearPlato("Burger", 1100.0, "Hamburguesa 100% carne vacuna con papas fritas", false, false);
		consumibleService.crearPlato("VeggieBurger", 1200.0, "Hamburguesa de lentejas con calabaza fritas", true, false);
		consumibleService.crearPlato("Fideos", 900.0, "Fideos con bolognesa", false, false);
//		Consumible plato4 = consumibleService.crearPlato("CeliBurger", 1300.0, "Hamburguesa 100% carne vacuna con papas fritas en pan de papa", false, true);
//		Consumible plato5 = consumibleService.crearPlato("FideosVeggie", 950.0, "Fideos con salsa de tomate", true, false);
//		Consumible plato6 = consumibleService.crearPlato("FideosCeliacos", 980.0, "Fideos de arroz con salsa de tomate", false, true);
//		Consumible plato7 = consumibleService.crearPlato("Salad", 1050.0, "Ensalada Griega", true, true);
//		Consumible plato8 = consumibleService.crearPlato("TunaSalad", 1150.0, "Ensalada Atún", false, true);
		return consumible;
	}
	
	public static Consumible crearConsumibleBebida(ConsumibleService consumibleService) {
		Consumible consumible = null;
		Consumible bebida1 = consumibleService.crearBebida("Agua", 100.0, 500.0,false);
		Consumible bebida2 = consumibleService.crearBebida("Agua Mineral", 120.0, 1000.0,false);
		Consumible bebida3 = consumibleService.crearBebida("Vino de la casa", 550.0, 500.0,true);
		Consumible bebida4 = consumibleService.crearBebida("Vino Patero", 700.0, 1000.0,true);
		Consumible bebida5 = consumibleService.crearBebida("Cerveza", 400.0, 1000.0,true);
		Consumible bebida6 = consumibleService.crearBebida("Gaseosa", 350.0, 500.0,false);
	
		return consumible;	
	}	
}
