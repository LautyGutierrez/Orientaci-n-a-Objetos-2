package Ejercicio19_PersonajesDeRol;

public class BastonMagico implements Arma{
	public int atacar(Armadura a) {
		return a.recibirBaston();
	}
}
