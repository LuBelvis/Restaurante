package service;

import java.util.ArrayList;
import java.util.List;

import domain.Mesa;

public class MesaService {

	private static MesaService instance;
	private List<Mesa> mesas = new ArrayList<Mesa>();

	private MesaService() {
	}

	public static MesaService getInstance() {
		if (instance == null) {
			instance = new MesaService();
		}

		return instance;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public Mesa crearMesa(Integer cantidadComensales) {

		Integer numero = null;

		if (obtenerUltimoNumero() != null) {

			numero = obtenerUltimoNumero();
		} else {

			numero = 1;
		}

		Mesa mesa = new Mesa(numero, cantidadComensales);

		mesas.add(mesa);

		return mesa;
	}

	public void ocuparMesa(Integer numeroMesa) {
		Mesa mesa = buscarMesaPorNumero(numeroMesa);
		mesa.setOcupado(true);
	}

	public void liberarMesa(Integer numeroMesa) {
		Mesa mesa = buscarMesaPorNumero(numeroMesa);
		mesa.setOcupado(false);
	}
	
	public boolean estado(Mesa mesa) {
		return mesa.isOcupado();
	}

	public Mesa buscarMesaPorNumero(Integer numeroMesa) {

		Mesa resultado = null;

		for (Mesa mesa : mesas) {

			if (mesa.getNumero() == numeroMesa) {

				resultado = mesa;
			}
		}

		return resultado;
	}

	private Integer obtenerUltimoNumero() {
		Integer resultado = 1;
		int numero = 0;
		int mayor = 0;

		for (int i = 0; i < mesas.size(); i++) {

			numero = mesas.get(i).getNumero();

			if (numero > mayor) {

				mayor = numero;
			}

			resultado = mayor+1;
		}

		return resultado;
	}
	
	public boolean verEstado(Mesa mesa) {
		return mesa.isOcupado();
	}
	
	public void mostrar(Integer numeroMesa) {
		Mesa mesa = buscarMesaPorNumero(numeroMesa);
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
