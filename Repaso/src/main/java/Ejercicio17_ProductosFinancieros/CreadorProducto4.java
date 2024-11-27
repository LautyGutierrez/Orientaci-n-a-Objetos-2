package Ejercicio17_ProductosFinancieros;

import java.util.Arrays;

public class CreadorProducto4 extends Factory{
	public ProductoCombinado crear(Membresia m) {
		return new ProductoCombinado(Arrays.asList(
				new CompraBonoAltoRiesgo(m.getParking()),
				new CompraBonoAltoRiesgo(m.getParking()),
				new CompraBonoAltoRiesgo(m.getParking())
				));
	}
}
