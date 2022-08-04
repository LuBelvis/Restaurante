package test;

import service.MenuService;
import service.MesaService;

import service.SalonService;

public class RestauranteTest {

	public static void main(String[] args) {

		SalonService salonService = SalonService.getInstance();

		System.out.println("***Mesas***");
		MesaService mesaService = MesaService.getInstance();

		MesaHelper.crearMesaX2(mesaService);
		MesaHelper.crearMesaX2(mesaService);
		MesaHelper.crearMesaX4(mesaService);
		MesaHelper.crearMesaX4(mesaService);
		MesaHelper.crearMesaX6(mesaService);
		MesaHelper.crearMesaX6(mesaService);

		salonService.agregarMesa(1);
		salonService.agregarMesa(2);
		salonService.agregarMesa(3);
		salonService.agregarMesa(4);
		salonService.agregarMesa(5);
		salonService.agregarMesa(6);

		System.out.println("***Menues***");
		MenuService menuService = MenuService.getInstance();

		MenuHelper.crearMenuNuevo(menuService);

		salonService.agregarMenu(1);
		salonService.agregarMenu(2);
		salonService.agregarMenu(3);

		System.out.println("***Empleados***");

		EmpleadoHelper.crearEmpleadoNuevo();

		salonService.agregarEmpleados(360);
		salonService.agregarEmpleados(532);
		salonService.agregarEmpleados(450);
		salonService.agregarEmpleados(722);
		salonService.agregarEmpleados(123);

		System.out.println("***Comandas***");

		ComandaHelper.crearComandaNueva();
		salonService.agregarComanda(1);
		mesaService.ocuparMesa(1);
		salonService.agregarComanda(2);
		mesaService.ocuparMesa(2);
		salonService.agregarComanda(3);
		mesaService.ocuparMesa(3);
		salonService.agregarComanda(4);
		mesaService.ocuparMesa(4);
		salonService.agregarComanda(5);
		mesaService.ocuparMesa(5);
		salonService.agregarComanda(6);
		mesaService.ocuparMesa(6);

		mesaService.mostrar(1);
		mesaService.mostrar(2);

		mesaService.liberarMesa(1);

		System.out.println("***Comandas por Cocinero***");
		salonService.comandasPorCocinero(450);

		System.out.println("***Comanda con más Consumibles***");
		salonService.comandasConMasConsumibles();
	}
}