package Ejercicio22_SubteWay;

public class BuilderVegetariano extends Builder{

	public BuilderVegetariano() {
		super();
	}
	
	public void agregarPan() {
		this.sanguche.agregarComponente(new Componente("Pan", "con semillas", 120));
	}

	public void agregarAderezo() {
		
	}
	
	public void agregarPrincipal() {
		this.sanguche.agregarComponente(new Componente("Principal", "Provoleta grillada", 200));
	}
	
	public void agregarAdicional() {
		this.sanguche.agregarComponente(new Componente("Adicional", "Berenjenas al escabeche", 100));
	}

}
