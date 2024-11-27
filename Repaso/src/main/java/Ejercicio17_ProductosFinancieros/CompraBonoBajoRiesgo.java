package Ejercicio17_ProductosFinancieros;

public class CompraBonoBajoRiesgo extends ProductoFinanciero{
	private int parking;
	private final double variacion = 0.1;
	
	public CompraBonoBajoRiesgo(int parking) {
		super();
		this.parking = parking;
	}
	
	public double retornoInversion(double monto) {
		return monto;
	}
}
