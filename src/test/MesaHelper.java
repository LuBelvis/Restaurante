package test;

import domain.Mesa;
import service.MesaService;

public class MesaHelper {

	public static Mesa crearMesaX2(MesaService service) {
		return service.crearMesa(2);
	}
	
	public static Mesa crearMesaX4(MesaService service) {
		return service.crearMesa(4);
	}
	
	public static Mesa crearMesaX6(MesaService service) {
		return service.crearMesa(6);
	}
}
