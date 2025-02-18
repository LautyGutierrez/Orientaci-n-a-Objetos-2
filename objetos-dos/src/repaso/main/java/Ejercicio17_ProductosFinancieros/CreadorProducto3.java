package Ejercicio17_ProductosFinancieros;

import java.util.Arrays;

public class CreadorProducto3 extends Factory{
	public ProductoCombinado crear(Membresia m) {
		return new ProductoCombinado(Arrays.asList(
				new CompraBonoAltoRiesgo(m.getParking()),
				new CompraBonoBajoRiesgo(m.getParking()),
				new PlazoFijo(m.getPlazo(), m.getTasa())));
	}
}
