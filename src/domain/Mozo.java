package domain;

import java.util.ArrayList;
import java.util.List;

public class Mozo extends Empleado {
	
	private List<Mesa> mesas= new ArrayList<Mesa>();

	public Mozo(String nombre, Integer legajo, Integer fechaDeIngreso) {
		super(nombre, legajo, fechaDeIngreso);
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	
}
