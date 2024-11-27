package Ejercicio19_PersonajesDeRol;

public class CreadorGuerrero implements Creador{
	public Personaje crear(String nombre) {
		return new Personaje(nombre, new ArmaduraAcero(), new Espada(), "Cuerpo a cuerpo");
	}
}
