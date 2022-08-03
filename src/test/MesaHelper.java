package test;

import domain.Mesa;
import service.MesaService;

public class MesaHelper {

	MesaService mesaService = MesaService.getInstance();

	public static Mesa crearMesaX2(MesaService mesaService) {
		return mesaService.crearMesa(2);
	}

	public static Mesa crearMesaX4(MesaService mesaService) {
		return mesaService.crearMesa(4);
	}

	public static Mesa crearMesaX6(MesaService mesaService) {
		return mesaService.crearMesa(6);
	}
}
