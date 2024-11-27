package ar.edu.unlp.info.oo2.ejercicio_6;

import java.util.List;
import java.util.ArrayList;

public class Mixta extends Topografia{
	private List<Topografia> hijos;
	
	public Mixta() {
		hijos = new ArrayList<Topografia>();
	}
	
	public void agregarTopografia(Topografia t) {
		if(this.hijos.size() < 4) hijos.add(t);
	}
	
	public double calcularProporcionDeAgua() {
		if(hijos.size() != 4) return 0;
		else return  hijos.stream().mapToDouble(x -> x.calcularProporcionDeAgua()).sum() / 4;
	}
	
	public boolean equals(Topografia t) {
		return t.equalsMixta(this);
	}
	
	public boolean equalsSimple(Topografia t) {
		return false;
	}
	
	public boolean equalsMixta(Mixta m) {
		return this.hijos.equals(m.getHijos());
	}
	
	public List<Topografia> getHijos() {
		return this.hijos;
	}
}
