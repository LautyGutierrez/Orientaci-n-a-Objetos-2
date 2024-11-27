package Ejercicio6_Topografias;

public abstract class Simple extends Topografia{
	public Simple() {
		
	}
	
	public boolean equals(Topografia t) {
		return t.equalsSimple(this);
	}
	
	public boolean equalsSimple(Topografia t) {
		return this.proporcionDeAgua() == t.proporcionDeAgua();
	}
	
	public boolean equalsMixta(Mixta m) {
		return false;
	}
}
