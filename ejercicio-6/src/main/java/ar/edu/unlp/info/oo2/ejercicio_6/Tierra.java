package ar.edu.unlp.info.oo2.ejercicio_6;

public class Tierra extends Topografia{
	public Tierra() {
		
	}
	
	public double calcularProporcionDeAgua() {
		return 0;
	}
	
	public boolean equals(Topografia t) {
		return t.equalsSimple(this);
	}
	
	public boolean equalsSimple(Topografia t) {
		return this.calcularProporcionDeTierra() == t.calcularProporcionDeTierra();
	}
	
	public boolean equalsMixta(Mixta m) {
		return false;
	}
}
