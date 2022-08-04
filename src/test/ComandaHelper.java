package test;

import domain.FormaPago;
import service.ComandaService;

public class ComandaHelper {

	
	public static void crearComandaNueva(ComandaService comandaService) {
		comandaService.crearComanda(1, 1, 360, 450, FormaPago.EFECTIVO);
		comandaService.agregarConsumible(1, "Burger");
		comandaService.agregarConsumible(1, "Salad");
		comandaService.agregarConsumible(1, "Agua");
		comandaService.agregarConsumible(1, "Agua");
		
		comandaService.crearComanda(2, 2, 360, 450, FormaPago.EFECTIVO);
		comandaService.agregarConsumible(2, "VeggieBurger");
		comandaService.agregarConsumible(2, "VeggieBurger");
		comandaService.agregarConsumible(2, "Agua");
		comandaService.agregarConsumible(2, "Gaseosa");
		
		comandaService.crearComanda(3, 3, 360, 722, FormaPago.CREDITO);
		comandaService.agregarConsumible(3, "VeggieBurger");
		comandaService.agregarConsumible(3, "Salad");
		comandaService.agregarConsumible(3, "FideosCeliacos");
		comandaService.agregarConsumible(3, "Burger");
		comandaService.agregarConsumible(3, "Agua");
		comandaService.agregarConsumible(3, "Gaseosa");
		comandaService.agregarConsumible(3, "Vino de la casa");
		comandaService.agregarConsumible(3, "Cerveza");
		
		comandaService.crearComanda(1, 4, 360, 722, FormaPago.EFECTIVO);
		comandaService.agregarConsumible(4, "FideosVeggie");
		comandaService.agregarConsumible(4, "Salad");
		comandaService.agregarConsumible(4, "FideosVeggie");
		comandaService.agregarConsumible(4, "FideosVeggie");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		comandaService.agregarConsumible(4, "Vino de la casa");
		
		comandaService.crearComanda(2, 5, 360, 722, FormaPago.EFECTIVO);
		comandaService.agregarConsumible(5, "TunaSalad");
		comandaService.agregarConsumible(5, "TunaSalad");
		comandaService.agregarConsumible(5, "TunaSalad");
		comandaService.agregarConsumible(5, "TunaSalad");
		comandaService.agregarConsumible(5, "TunaSalad");
		comandaService.agregarConsumible(5, "TunaSalad");
		comandaService.agregarConsumible(5, "Vino Blanco");
		comandaService.agregarConsumible(5, "Vino Blanco");
		comandaService.agregarConsumible(5, "Cerveza");
		comandaService.agregarConsumible(5, "Cerveza");
		comandaService.agregarConsumible(5, "Agua Mineral");
		comandaService.agregarConsumible(5, "Agua Mineral");
		
		comandaService.crearComanda(3, 6, 360, 722, FormaPago.DEBITO);
		comandaService.agregarConsumible(6, "CeliBurger");
		comandaService.agregarConsumible(6, "CeliBurger");
		comandaService.agregarConsumible(6, "CeliBurger");
		comandaService.agregarConsumible(6, "FideosCeliacos");
		comandaService.agregarConsumible(6, "FideosCeliacos");
		comandaService.agregarConsumible(6, "FideosCeliacos");
		comandaService.agregarConsumible(6, "Vino de la casa");
		comandaService.agregarConsumible(6, "Cerveza");
		comandaService.agregarConsumible(6, "Cerveza");
		comandaService.agregarConsumible(6, "Cerveza");
		comandaService.agregarConsumible(6, "Agua");
		comandaService.agregarConsumible(6, "Gaseosa");
	}
}
