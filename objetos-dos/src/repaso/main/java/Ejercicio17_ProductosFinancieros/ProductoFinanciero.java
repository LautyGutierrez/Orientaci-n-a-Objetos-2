package Ejercicio17_ProductosFinancieros;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
	protected LocalDate fechaOperacion;
	
	public ProductoFinanciero() {
		this.fechaOperacion = LocalDate.now();
	}
	
	public abstract double retornoInversion(double monto);
}
