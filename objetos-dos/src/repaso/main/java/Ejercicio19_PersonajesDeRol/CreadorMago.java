package Ejercicio19_PersonajesDeRol;

public class CreadorMago {
	public Personaje crear(String nombre) {
		return new Personaje(nombre, new ArmaduraCuero(), new BastonMagico(), "A distancia");
	}
}
