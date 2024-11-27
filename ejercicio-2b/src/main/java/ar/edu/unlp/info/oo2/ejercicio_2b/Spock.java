package ar.edu.unlp.info.oo2.ejercicio_2b;

public class Spock extends Opcion{
	public Spock() {
		super("Spock");
	}
	
	public String jugarContraSpock() {
		return "Empate";
	}
	
	public String jugarContraLagarto() {
		return this.lagartoVSSpock() + "¡¡¡PERDÍ!!!";
	}
	
	public String jugarContraTijera() {
		return this.tijeraVSSpock() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraPiedra() {
		return this.piedraVSSpock() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraPapel() {
		return this.spockVSPapel() + "¡¡¡PERDÍ!!!";
	}
	
	public String jugar(Opcion rival) {
		return rival.jugarContraSpock();
	}
}
