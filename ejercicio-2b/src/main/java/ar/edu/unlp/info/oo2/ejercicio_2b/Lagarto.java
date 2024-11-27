package ar.edu.unlp.info.oo2.ejercicio_2b;

public class Lagarto extends Opcion{
	public Lagarto() {
		super("Lagarto");
	}
	
	public String jugar(Opcion rival) {
		return rival.jugarContraLagarto();
	}
	
	public String jugarContraPapel() {
		return this.lagartoVSPapel() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraTijera() {
		return this.tijeraVSLagarto() + "¡¡¡PERDÍ!!!";
	}
	
	public String jugarContraPiedra() {
		return this.piedraVSLagarto() + "¡¡¡PERDÍ!!!";
	}
	
	public String jugarContraSpock() {
		return this.lagartoVSSpock() + "¡¡¡GANÉ!!!";
	}
	
	public String jugarContraLagarto() {
		return "Empate";
	}
}
