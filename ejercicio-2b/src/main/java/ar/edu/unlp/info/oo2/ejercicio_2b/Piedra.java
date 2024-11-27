package ar.edu.unlp.info.oo2.ejercicio_2b;

public class Piedra extends Opcion{
	public Piedra() {
		super("Piedra");
	}
	
	public String jugar(Opcion rival) {
		return rival.jugarContraPiedra();
	}
	
	public String jugarContraPapel() {
		return this.piedraVSPapel() + "¡¡¡PERDÍ!!!";
	}
	
	public String jugarContraTijera() {
		return this.piedraVSTijera() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraPiedra() {
		return "Empate";
	}
	
	public String jugarContraLagarto() {
		return this.piedraVSLagarto() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraSpock() {
		return this.piedraVSSpock() + "¡¡¡PERDÍ!!!";
	}
}
