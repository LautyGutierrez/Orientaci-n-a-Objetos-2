package ar.edu.unlp.info.oo2.ejercicio_2;

public class Papel extends Opcion{
	
	public Papel() {
		super("Papel");
	}
	
	public String jugar(Opcion rival) {
		return rival.jugarContraPapel();
	}
	
	public String jugarContraPapel() {
		return "Empate";
	}
	
	public String jugarContraTijera() {
		return this.tijeraVSPapel() + "¡¡¡PERDÍ!!!";
	}
	
	public String jugarContraPiedra() {
		return this.piedraVSPapel() + "¡¡¡GANÉ!!!";
	}
}
