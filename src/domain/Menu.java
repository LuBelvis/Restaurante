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

	public String getTipoMenu() {
		return tipoMenu;
	}
	
	//métodos
	
	//public void mostrarBebidas();
	//public void mostrarPlatos();

}
