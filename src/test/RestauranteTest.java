package test;

import domain.Chef;
import domain.Cocinero;
import domain.Comanda;
import domain.Consumible;
import domain.Empleado;
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
		MenuService menuService = new MenuService();
		
		Menu Ejecutivo = MenuHelper.crearMenuEjecutivo(menuService, consumibleService);
		Menu Almuerzo = MenuHelper.crearMenuAlmuerzo(menuService, consumibleService);
		Menu Cena = MenuHelper.crearMenuCena(menuService, consumibleService);

		salonService.agregarMenu(Ejecutivo);
		salonService.agregarMenu(Almuerzo);
		salonService.agregarMenu(Cena);
		System.out.println("*****agregarConsumibleAlMenu*******");
		menuService.agregarConsumibleAlMenu(Cena, "VeggieBurger");
		menuService.agregarConsumibleAlMenu(Cena, "Agua");//funciona
		System.out.println("*****obtenerPlatos*******");
		System.out.println(menuService.obtenerPlatos(Cena)); //funciona
		System.out.println("*****Array Consumibles*******");
	   // System.out.println(Menu.getConsumibles());//se imprime array consumibles
		//menuService.crearMenu(MenuHelper.crearMenuEjecutivo(menuService));
		
		System.out.println("******Menu******");
		System.out.println("*****mostrarMenu*******");
		Cena.mostrarMenu(Cena);//funciona pero muestra todos los consumibles
		
		System.out.println("******Empleados******");
		//empleados
		EmpleadoService empleadoService = new EmpleadoService();
		
		Mozo Sandro = empleadoService.registrarMozo("Sandro", 360, 20150425);
		empleadoService.registrarMozo("Camila", 532, 20200730);
		
		Cocinero German = empleadoService.registrarCocinero("Germán", 450, 20180502,5);
		empleadoService.registrarCocinero("Damián", 722, 20210810,3);
		
		Chef Francis = empleadoService.registrarChef("Francis", 123, 20141020, "chef internacional");
		
		empleadoService.verEmpleados();
		
		System.out.println("*****Comandas*******");
	//	System.out.println(salonService.asignarMesa(360, Mesax6N6));
		
		//comandas
		ComandaService comandaService = new ComandaService(menuService, empleadoService, mesaService);
		Comanda comanda1 = comandaService.crearComanda(Cena, Mesax6N6, Sandro, German, FormaPago.EFECTIVO);
		System.out.println("****AgregarConsumible a la Comanda***");
		comandaService.agregarConsumible(comanda1, "VeggieBurger");
    	System.out.println("****CalcularTotal***");
    	comandaService.calcularTotal(comanda1, FormaPago.EFECTIVO);
    	System.out.println("****Comanda1***");
    	System.out.println(comanda1);
    	
	}//main

}
