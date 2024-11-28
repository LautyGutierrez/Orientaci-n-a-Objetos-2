package Ejercicio22_SubteWay;

import java.util.List;
import java.util.ArrayList;

public class Sanguche {
	private List<Componente> componentes;
	
	public Sanguche() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public double calcularPrecio() {
		return this.componentes.stream()
				.mapToDouble(c -> c.getPrecio())
				.sum();
	}
	
	public void agregarComponente(Componente c) {
		this.componentes.add(c);
	}

}
