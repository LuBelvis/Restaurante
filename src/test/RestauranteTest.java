package test;

import domain.Consumible;
import domain.FormaPago;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import domain.Plato;
import service.ComandaService;
import service.ConsumibleService;
import service.EmpleadoService;
import service.MenuService;
import service.MesaService;
import service.SalonService;

public class RestauranteTest {

	public static void main(String[] args) {

		//sólo va a estar el Salon
		SalonService salonService = new SalonService();  //??
		
		MesaService mesaService = new MesaService();
		
		Mesa Mesax2N1 = MesaHelper.crearMesaX2(mesaService);
		Mesa Mesax2N2 = MesaHelper.crearMesaX2(mesaService);
		Mesa Mesax4N3 = MesaHelper.crearMesaX4(mesaService);
		Mesa Mesax4N4 = MesaHelper.crearMesaX4(mesaService);
		Mesa Mesax6N5 = MesaHelper.crearMesaX6(mesaService);
		Mesa Mesax6N6 = MesaHelper.crearMesaX6(mesaService);
		
		salonService.agregarMesa(Mesax2N1);
		salonService.agregarMesa(Mesax2N2);
		salonService.agregarMesa(Mesax4N3);
		salonService.agregarMesa(Mesax4N4);
		salonService.agregarMesa(Mesax6N5);
		salonService.agregarMesa(Mesax6N6);
		
		mesaService.mostrar(Mesax6N6);
		salonService.borrarMesa(Mesax2N1);
				
		ConsumibleService consumibleService = new ConsumibleService();
		
		System.out.println("*****Platos******");
		//funciona con helper y ya creados los plato y bebidas ahí
		ConsumibleHelper.crearConsumiblePlato(consumibleService);
		System.out.println("*****Bebidas******");
		ConsumibleHelper.crearConsumibleBebida(consumibleService);

		consumibleService.verContenidoConsumiblesDisponibles(); //para ver el List<consumibles>
		System.out.println("************");
		System.out.println(consumibleService.borrarPlato("Burger")); //ok funciona
		
		//creacion Menu
		MenuService menuService = new MenuService(consumibleService);
		
		Menu Ejecutivo = MenuHelper.crearMenuEjecutivo(menuService);
		Menu Almuerzo = MenuHelper.crearMenuAlmuerzo(menuService);
		Menu Cena = MenuHelper.crearMenuCena(menuService);

		salonService.agregarMenu(Ejecutivo);
		salonService.agregarMenu(Almuerzo);
		salonService.agregarMenu(Cena);
		System.out.println("*****mostrarPlato*******");
//		Ejecutivo.mostrarPlato(null);
		System.out.println("*****agregarConsumibleAlMenu*******");
		menuService.agregarConsumibleAlMenu(Cena, null ); //"nada"
		
		System.out.println(menuService.obtenerPlatos(Cena)); //null

		    System.out.println(Ejecutivo.getConsumibles());
		//menuService.crearMenu(MenuHelper.crearMenuEjecutivo(menuService));
		
		System.out.println("******Menu******");
//		Menu menu = new Menu("cena");
//		menu.mostrarBebidas(); //no imprime nada, supongo xq no tiene nada en el menu
//		menu.mostrarPlatos();
		
		System.out.println("******Empleados******");
		//empleados
		EmpleadoService empleadoService = new EmpleadoService();
		
		empleadoService.registrarMozo("Sandro", 360, 20150425);
		empleadoService.registrarMozo("Camila", 532, 20200730);
		
		empleadoService.registrarCocinero("Germán", 450, 20180502,5);
		empleadoService.registrarCocinero("Damián", 722, 20210810,3);
		
		empleadoService.registrarChef("Francis", 123, 20141020, "chef internacional");
		
		empleadoService.verEmpleados();
		
		System.out.println("************");
	//	menuService.agregarConsumibleAlMenu(Ejecutivo, );
	//	System.out.println(salonService.asignarMesa(360, Mesax6N6));
		
		//comandas
		ComandaService comandaService = new ComandaService(menuService, empleadoService, mesaService);
		//comandaService.crearComanda(menuService, mesaService, empleadoService, empleadoService);
//		comandaService.agregarConsumible(null, menuService.obtenerPlatos(Cena));
	
	
	}//main

}
