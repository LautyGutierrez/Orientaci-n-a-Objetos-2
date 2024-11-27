package ar.edu.unlp.info.oo2.ejercicio_2b;

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
	
	public String jugarContraLagarto() {
		return this.tijeraVSLagarto() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraSpock() {
		return this.tijeraVSSpock() + "¡¡¡PERDÍ!!!";
	}
}
