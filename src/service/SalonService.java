package service;

import java.util.ArrayList;
import java.util.List;

import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import test.MesaHelper;

public class SalonService {

	//metodos
	
	//	  + agregarMesa()
	//    + borrarMesa()
	//    + asignarMesa(Mozo, Mesa)
	//    + agregarMenu(Menu)
	//
	//    +pedidosPorCocinero()
	//    +pedidoConMasBebidas()


	private List<Mesa> mesas= new ArrayList<Mesa>();

	public void agregarMesa(Mesa mesa) {
		
		MesaService mesaService = new MesaService();
		
		Mesa Mesax2N1 = MesaHelper.crearMesaX2(mesaService);
		Mesa Mesax2N2 = MesaHelper.crearMesaX2(mesaService);
		Mesa Mesax4N3 = MesaHelper.crearMesaX4(mesaService);
		Mesa Mesax4N4 = MesaHelper.crearMesaX4(mesaService);
		Mesa Mesax6N5 = MesaHelper.crearMesaX6(mesaService);
		Mesa Mesax6N6 = MesaHelper.crearMesaX6(mesaService);
		
		mesas.add(Mesax2N1);
		mesas.add(Mesax2N2);
		mesas.add(Mesax4N3);
		mesas.add(Mesax4N4);
		mesas.add(Mesax6N5);
		mesas.add(Mesax6N6);

	}

	public String borrarMesa(Integer numero) {
		for (Mesa mesa : mesas) {
			if (mesa.getNumero() == numero) {
				mesas.remove(mesa);
				return "Se borró la mesa número: " + numero;
			}
		}
		return "No se encuentra el número de mesa: " + numero;

	}
	
	public void asignarMesa(Mozo Mesa) {
		
	}
	
	private List<Menu> menues = new ArrayList<Menu>();

	public void agregarMenu(Menu menu) {
		MenuService menuService = new MenuService(null);

	}
	

}
