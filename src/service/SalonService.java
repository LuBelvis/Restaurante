package service;

import java.util.ArrayList;
import java.util.List;

import domain.Comanda;
import domain.Empleado;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import domain.Salon;
import test.MenuHelper;
import test.MesaHelper;

public class SalonService {

	//metodos
	
	//	  + agregarMesa() ----ok
	//    + borrarMesa()----ok
	//    + asignarMesa(Mozo, Mesa) ------para qué este método??
	//    + agregarMenu(Menu)----ok
	//
	//    +pedidosPorCocinero()
	//    +pedidoConMasConsumibles()

//	private List<Empleado> empleados = new ArrayList<Empleado>();
//	private List<Mesa> mesas= new ArrayList<Mesa>();
//	private List<Menu> menues = new ArrayList<Menu>();
//	private List<Comanda> comandas = new ArrayList<Comanda>();


	public void agregarMesa(Mesa mesa) {
		Salon.getMesas().add(mesa);
	}	
	
	public void borrarMesa(Mesa mesa) {
		Salon.getMesas().remove(mesa);
			System.out.println("Se borró la mesa: " + mesa);
	}
	


	
	//falta....
//	public void asignarMesa(String nombre, List<Mesa> mesas) {
//		Mozo mozo =  null;
//		if (mozo != null)
//			if (mozo.getNombre().equalsIgnoreCase(nombre)) {
//				mozo.setMesas((List<Mesa>) mesas);
//				System.out.println("El mozo " + nombre + "atenderá la mesa ");
//			} else {
//				System.out.println("No existe el mozo");
//			}
//	}
	
//	public Empleado asignarMesa(Integer legajo, Mesa mesa) {
//		Empleado mozo = null;
//		//Integer numLegajo = 0;
//		for (Empleado empleado : empleados) {
//			if (empleado instanceof Mozo) {
//				if (((Mozo) empleado).getLegajo().equals(legajo))  {
//					mozo = mozo.setLegajo(legajo);
//					return mozo;
//				}
//			}
	
//			if (empleado.getLegajo().equals(mozo.getLegajo()) ) {
//				mozo = empleado;
//				//return numLegajo;
//				return mozo;
//			}
//		}
//		return null;
//	}
	

	public void agregarMenu(Menu menu) {
		Salon.getMenues().add(menu);
	}

	public Double pedidosPorCocinero() {
		//legajo, nombre y total de comandas atendidas
		return 0.0;
	}
	
	public void pedidoConMasConsumibles() {
		//mostrar comanda que + num de consumibles tenga, obtenido de List<Comandas>
	}
	

}
