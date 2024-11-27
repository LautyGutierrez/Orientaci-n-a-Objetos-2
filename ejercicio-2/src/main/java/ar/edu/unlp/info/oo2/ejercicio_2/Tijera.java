package ar.edu.unlp.info.oo2.ejercicio_2;

public class Tijera extends Opcion{
	public Tijera() {
		super("Tijera");
	}
	
	public String jugar(Opcion rival) {
		return rival.jugarContraTijera();
	}
	
	public String jugarContraPapel() {
		return this.tijeraVSPapel() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraTijera() {
		return "Empate";
	}
	
	public String jugarContraPiedra() {
		return this.piedraVSTijera() + "¡¡¡PERDÍ!!!";
	}
}
