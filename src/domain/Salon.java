package domain;

import java.util.ArrayList;
import java.util.List;

	public class Salon {
	
		private static List<Menu> menues = new ArrayList<Menu>();
		private List<Mesa> mesas= new ArrayList<Mesa>();
		private List<Empleado> empleados = new ArrayList<Empleado>();
		private List<Comanda> comandas = new ArrayList<Comanda>();
		
		public static List<Menu> getMenues() {
			return menues;
		}
		public void setMenues(List<Menu> menues) {
			this.menues = menues;
		}
		public List<Mesa> getMesas() {
			return mesas;
		}
		public void setMesas(List<Mesa> mesas) {
			this.mesas = mesas;
		}
		public List<Empleado> getEmpleados() {
			return empleados;
		}
		public void setEmpleados(List<Empleado> empleados) {
			this.empleados = empleados;
		}
		public List<Comanda> getComandas() {
			return comandas;
		}
		public void setComandas(List<Comanda> comandas) {
			this.comandas = comandas;
		}
	
		









}
