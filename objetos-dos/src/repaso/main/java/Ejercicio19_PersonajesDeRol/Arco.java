package Ejercicio19_PersonajesDeRol;

public class Arco implements Arma{
	public int atacar(Armadura a) {
		return a.recibirArco();
	}
}
