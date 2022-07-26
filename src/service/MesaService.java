package service;

import domain.Mesa;

public class MesaService {

	Integer numero;
	
	public MesaService() {
		numero = 0;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public Mesa crearMesa(Integer cantidadComensales) {
		numero ++;
		return new Mesa(numero, cantidadComensales);
	}
	
	public void ocuparMesa(Mesa mesa) {
		mesa.setOcupado(true);
	}
	
	public void liberarMesa(Mesa mesa) {
		mesa.setOcupado(false);
	}
	
	public boolean verEstado(Mesa mesa) {
		return mesa.isOcupado();
	}
	
	public void mostrar(Mesa mesa) {
		StringBuilder str = new StringBuilder();
		str.append("Mesa");
		str.append("\n");
		str.append("número : ");
		str.append(mesa.getNumero());
		str.append("\n");
		str.append("cantidad comensales: ");
		str.append(mesa.getCantidadComensales());
		str.append("\n");
		str.append("ocupada: ");
		str.append(mesa.isOcupado());
		str.append("\n");
		System.out.println(str.toString());
	}
}
