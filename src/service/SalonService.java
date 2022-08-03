package service;

import java.util.ArrayList;
import java.util.List;

import domain.Menu;
import domain.Mesa;
import domain.Salon;

public class SalonService {

	MenuService menuService = MenuService.getInstance();
	MesaService mesaService = MesaService.getInstance();
	EmpleadoService empleadoService = EmpleadoService.getInstance();
	ComandaService comandaService = ComandaService.getInstance();

	public void crearSalon() {

		new Salon(menuService.getMenues(), mesaService.getMesas(), empleadoService.getEmpleados(),
				comandaService.getComandas());
	}

	public void agregarMesa(Integer numeroMesa) {

	}
//
//	public void borrarMesa(Mesa mesa) {
//		Salon.getMesas().remove(mesa);
//		System.out.println("Se borró la mesa: " + mesa);
//	}
//
//	public void agregarMenu(Menu menu) {
//		Salon.getMenues().add(menu);
//	}
//
//	public Double pedidosPorCocinero() {
//		// legajo, nombre y total de comandas atendidas
//		return 0.0;
//	}
//
//	public void pedidoConMasConsumibles() {
//		// mostrar comanda que + num de consumibles tenga, obtenido de List<Comandas>
//	}

}
