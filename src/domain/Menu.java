package domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<Consumible> consumibles;
	private String tipoMenu; // ejecutivo,mediodia,noche

	public Menu(String tipoMenu, List<Consumible> consumibles) {
		this.tipoMenu = tipoMenu;
		this.consumibles = consumibles;
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

	public void mostrarMenu(Menu menu) {
		StringBuilder str = new StringBuilder();
		str.append("Menu");
		str.append("\n");
		str.append("tipo : ");
		str.append(menu.getTipoMenu());
		str.append("\n");
		str.append("consumibles: ");
		str.append(this.getConsumibles());// debe traer sólo los consumibles del tipo de Menu
		str.append("\n");
		System.out.println(str.toString());
	}

}
