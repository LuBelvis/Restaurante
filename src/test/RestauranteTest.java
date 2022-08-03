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
import domain.TipoMenu;
import service.ComandaService;
import service.ConsumibleService;
import service.EmpleadoService;
import service.MenuService;
import service.MesaService;
import service.SalonService;

public class RestauranteTest {

	public static void main(String[] args) {

		SalonService salonService = new SalonService(); 
		
		MesaService mesaService = MesaService.getInstance();
		
		Mesa Mesax2N1 = MesaHelper.crearMesaX2(mesaService);
		Mesa Mesax2N2 = MesaHelper.crearMesaX2(mesaService);
		Mesa Mesax4N3 = MesaHelper.crearMesaX4(mesaService);
		Mesa Mesax4N4 = MesaHelper.crearMesaX4(mesaService);
		Mesa Mesax6N5 = MesaHelper.crearMesaX6(mesaService);
		Mesa Mesax6N6 = MesaHelper.crearMesaX6(mesaService);
		
//		salonService.agregarMesa(Mesax2N1);
//		salonService.agregarMesa(Mesax2N2);
//		salonService.agregarMesa(Mesax4N3);
//		salonService.agregarMesa(Mesax4N4);
//		salonService.agregarMesa(Mesax6N5);
//		salonService.agregarMesa(Mesax6N6);
		
		mesaService.mostrar(Mesax6N6);
//		salonService.borrarMesa(Mesax2N1);
				
		ConsumibleService consumibleService = ConsumibleService.getInstance();
		
		System.out.println("*****Platos******");
		//funciona con helper y ya creados los plato y bebidas ahí
		ConsumibleHelper.crearConsumiblePlato(consumibleService);
		System.out.println("*****Bebidas******");
		ConsumibleHelper.crearConsumibleBebida(consumibleService);

		consumibleService.verContenidoConsumiblesDisponibles(); //para ver el List<consumibles>
		System.out.println("************");
	//	System.out.println(consumibleService.borrarPlato("Burger")); //ok funciona
		
		//creacion Menu
		MenuService menuService = MenuService.getInstance();
		
//		Menu Ejecutivo = MenuHelper.crearMenuEjecutivo(menuService, consumibleService);
//		Menu Almuerzo = MenuHelper.crearMenuAlmuerzo(menuService, consumibleService);
//		Menu Cena = MenuHelper.crearMenuCena(menuService, consumibleService);

//		salonService.agregarMenu(Ejecutivo);
//		salonService.agregarMenu(Almuerzo);
//		salonService.agregarMenu(Cena);
		System.out.println("***Crear Menu******");
		menuService.crearMenu(1, TipoMenu.ALMUERZO);
		menuService.crearMenu(2, TipoMenu.ALMUERZO);

		System.out.println("*****agregarConsumibleAlMenu*******");
		menuService.agregarConsumibleAlMenu(1, "VeggieBurger");
		menuService.agregarConsumibleAlMenu(1, "Agua");
		System.out.println("*****obtenerPlatos*******");
		System.out.println(menuService.obtenerPlatos(1));
		
	   // System.out.println(Menu.getConsumibles());//se imprime array consumibles
		
		
		System.out.println("******Menu******");
		System.out.println("*****mostrarMenu*******");
	//	Cena.mostrarMenu(Cena);//funciona pero muestra todos los consumibles
		
		System.out.println("******Empleados******");
		EmpleadoService empleadoService = EmpleadoService.getInstance();
		
		empleadoService.registrarMozo("Sandro", 360, 20150425);
		empleadoService.registrarMozo("Camila", 532, 20200730);
		
		empleadoService.registrarCocinero("Germán", 450, 20180502,5);
		empleadoService.registrarCocinero("Damián", 722, 20210810,3);
		
		empleadoService.registrarChef("Francis", 123, 20141020, "chef internacional");
		
		empleadoService.verEmpleados();
		
		System.out.println("*****Comandas*******");
	//	System.out.println(salonService.asignarMesa(360, Mesax6N6));
		
		ComandaService comandaService = ComandaService.getInstance();
		comandaService.crearComanda(1, 1, 360, 450, FormaPago.EFECTIVO);
		comandaService.crearComanda(2, 1, 360, 450, FormaPago.EFECTIVO);

		System.out.println("****AgregarConsumible a la Comanda***");
		comandaService.agregarConsumible(1, "VeggieBurger");
		comandaService.agregarConsumible(2, "Burger");

    	System.out.println("****CalcularTotal***");
    	comandaService.calcularTotal(comandaService.buscarComandaPorId(1), FormaPago.EFECTIVO);
    	System.out.println("****Comanda1***");
    	System.out.println(comandaService.buscarComandaPorId(1));
    	
	}//main

}
