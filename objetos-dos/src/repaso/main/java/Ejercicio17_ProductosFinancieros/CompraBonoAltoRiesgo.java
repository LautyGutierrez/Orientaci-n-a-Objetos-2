package Ejercicio17_ProductosFinancieros;

public class CompraBonoAltoRiesgo extends ProductoFinanciero{
	private int parking;
	private final double variacion = 0.7;
	
	public CompraBonoAltoRiesgo(int parking) {
		super();
		this.parking = parking;
	}
	
	public double retornoInversion(double monto) {
		return monto;
	}
}
