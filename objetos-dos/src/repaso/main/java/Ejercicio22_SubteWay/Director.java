package Ejercicio22_SubteWay;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Sanguche crearSanguche() {
		this.builder.nuevoSanguche();
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();
		return this.builder.devolverSanguche();
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
}
