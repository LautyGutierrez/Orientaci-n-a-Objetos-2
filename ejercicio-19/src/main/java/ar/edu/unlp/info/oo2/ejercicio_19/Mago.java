package ar.edu.unlp.info.oo2.ejercicio_19;

public class Mago extends Personaje{
	public Mago(String name) {
		super(name);
		this.arma = new BastonMagico();
		this.armadura = new ArmaduraDeCuero();
		this.habilidad = new Magia();
	}
}
