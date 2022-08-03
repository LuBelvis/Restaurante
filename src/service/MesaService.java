package service;

import java.util.ArrayList;
import java.util.List;

import domain.Mesa;

public class MesaService {

	private static MesaService instance;
	private List<Mesa> mesas = new ArrayList<Mesa>();

	private MesaService() {
	}

	public synchronized static MesaService getInstance() {
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

	public void ocuparMesa(Mesa mesa) {
		mesa.setOcupado(true);
	}

	public void liberarMesa(Mesa mesa) {
		mesa.setOcupado(false);
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
		Integer resultado = null;
		int numero = 0;
		int mayor = 0;

		for (int i = 0; i < mesas.size(); i++) {

			numero = mesas.get(i).getNumero();

			if (numero > mayor) {

				mayor = numero;
			}

			resultado = mayor;
		}

		return resultado;
	}
}
