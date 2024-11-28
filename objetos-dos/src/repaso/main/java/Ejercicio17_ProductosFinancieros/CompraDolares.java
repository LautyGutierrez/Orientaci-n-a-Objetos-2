package Ejercicio17_ProductosFinancieros;

public class CompraDolares extends ProductoFinanciero{
	private final double valorCompra = 1230;
	
	public CompraDolares() {
		super();
	}
	
	public double retornoInversion(double monto) {
		return monto;
	}
}
