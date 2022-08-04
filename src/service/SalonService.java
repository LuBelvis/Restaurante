package service;

import domain.Empleado;
import domain.Comanda;
import domain.Menu;
import domain.Mesa;
import domain.Salon;

public class SalonService {

	private static SalonService instance;
	MenuService menuService = MenuService.getInstance();
	MesaService mesaService = MesaService.getInstance();
	EmpleadoService empleadoService = EmpleadoService.getInstance();
	ComandaService comandaService = ComandaService.getInstance();
	CocineroService cocineroService = CocineroService.getInstance();

	Salon salon = new Salon();

	private SalonService() {
	}

	public static SalonService getInstance() {
		if (instance == null) {
			instance = new SalonService();
		}

		return instance;
	}

	public void crearSalon() {

		new Salon(menuService.getMenues(), mesaService.getMesas(), empleadoService.getEmpleados(),
				comandaService.getComandas());
	}

	public void agregarMesa(Integer numeroMesa) {
		Mesa mesa = mesaService.buscarMesaPorNumero(numeroMesa);
		salon.setMesas(mesa);
	}

	public void borrarMesa(Mesa mesa) {
		salon.getMesas().remove(mesa);
		System.out.println("Se borró la mesa: " + mesa);
	}

	public void agregarMenu(Integer idMenu) {
		Menu menu = menuService.buscarMenuPorId(idMenu);
		salon.setMenues(menu);
	}

	public void agregarEmpleados(Integer legajo) {

		Empleado empleado = empleadoService.buscarEmpleadoPorLegajo(legajo);

		salon.setEmpleados(empleado);

		System.out.println(empleado);

	}

	public void agregarComanda(Integer id) {

		Comanda comanda = comandaService.buscarComandaPorId(id);

		salon.setComandas(comanda);

	}

	public Integer comandasPorCocinero(Integer legajo) {
		Integer pedidos = 0;

		for (Comanda comanda : comandaService.getComandas()) {
			if (comanda.getCocinero().getLegajo() == legajo) {
				pedidos++;
			}
		}
		cocineroService.mostrar(legajo);
		return pedidos;
	}

	public Comanda comandasConMasConsumibles() {

		Comanda mayor = null;

		for (Comanda comanda : comandaService.getComandas()) {

			if (mayor == null || comanda.getConsumibles().size() > mayor.getConsumibles().size()) {
				mayor = comanda;
			}
		}
		System.out.println(mayor);
		return mayor;

	}

	public void liberarMesa(Integer numeroMesa) {
		mesaService.liberarMesa(numeroMesa);
	}
}
