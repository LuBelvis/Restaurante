package service;

import java.util.ArrayList;
import java.util.List;

import domain.Cocinero;
import domain.Comanda;
import domain.Consumible;
import domain.Empleado;
import domain.FormaPago;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;

public class ComandaService {

	private static ComandaService instance;
	private MenuService menuService = MenuService.getInstance();
	private EmpleadoService empleadoService = EmpleadoService.getInstance();
	private MesaService mesaService = MesaService.getInstance();
	private ConsumibleService consumibleService = ConsumibleService.getInstance();

	private List<Comanda> comandas = new ArrayList<Comanda>();

	private ComandaService() {
	}

	public static ComandaService getInstance() {
		if (instance == null) {
			instance = new ComandaService();
		}

		return instance;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void crearComanda(Integer idMenu, Integer numeroMesa, Integer legajoMozo, Integer legajoCocinero,
			FormaPago formaPago) {

		Integer id = obtenerUltimoNumero();
		Menu menu = menuService.buscarMenuPorId(idMenu);
		Mesa mesa = mesaService.buscarMesaPorNumero(numeroMesa);
		Empleado mozo = empleadoService.buscarEmpleadoPorLegajo(legajoMozo);
		Empleado cocinero = empleadoService.buscarEmpleadoPorLegajo(legajoCocinero);
		Comanda comanda = new Comanda(id, menu, mesa, (Mozo) mozo, (Cocinero) cocinero, formaPago);

		comandas.add(comanda);

		System.out.println(comanda);
	}

	public void agregarConsumible(Integer idComanda, String nombre) {

		Consumible consumible = consumibleService.buscarConsumiblePorNombre(nombre);
		Comanda comanda = buscarComandaPorId(idComanda);

		for (Consumible plato : menuService.obtenerPlatos(comanda.getMenu().getIdMenu())) {
			if (plato.getNombre().equals(nombre)) {
				comanda.addConsumible(consumible);
			}
		}
		for (Consumible bebida : menuService.obtenerBebidas(comanda.getMenu().getIdMenu())) {
			if (bebida.getNombre().equals(nombre)) {
				comanda.addConsumible(consumible);
			}
		}
	}

	private Integer obtenerUltimoNumero() {
		Integer resultado = 1;
		int numero = 0;
		int mayor = 0;

		for (int i = 0; i < comandas.size(); i++) {

			numero = comandas.get(i).getId();

			if (numero > mayor) {

				mayor = numero;
			}

			resultado = mayor + 1;
		}
		System.out.println(resultado);
		return resultado;
	}

	public Comanda buscarComandaPorId(Integer id) {
		Comanda resultado = null;

		for (Comanda comanda : comandas) {

			if (comanda.getId() == id) {

				resultado = comanda;
			}
		}

		return resultado;

	}

	public void calcularTotal(Comanda comanda, FormaPago formaPago) {

		Double precioTotal = 0.0;

		for (Consumible consumible : comanda.getConsumibles()) {

			precioTotal = precioTotal + consumible.getPrecio();

		}

		System.out.println(precioTotal);

	}

//	private void calcularDescuento(String nombre, FormaPago formaPago){
//		Comanda comanda = buscarComandaPorId(id);
//		Double descuento = 0.0;
//		Double resta = Matematica.restarPorcentaje(null, null);
//		
//		if (formaPago == FormaPago.EFECTIVO) {
//			
//		}
//	}

}
