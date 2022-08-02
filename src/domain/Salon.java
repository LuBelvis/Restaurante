package domain;

import java.util.ArrayList;
import java.util.List;

	public class Salon {
	
		private static List<Menu> menues = new ArrayList<Menu>();
		private static List<Mesa> mesas= new ArrayList<Mesa>();
		private static List<Empleado> empleados = new ArrayList<Empleado>();
		private static List<Comanda> comandas = new ArrayList<Comanda>();
		
		public static List<Menu> getMenues() {
			return menues;
		}
		public void setMenues(List<Menu> menues) {
			Salon.menues = menues;
		}
		public static List<Mesa> getMesas() {
			return mesas;
		}
		public void setMesas(List<Mesa> mesas) {
			Salon.mesas = mesas;
		}
		public static List<Empleado> getEmpleados() {
			return empleados;
		}
		public void setEmpleados(List<Empleado> empleados) {
			Salon.empleados = empleados;
		}
		public static List<Comanda> getComandas() {
			return comandas;
		}
		public void setComandas(List<Comanda> comandas) {
			Salon.comandas = comandas;
		}
	
		









}
