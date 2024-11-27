package ar.edu.unlp.info.oo2.ejercicio_19;

public class Personaje {
	protected String nombre;
	protected int vida;
	protected Arma arma;
	protected Armadura armadura;
	protected Habilidad habilidad;
	
	public Personaje(String name) {
		this.nombre = name;
		this.vida = 100;
	}
	
	
}
