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

public class ComandaService {

	//	- MenuService
	//	- EmpleadoService
	//	- MesaService
	//
	//	+ Comanda(MenuService, EmpleadoService, MesaService)
	//
	//	+ crearComanda(Mesa, Mozo, Cocinero, Menu)
	//	+ agregarConsumible(Comanda, Consumible)
	//	+ calcularTotal(Comanda, FormaPago)
	//	- calcularDescuento(Consumible, FormaPago)
	//	+ liberaMesa(Comanda)
	
	private MenuService menuService;
	private EmpleadoService empleadoService;
	private MesaService mesaService;
	
	private List<Comanda> comandas = new ArrayList<Comanda>();

	
	public ComandaService(MenuService menuService, EmpleadoService empleadoService, MesaService mesaService) {
		this.menuService = menuService;
		this.empleadoService = empleadoService;
		this.mesaService = mesaService;
	}
	
//	public ComandaService(MenuService menu, MesaService mesa, EmpleadoService mozo, EmpleadoService cocinero) {
//	}

		public Comanda crearComanda(Menu menu, Mesa mesa, Mozo mozo, Cocinero cocinero,
			FormaPago formaPago) {
		return new Comanda(menu, mesa, mozo, cocinero, formaPago);
		 
	}
		
//		public void agregarConsumible(Comanda comanda, Consumible consumible) {
//			if (consumible != null) {
//				
//			}
//		}
		public void agregarConsumible(List<Comanda> comandas, List<Consumible> consumibles) {
			comandas.add((Comanda) consumibles);
		}
//	public ComandaService crearComanda(MenuService menu, MesaService mesa, EmpleadoService mozo, EmpleadoService cocinero) {
//		return new ComandaService(menu, mesa, mozo, cocinero);
//		 
//	}
	
}
