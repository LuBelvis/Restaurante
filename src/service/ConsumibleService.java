package service;

import java.util.ArrayList;
import java.util.List;
import domain.Bebida;
import domain.Consumible;
import domain.Plato;

public class ConsumibleService {

	private static ConsumibleService instance;
	private List<Consumible> consumibles = new ArrayList<Consumible>();

	private ConsumibleService() {
	}

	public static ConsumibleService getInstance() {
		if (instance == null) {
			instance = new ConsumibleService();
		}

		return instance;
	}

	public void crearPlato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {

		consumibles.add(new Plato(nombre, precio, descripcion, aptoVegano, aptoCeliaco));
	}

	public void crearBebida(String nombre, Double precio, Double tamanioCc, Boolean alcoholSi) {

		consumibles.add(new Bebida(nombre, precio, tamanioCc, alcoholSi));
	}

	public String modificarPrecioPlato(String nombre, Double precio) {

		Double nuevoPrecio = null;
		String mensaje = null;

		for (Consumible plato : consumibles) {

			if (plato.getNombre().equals(nombre)) {

				plato.setPrecio(precio);

				nuevoPrecio = plato.getPrecio();

				mensaje = "El nuevo precio del consumible " + nombre + " es: " + nuevoPrecio;
			}
		}
		return mensaje;
	}

	public String modificarPrecioBebida(String nombre, Double precio) {

		Double nuevoPrecio = null;
		String mensaje = null;

		for (Consumible bebida : consumibles) {

			if (bebida.getNombre().equals(nombre)) {

				bebida.setPrecio(precio);

				nuevoPrecio = bebida.getPrecio();

				mensaje = "El nuevo precio del consumible " + nombre + " es: " + nuevoPrecio;
			}
		}
		return mensaje;
	}

	public void verContenidoConsumiblesDisponibles() {

		for (Consumible consumible : consumibles) {

			System.out.println(consumible);
		}
	}
	
	public List<Consumible> devolverListaConsumibles() {

		for (Consumible consumible : consumibles) {

			System.out.println(consumible);
		}
		return consumibles;
	}

	public String borrarPlato(String nombre) {

		String mensaje = null;

		for (Consumible plato : consumibles) {

			if (plato.getNombre().equals(nombre)) {

				consumibles.remove(plato);

				mensaje = "Se borró el plato: " + nombre;
			}
			mensaje = "No se encuentra el plato: " + nombre;
		}

		return mensaje;
	}

	public String borrarBebida(String nombre) {

		String mensaje = null;

		for (Consumible bebida : consumibles) {

			if (bebida.getNombre().equals(nombre)) {

				consumibles.remove(bebida);

				mensaje = "Se borró la bebida: " + nombre;
			}

			mensaje = "No se encuentra el plato: " + nombre;
		}

		return mensaje;
	}

	public Consumible buscarConsumiblePorNombre(String nombre) {
		Consumible resultado = null;

		for (Consumible consumible : consumibles) {

			if (consumible.getNombre().equalsIgnoreCase(nombre)) {

				resultado = consumible;
			}
		}

		return resultado;
	}


}
