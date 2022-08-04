package test;

import service.EmpleadoService;

public class EmpleadoHelper {

	public static void crearEmpleadoNuevo() {
		EmpleadoService empleadoService = EmpleadoService.getInstance();

			empleadoService.registrarMozo("Sandro", 360, 20150425);
			empleadoService.registrarMozo("Camila", 532, 20200730);
			empleadoService.registrarCocinero("Germán", 450, 20180502, 5);
			empleadoService.registrarCocinero("Damián", 722, 20210810, 3);
			empleadoService.registrarChef("Francis", 123, 20141020, "chef internacional");
		
	}
}
