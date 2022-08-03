package domain;

public class Matematica {
	
	public static Double restarPorcentaje(Double valor, Double porcentaje) {
		Double resultado = 0.0;
		Double delta = (valor.doubleValue() * porcentaje.doubleValue()/100);
		resultado = valor - delta;
		return resultado;
	}
}
