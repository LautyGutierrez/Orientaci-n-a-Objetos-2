package ar.edu.unlp.info.oo2.ejercicio_19;

public class Arquero extends Personaje{
	public Arquero(String name) {
		super(name);
		this.arma = new Arco();
		this.armadura = new ArmaduraDeCuero();
		this.habilidad = new CombateADistancia();
	}
}
