package domain;

import java.util.List;

public class Menu {

	private List<Consumible> consumibles;
	private String tipoMenu;

	public Menu(List<Consumible> consumibles, String tipoMenu) {
		this.consumibles = consumibles;
		this.tipoMenu = tipoMenu;
	}

	public List<Consumible> getConsumibles() {
		return consumibles;
	}

	public String getTipoMenu() {
		return tipoMenu;
	}

	public void setConsumibles(List<Consumible> consumibles) {
		this.consumibles = consumibles;
	}

	public void setTipoMenu(String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}

	public void addConsumible(Consumible consumible) {
		consumibles.add(consumible);
	}

}
