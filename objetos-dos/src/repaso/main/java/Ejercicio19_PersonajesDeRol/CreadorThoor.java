package Ejercicio19_PersonajesDeRol;

public class CreadorThoor implements Creador{
	public Personaje crear(String nombre) {
		return new Personaje(nombre, new ArmaduraHierro(), new Martillo(), "Lanzar rayos a distancia");
	}
}
