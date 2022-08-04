package domain;

import java.util.ArrayList;
import java.util.List;

public class Salon {

	private List<Menu> menues = new ArrayList<Menu>();
	private List<Mesa> mesas = new ArrayList<Mesa>();
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private List<Comanda> comandas = new ArrayList<Comanda>();

	public Salon() {
		
	}
	
	public Salon(List<Menu> menues, List<Mesa> mesas, List<Empleado> empleados, List<Comanda> comandas) {
		this.menues = menues;
		this.mesas = mesas;
		this.empleados = empleados;
		this.comandas = comandas;
	}

	public List<Menu> getMenues() {
		return menues;
	}

	public void setMenues(Menu menu) {
		menues.add(menu);
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(Mesa mesa) {
		mesas.add(mesa);
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleado) {
		empleados.add(empleado);
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(Comanda comanda) {
		comandas.add(comanda);
	}

}
