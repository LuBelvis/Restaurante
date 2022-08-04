package domain;

import java.util.ArrayList;
import java.util.List;
import domain.TipoMenu;


public class Menu {

	private Integer idMenu;
	private List<Consumible> consumibles = new ArrayList<Consumible>();
	private TipoMenu tipoMenu;

	public Menu(Integer idMenu, TipoMenu tipoMenu) {
		this.idMenu = idMenu;
		this.tipoMenu = tipoMenu;
	}

	public Integer getIdMenu() {
		return idMenu;
	}
	public List<Consumible> getConsumibles() {
		return consumibles;
	}

	public TipoMenu getTipoMenu() {
		return tipoMenu;
	}
	
	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public void setConsumibles(List<Consumible> consumibles) {
		this.consumibles = consumibles;
	}

	public void setTipoMenu(TipoMenu tipoMenu) {
		this.tipoMenu = tipoMenu;
	}

	public void addConsumible(Consumible consumible) {
		consumibles.add(consumible);
	}

}
