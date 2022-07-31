package service;

import java.util.ArrayList;
import java.util.List;

import domain.Bebida;
import domain.Consumible;
import domain.Mesa;
import domain.Plato;

public class ConsumibleService {

	//	+ crearPlato()
	//	+ crearBebida()
	//	+ modificarPlato() //para poder cambiar el precio
	//	+ modificarBebida()
	//	+ borrarPlato()
	//	+ borrarBebida()
	private List<Consumible> consumibles = new ArrayList <Consumible>();

	
	public Consumible crearPlato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {
		consumibles.add(new Plato(nombre, precio, descripcion, aptoVegano, aptoCeliaco));
		return new Plato(nombre, precio, descripcion, aptoVegano, aptoCeliaco);		
	}
	
	public Consumible crearBebida(String nombre, Double precio, Double tamanioCc, Boolean alcoholSi) {
		consumibles.add(new Bebida(nombre, precio, tamanioCc, alcoholSi));
		return new Bebida(nombre, precio, tamanioCc, alcoholSi);
	}
	
	public String modificarPrecioPlato(String nombre, Double precio) {
		Double nuevoPrecio = 0.0;
		for (Consumible plato : consumibles) {
			if (plato.getNombre().equals(nombre)) {
				nuevoPrecio = plato.setPrecio(precio);
				
			return "El nuevo precio del consumible " + nombre +  " es: " + nuevoPrecio;
			}
		}
		return null;
	}
	
	public String modificarPrecioBebida(String nombre, Double precio) {
		Double nuevoPrecio = 0.0;
		for (Consumible bebida : consumibles) {
			if (bebida.getNombre().equals(nombre)) {
				nuevoPrecio = bebida.setPrecio(precio);
				
			return "El nuevo precio del consumible " + nombre +  " es: " + nuevoPrecio;
			}
		}
		return null;
	}
	
	public void verContenidoConsumiblesDisponibles() {
		for (int i = 0; i < consumibles.size(); i++) {
			System.out.println(consumibles.get(i));
		}
	}
	
	public String borrarPlato(String nombre) {
		for (Consumible plato : consumibles) {
			if (plato.getNombre().equals(nombre)) {
				consumibles.remove(plato);
				return "Se borró el plato: " + nombre;
			}
		}
		return "No se encuentra el plato: " + nombre;

	}
	
	public String borrarBebida(String nombre) {
		for (Consumible bebida : consumibles) {
			if (bebida.getNombre().equals(nombre)) {			
				consumibles.remove(bebida);
				return "Se borró el plato: " + nombre;
			}
		}
		return "No se encuentra el plato: " + nombre;
	}	

}
