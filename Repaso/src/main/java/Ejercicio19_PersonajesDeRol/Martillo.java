package Ejercicio19_PersonajesDeRol;

public class Martillo implements Arma{
	public int atacar(Armadura a) {
		return a.recibirMartillo();
	}
}
