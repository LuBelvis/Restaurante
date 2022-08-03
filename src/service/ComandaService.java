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

	private static ComandaService instance;
	private MenuService menuService = MenuService.getInstance();
	private EmpleadoService empleadoService = EmpleadoService.getInstance();
	private MesaService mesaService = MesaService.getInstance();
	private ConsumibleService consumibleService = ConsumibleService.getInstance();

	private List<Comanda> comandas = new ArrayList<Comanda>();

	private ComandaService() {
	}

	public synchronized static ComandaService getInstance() {
		if (instance == null) {
			instance = new ComandaService();
		}

		return instance;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void crearComanda(String tipoMenu, Integer numeroMesa, Integer legajoMozo, Integer legajoCocinero,
			FormaPago formaPago) {

		Menu menu = menuService.buscarMenuPorTipo(tipoMenu);
		Mesa mesa = mesaService.buscarMesaPorNumero(numeroMesa);
		Mozo mozo = (Mozo) empleadoService.buscarEmpleadoPorLegajo(legajoMozo);
		Cocinero cocinero = (Cocinero) empleadoService.buscarEmpleadoPorLegajo(legajoCocinero);
		Integer id = obtenerUltimoNumero();

		comandas.add(new Comanda(id, menu, mesa, mozo, cocinero, formaPago));
	}

	public void agregarConsumible(Integer idComanda, String nombre) {

		Consumible consumible = consumibleService.buscarConsumiblePorNombre(nombre);
		Comanda comanda = buscarComandaPorId(idComanda);

		comanda.addConsumible(consumible);

	}

	public void calcularTotal(Comanda comanda, FormaPago formaPago) {

		Double precioTotal = 0.0;

		for (Consumible consumible : comanda.getConsumibles()) {

			precioTotal = precioTotal + consumible.getPrecio();

			System.out.println(consumible);
		}

		System.out.println(precioTotal);

	}

	private Integer obtenerUltimoNumero() {
		Integer resultado = null;
		int numero = 0;
		int mayor = 0;

		for (int i = 0; i < comandas.size(); i++) {

			numero = comandas.get(i).getId();

			if (numero > mayor) {

				mayor = numero;
			}

			resultado = mayor;
		}

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
}
