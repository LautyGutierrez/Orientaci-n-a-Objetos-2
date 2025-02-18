package Ejercicio17_ProductosFinancieros;

import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{
	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado(List<ProductoFinanciero> productos) {
		super();
		this.productos = productos;
	}
	
	public double retornoInversion(double monto) {
		return this.productos.stream().mapToDouble(p -> p.retornoInversion(monto)).sum();
	}
}
