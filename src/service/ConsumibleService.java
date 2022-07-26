package service;

import domain.Bebida;
import domain.Plato;

public class ConsumibleService {

	//	+ crearPlato()
	//	+ crearBebida()
	//	+ modificarPlato()
	//	+ modificarBebida()
	//	+ borrarPlato()
	//	+ borrarBebida()
	
	
	public Plato crearPlato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {
		return new Plato(nombre, precio, descripcion, aptoVegano, aptoCeliaco);
	}
	
	public Bebida crearBebida(String nombre, Double precio, Double tamanioCc) {
		return new Bebida(nombre, precio, tamanioCc);
	}
	
//	public void modificarPlato(Plato plato) {
//		
//	}
}
