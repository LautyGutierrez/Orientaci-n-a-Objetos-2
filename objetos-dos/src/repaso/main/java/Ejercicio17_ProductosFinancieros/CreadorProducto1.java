package Ejercicio17_ProductosFinancieros;

import java.util.Arrays;

public class CreadorProducto1 extends Factory{
	public ProductoCombinado crear(Membresia m) {
		return new ProductoCombinado(Arrays.asList(new CompraDolares(), new PlazoFijo(m.getPlazo(), m.getTasa()), new CompraPesos()));
	}
}
