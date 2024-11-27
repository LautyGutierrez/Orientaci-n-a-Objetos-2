package ar.edu.unlp.info.oo2.ejercicio_19;

public class Guerrero extends Personaje{
	public Guerrero(String name) {
		super(name);
		this.arma = new Espada();
		this.armadura = new ArmaduraDeHierro();
		this.habilidad = new CombateCuerpoACuerpo();
	}
}
