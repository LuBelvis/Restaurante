package domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<Consumible> consumibles = new ArrayList <Consumible>();
	private String tipoMenu; //ejecutivo,mediodia,noche
	
	public Menu (String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}

	public List<Consumible> getConsumibles() {
		return consumibles;
	}
	
	public void setConsumibles(List<Consumible> consumibles) {
			this.consumibles = consumibles;
		}
	
	public String getTipoMenu() {
		return tipoMenu;
	}
	
	//métodos
	
//	public void mostrarPlato(Consumible plato) {
//		StringBuilder str = new StringBuilder();
//		str.append("Plato");
//		str.append("\n");
//		str.append("nombre : ");
//		str.append(plato.getNombre());
//		str.append("\n");
//		str.append("precio: ");
//		str.append(plato.getPrecio());
//		str.append("\n");
//		System.out.println(str.toString());
//	}
	
	
	
	
	//public void mostrarBebidas(); ////NO sé si funciona así
//	public void mostrarBebidas() {
//		for (Consumible bebida : consumibles) {	
//			if (bebida instanceof Consumible) {
//				if (((Consumible) bebida).toString() != null) {
//					for (int i = 0; i < consumibles.size(); i++) {
//				System.out.println(consumibles.get(i));
//		}
//				}
//				
//			}
//			
//		}
//		System.out.println("no anda ma'" + consumibles.toString());
//	}
//	public void mostrarPlatos() {
//	for (Consumible plato : consumibles) {	
//		if (plato instanceof Consumible) {
//			if (((Consumible) plato).toString() != null) {
//				for (int i = 0; i < consumibles.size(); i++) {
//			System.out.println(consumibles.get(i));
//	}
//			}
//			
//		}
//		
//	}
//	System.out.println("no anda ma'");
//}
	

}
