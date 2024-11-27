package Ejercicio19_PersonajesDeRol;

public class CreadorArquero implements Creador{
	public Personaje crear(String nombre) {
		return new Personaje(nombre, new ArmaduraCuero(), new Arco(), "A distancia");
	}
}
