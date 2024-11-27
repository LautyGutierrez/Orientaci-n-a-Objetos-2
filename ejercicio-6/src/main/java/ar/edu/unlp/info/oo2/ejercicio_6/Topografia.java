package ar.edu.unlp.info.oo2.ejercicio_6;

public abstract class Topografia {
	public Topografia() {
		
	}
	
	public abstract double calcularProporcionDeAgua();
	public double calcularProporcionDeTierra() {
		return 1 - this.calcularProporcionDeAgua();
	}
	public abstract boolean equals(Topografia t);
	public abstract boolean equalsSimple(Topografia t);
	public abstract boolean equalsMixta(Mixta m);
}
