package Ejercicio22_SubteWay;

public class Componente {
	private String categoria;
	private String tipo;
	private double precio;
	
	public Componente(String cat, String tipo, double precio) {
		this.categoria = cat;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}

}
