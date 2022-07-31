package service;

import java.util.ArrayList;
import java.util.List;

import domain.Consumible;
import domain.Menu;
import domain.Plato;
import domain.Salon;
import test.ConsumibleHelper;
import test.MenuHelper;

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
	
	public MenuService(ConsumibleService consumibleService) {
		this.consumibleService = consumibleService;
	}
	
	public Menu crearMenu(String tipoMenu) {
		return new Menu (tipoMenu);
	}

	public void agregarConsumibleAlMenu(Menu menu, Consumible consumible) {
		for (Consumible consum : menu.getConsumibles()) {
			if (consum.getNombre().equals(consumible.getNombre())) {
				System.out.println("algo");
			}
		}
		System.out.println("nada");

	}
		//Menu menu = null;
//		if (menu.getTipoMenu()!= null) {
//			menu.getConsumibles().add(consumible);
//			System.out.println("consumible " + consumible.getNombre());
//			}else {
//				System.out.println("no existe");
//	
//			}
//		}

//		if (menu.getTipoMenu() == "ejecutivo") {
//			consumible = consumibleService.crearPlato("Burger", 1100.0, "Hamburguesa 100% carne vacuna con papas fritas", false, false);
//		menu.getConsumibles().add(consumible);
//		System.out.println(consumible);
//		}else {
//			System.out.println("no existe");
//
//		}
		
//	public Consumible obtenerPlatos(Menu menu) {
//		for (Consumible plato : menu.getConsumibles()) {
//			if (plato != null) {
//				return plato;
//			}
//		}
//		return null;
//	}

	public Menu obtenerPlatos(Menu menu) {
		try {
			for (Menu platos : Salon.getMenues()) {	
			if (platos != null) {
				
					return platos;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
	

