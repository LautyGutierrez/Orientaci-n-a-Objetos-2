package ar.edu.unlp.info.oo2.ejercicio_6;

public class Agua extends Topografia{
	public Agua() {
		
	}
	
	public double calcularProporcionDeAgua() {
		return 1;
	}
	
	public boolean equals(Topografia t) {
		return t.equalsSimple(this);
	}
	
	public boolean equalsSimple(Topografia t) {
		return this.calcularProporcionDeAgua() == t.calcularProporcionDeAgua();
	}
	
	public boolean equalsMixta(Mixta m) {
		return false;
	}
}
