package Ejercicio17_ProductosFinancieros;

public class PlazoFijo extends ProductoFinanciero{
	private int cantidadDias;
	private double interes;
	
	public PlazoFijo(int cant, double interes) {
		super();
		this.cantidadDias = cant;
		this.interes = interes;
	}
	
	public double retornoInversion(double monto) {
		return monto;
	}
}
