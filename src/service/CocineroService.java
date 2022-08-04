package service;

import domain.Cocinero;
import domain.Comanda;
import domain.Empleado;
import domain.Salon;


 class CocineroService {
	 
	private static CocineroService instance;
	private ComandaService comandaService = ComandaService.getInstance();
	private EmpleadoService empleadoService = EmpleadoService.getInstance();
	
	private CocineroService() {
	}

	public static CocineroService getInstance() {
		if (instance == null) {
			instance = new CocineroService();
		}
		
		return instance;
	}
	
	public void recibePedido(Integer IdComanda) {
		
		Comanda comanda = comandaService.buscarComandaPorId(IdComanda);
	
		comanda.getCocinero().setTienePedido(true);	
	}	
	
	public void despacharPedido(Integer IdComanda) {
		
		Comanda comanda = comandaService.buscarComandaPorId(IdComanda);
		
		comanda.getCocinero().setTienePedido(false);
	}
	
	
	public void mostrar(Integer legajo) {
		Empleado cocinero = (Cocinero)empleadoService.buscarEmpleadoPorLegajo(legajo);
		StringBuilder str = new StringBuilder();
		str.append("Cocinero");
		str.append("\n");
		str.append("nombre : ");
		str.append(cocinero.getNombre());
		str.append("\n");
		str.append("legajo: ");
		str.append(cocinero.getLegajo());
		str.append("\n");
		str.append("pedidos: ");
		str.append(((Cocinero) cocinero).getTienePedido());
		str.append("\n");
		System.out.println(str.toString());
	}
	
	
	
	
	
	
	
}
