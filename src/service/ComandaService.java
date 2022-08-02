package service;

import java.util.ArrayList;
import java.util.List;

import domain.Cocinero;
import domain.Comanda;
import domain.Consumible;
import domain.FormaPago;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import domain.Salon;

public class ComandaService {

	// - MenuService
	// - EmpleadoService
	// - MesaService
	//
	// + Comanda(MenuService, EmpleadoService, MesaService)
	//
	// + crearComanda(Mesa, Mozo, Cocinero, Menu)
	// + agregarConsumible(Comanda, Consumible)
	// + calcularTotal(Comanda, FormaPago)
	// - calcularDescuento(Consumible, FormaPago)
	// + liberaMesa(Comanda)

	private MenuService menuService = new MenuService();
	private EmpleadoService empleadoService = new EmpleadoService();
	private MesaService mesaService = new MesaService();
	private ConsumibleService consumibleService = new ConsumibleService();

//	private List<Comanda> comandas = new ArrayList<Comanda>();

	public ComandaService(MenuService menuService, EmpleadoService empleadoService, MesaService mesaService) {
		this.menuService = menuService;
		this.empleadoService = empleadoService;
		this.mesaService = mesaService;
	}

//	public ComandaService(MenuService menu, MesaService mesa, EmpleadoService mozo, EmpleadoService cocinero) {
//		this.menuService = menu;
//		this.mesaService = mesa;
//		this.empleadoService = mozo;
//		this.empleadoService = cocinero;
//	}

	public Comanda crearComanda(Menu menu, Mesa mesa, Mozo mozo, Cocinero cocinero, FormaPago formaPago) {
		return new Comanda(menu, mesa, mozo, cocinero, formaPago);

	}

//	public void agregarConsumible(List<Comanda> comandas, List<Consumible> consumibles) {
//	comandas.add((Comanda) consumibles);
//}
//public ComandaService crearComanda(MenuService menu, MesaService mesa, EmpleadoService mozo, EmpleadoService cocinero) {
//return new ComandaService(menu, mesa, mozo, cocinero);
// 
//}
	public void agregarConsumible(Comanda comanda, String nombre) {
		for (Consumible consumible : consumibleService.getConsumibles()) {
			if (consumible.getNombre().equals(nombre)) {
				comanda.setConsumibles(consumible);
				Salon.getComandas().add(comanda);

			}
		}

	}

	// da precioTotal 11050.0 => la suma de todos los consumibles
//		public void calcularTotal(Comanda comanda, FormaPago formaPago) {
//			Double precioTotal = 0.0;
//		//	for (Comanda comandaa : Salon.getComandas()) {	
//				for (Consumible consumible : consumibleService.getConsumibles()){
//					if (comanda.getConsumibles() != null) {
//						precioTotal = precioTotal + consumible.getPrecio();
//						
//					}else {
//						System.out.println("null");
//					}
//				}
//				System.out.println(precioTotal);
//		
//		}

	// da precioTotal 0.0 e imprime todos los consumibles y a lo último los 2 de la
	// comanda
	public void calcularTotal(Comanda comanda, FormaPago formaPago) {
		Double precioTotal = 0.0;
		for (Consumible consumible : comanda.getConsumibles()) {
			precioTotal = precioTotal + consumible.getPrecio();
			System.out.println(consumible);
		}
		
		System.out.println(precioTotal);

	}


//		private void calcularDescuento(Consumible consumible,Menu menu, FormaPago formaPago) {
//			if (formaPago == FormaPago.EFECTIVO) {
//				Comanda.getConsumibles()
//				menuService.obtenerPlatos(menu);
//			}
//		}
}
